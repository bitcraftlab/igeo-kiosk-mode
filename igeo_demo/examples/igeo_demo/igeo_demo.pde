
////////////////////////////////////////////////////////////////////////
//                                                                    //
//                        IGEO Kiosk-Mode Example                     //
//                                                                    //
////////////////////////////////////////////////////////////////////////

// This is a very small monkey-patch library I developed to add a Demo
// Mode to the Igeo Library (tested with Processing 1.5.1) 
//
// Igeo is a very powerful tool for Generative 3D Design + Architecture.
// It featues a Development Mode ( 4 panels with different perspectives )
// with a lot of special keys for navigation, saving the geometry etc.
//
// If you just need to demo your sketch this may not be what you want.
// This sketch demonstrates how to use the Kiosk-Mode and how to customize 
// the look and feel of the Graphics.
//
// Kiosk-Mode Features:
//
// - All IGEO Key-Commands disabled
// - Switching Perspectives disabled
//


import processing.opengl.*;
import igeo.*;
import igeo.demo.*;


void setup() {
 
  config();                   // Customize the look and feel of your sketch 
  size(600, 400, IDemo.GL);   // Use the  demo renderer
  IG.perspectivePane();       // only show the perspective pane by default
  IDemo.kioskMode();          // Disable advanced features
  
  // Create Your stuff here ...
  new IPoint(0,0,0);
  new IPoint(20,0,0);
  new IPoint(20,20,0);
  new IPoint(0,20,0);

}


// Custom configuration ( See IConfig.java )

void config() {
  
  // colors
  IConfig.bgColor1 = new IColor(0, 0, 50);
  IConfig.bgColor2 = new IColor(0, 0, 50);
  IConfig.bgColor3 = new IColor(100, 100, 200);
  IConfig.bgColor4 = new IColor(140, 140, 200);
  
  // objects
  IConfig.objectColor = new IColor(255);
  IConfig.pointSize = 10;
  
}


// Draw a GUI on top ...

void draw() {
   int x = width - 200;
   noStroke();
   fill(255, 50);
   rect(x, 0, width, height);
   fill(255); text("Add your GUI here", x + 10, 20);
}
