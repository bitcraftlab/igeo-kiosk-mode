package igeo.demo;

// A Wrapper that allows us to customize IGEO Graphics

import java.awt.*;
import java.awt.event.*;

import igeo.*;
import igeo.p.*;
import igeo.gui.*;

public class DemoGraphics extends PIGraphicsGL1 {
  
  PanelWrapper wrapper;
  
  public DemoGraphics() {
    super();
	IDemo.setGraphics(this);
  }
  
  public void kioskMode() {

	 // only show the perspective pane by default
	 IG.perspectivePane();
    
     // event filter wrapper for ipanel
     wrapper = new PanelWrapper(panel); 
     
     // remove all event listeners from the panel
     parent.removeMouseListener(panel);
     parent.removeKeyListener(panel);
     
     // add our own mouse listener
     parent.addMouseListener(wrapper);  
  }
  
}

