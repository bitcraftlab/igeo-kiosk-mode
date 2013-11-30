package igeo.demo;

// Capture and filter mouse events for the Panel

import java.awt.*;
import java.awt.event.*;

import igeo.*;
import igeo.p.*;
import igeo.gui.*;

class PanelWrapper implements MouseListener {

  IPanel ipanel;
  
  public PanelWrapper(IPanel ipanel) {
    this.ipanel = ipanel;
  }
  
  // filter double clicks so we can't switch between panels
  public void mouseClicked(MouseEvent e)  { } 
  
  // pass everything else through
  public void mousePressed(MouseEvent e)  { ipanel.mousePressed(e); } 
  public void mouseReleased(MouseEvent e) { ipanel.mouseReleased(e); } 
  public void mouseExited(MouseEvent e)   { ipanel.mouseExited(e);  } 
  public void mouseEntered(MouseEvent e)  { ipanel.mouseEntered(e); } 
  
}
