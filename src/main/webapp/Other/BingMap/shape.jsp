<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"> 
<html>
   <head>
      <title>Adding a Shape to a Map</title>
      <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
      <script type="text/javascript" src="http://dev.ditu.live.com/mapcontrol/mapcontrol.ashx?v=6.2"></script>
      <script type="text/javascript">
      var map = null;
      var points = new Array(
         new VELatLong(45.01188,-111.06687, 0, VEAltitudeMode. RelativeToGround),
         new VELatLong(45.01534,-104.06324, 0, VEAltitudeMode. RelativeToGround),
         new VELatLong(41.01929,-104.06, 0, VEAltitudeMode. RelativeToGround),
         new VELatLong(41.003,-111.05878, 0, VEAltitudeMode. RelativeToGround)
      );

      function GetMap()
      {
         map = new VEMap('myMap');
         map.LoadMap();
         var myShapeLayer = new VEShapeLayer();
         map.AddShapeLayer(myShapeLayer);
         var myShape = new VEShape(VEShapeType.Pushpin, points);
         myShapeLayer.AddShape(myShape);
      }

      </script>
   </head>
   <body onload="GetMap();">
      <div id='myMap' style="position:relative; width:400px; height:400px;"></div>
   </body>
</html>