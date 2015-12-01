package com.kuta.just8023.model;

public class OaUserFamily {
    private Integer id;

    private String userCode;

    private String title;

    private String name;

    private Integer age;

    private String workUnitPosition;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getWorkUnitPosition() {
        return workUnitPosition;
    }

    public void setWorkUnitPosition(String workUnitPosition) {
        this.workUnitPosition = workUnitPosition == null ? null : workUnitPosition.trim();
    }
}