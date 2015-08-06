package com.kuta.just8023.test.redis;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import redis.clients.jedis.Jedis;

public class TestRedis {
	
	private Jedis jedis; 
    
    @Before
    public void setup() {
        //连接redis服务器，127.0.0.1
        jedis = new Jedis("127.0.0.1", 6379);
        //权限认证
        jedis.auth("admin");  
    }
    
    /**
     * redis存储字符串
     */
    @Test
    public void testString() {
        //-----添加数据----------  
        jedis.set("name","kuta");//向key-->name中放入了value-->xinxin  
        System.out.println(jedis.get("name"));//执行结果：xinxin  
        
        jedis.append("name", ".l"); //拼接
        System.out.println(jedis.get("name")); 
        
        jedis.del("name");  //删除某个键
        System.out.println(jedis.get("name"));
        //设置多个键值对
        jedis.mset("name","kuta","age","26","qq","80011355");
        jedis.incr("age"); //进行加1操作
        System.out.println(jedis.get("name") + "-" + jedis.get("age") + "-" + jedis.get("qq"));
        
    }
    
    /**
     * redis操作Map
     */
    @Test
    public void testMap() {
        //-----添加数据----------  
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "kuta");
        map.put("age", "26");
        map.put("qq", "80011355");
        jedis.hmset("user",map);
        //取出user中的name，执行结果:[minxr]-->注意结果是一个泛型的List  
        //第一个参数是存入redis中map对象的key，后面跟的是放入map中的对象的key，后面的key可以跟多个，是可变参数  
        List<String> rsmap = jedis.hmget("user", "name", "age", "qq");
        System.out.println(rsmap);  
  
        //删除map中的某个键值  
        jedis.hdel("user","age");
        System.out.println(jedis.hmget("user", "age")); //因为删除了，所以返回的是null  
        System.out.println(jedis.hlen("user")); //返回key为user的键中存放的值的个数2 
        System.out.println(jedis.exists("user"));//是否存在key为user的记录 返回true  
        System.out.println(jedis.hkeys("user"));//返回map对象中的所有key  
        System.out.println(jedis.hvals("user"));//返回map对象中的所有value 
  
        Iterator<String> iter=jedis.hkeys("user").iterator();  
        while (iter.hasNext()){  
            String key = iter.next();  
            System.out.println(key+":"+jedis.hmget("user",key));  
        }  
    }
    
    /** 
     * jedis操作List 
     */  
    @Test  
    public void testList(){  
        //开始前，先移除所有的内容  
        jedis.del("dbList");  
        System.out.println(jedis.lrange("dbList",0,-1));  
        //先向key dbList中存放三条数据  
        jedis.lpush("dbList","mysql");  
        jedis.lpush("dbList","oracle");  
        jedis.lpush("dbList","mssql");  
        //再取出所有数据jedis.lrange是按范围取出，  
        // 第一个是key，第二个是起始位置，第三个是结束位置，jedis.llen获取长度 -1表示取得所有  
        System.out.println(jedis.lrange("dbList",0,-1));  
        
        jedis.del("dbList");
        jedis.rpush("dbList","mysql");  
        jedis.rpush("dbList","oracle");  
        jedis.rpush("dbList","mssql"); 
        System.out.println(jedis.lrange("dbList",0,-1));
    }  
    
    /** 
     * jedis操作Set 
     */  
    @Test  
    public void testSet(){  
        //添加  
        jedis.sadd("dbSet","mysql");  
        jedis.sadd("dbSet","oracle");  
        jedis.sadd("dbSet","db2");  
        jedis.sadd("dbSet","mssql");
        jedis.sadd("dbSet","sqlserver");  
        //移除noname  
        jedis.srem("dbSet","db2");  
        System.out.println(jedis.smembers("dbSet"));//获取所有加入的value  
        System.out.println(jedis.sismember("dbSet", "mysql"));//判断是否存在
        System.out.println(jedis.srandmember("dbSet"));  
        System.out.println(jedis.scard("dbSet"));//返回集合的元素个数  
    }  
  
    @Test  
    public void test() throws InterruptedException {  
        //jedis 排序  
        //注意，此处的rpush和lpush是List的操作。是一个双向链表（但从表现来看的）  
        jedis.del("a");//先清除数据，再加入数据进行测试  
        jedis.rpush("a", "1");  
        jedis.lpush("a","6");  
        jedis.lpush("a","3");  
        jedis.lpush("a","9");  
        System.out.println(jedis.lrange("a",0,-1));// [9, 3, 6, 1]  
        System.out.println(jedis.sort("a")); //[1, 3, 6, 9]  //输入排序后结果  
        System.out.println(jedis.lrange("a",0,-1));  
    }  
    
    @Test
    public void testRedisPool() {
        RedisUtil.getJedis().set("newname", "中文测试");
        System.out.println(RedisUtil.getJedis().get("newname"));
    }

}
