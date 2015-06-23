<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
   <head>
      <title></title>
      <meta http-equiv="Content-Type" content="text/html; charset=utf-8">

      <script type="text/javascript" src="http://dev.ditu.live.com/mapcontrol/mapcontrol.ashx?v=6.2"></script>

      <script type="text/javascript">
         var map = null;
         var clickEvent = null;

         function GetMap()
         {  
            map = new VEMap('myMap');
            
            // SetDashboardSize must be called before calling LoadMap
            map.SetDashboardSize(VEDashboardSize.Normal);
            
            map.LoadMap();

            map.SetMapMode(VEMapMode.Mode3D);

         }
         
         // Dashboard hide & show calls
         function HideDashboard()
         {
            map.HideDashboard();
         }
         
         function ShowDashboard()
         {
            map.ShowDashboard();
         }
         
         // 3D Navigation hide & show calls
         function Hide3DNav()
         {
            map.Hide3DNavigationControl();
         }
         
         function Show3DNav()
         {
            if (map.GetMapMode() == VEMapMode.Mode2D)
            {
               map.SetMapMode(VEMapMode.Mode3D);
            }

            map.Show3DNavigationControl();
         }
         
                 
         // Mini Map hide & show calls
         function HideMiniMap()
         {
            map.HideMiniMap();
         }
         
         function ShowMiniMap()
         {
            if (map.GetMapMode() == VEMapMode.Mode3D)
            {
               map.SetMapMode(VEMapMode.Mode2D);
            }

            map.ShowMiniMap(200, 100);            
         }
         
         function SetScaleBar(distanceUnit)
         {
            map.SetScaleBarDistanceUnit(distanceUnit);
         }
      </script>
   </head>
   <body onload="GetMap();" style="font-family: Arial">
      <div id='myMap' style="position: relative; width: 800px; height: 400px;">
      </div>
      <div id="links">
         <a href="#" onclick="HideDashboard()">Hide Dashboard</a> | <a href="#" onclick="ShowDashboard()">
            Show Dashboard</a><br />
         <a href="#" onclick="Hide3DNav()">Hide 3D Navigation Control</a> | <a href="#" onclick="Show3DNav()">
            Show 3D Navigation Control</a><br />
         <a href="#" onclick="HideMiniMap()">Hide Mini Map</a> | <a href="#" onclick="ShowMiniMap()">
            Show Mini Map(2D view only)</a><br />
         <a href="#" onclick="SetScaleBar(VEDistanceUnit.Miles)">Set Scale Bar Distance Unit to Miles</a> | 
         <a href="#" onclick="SetScaleBar(VEDistanceUnit.Kilometers)">Set Scale Bar Distance Unit to Kilometers</a>
      </div>
   </body>
</html>