package igeo.demo;

// define a constant, so we can use 
// size(100, 100, Demo.GL);

public class IDemo {

	static DemoGraphics g;
	static final public String GL = "igeo.demo.DemoGraphics";

	static void setGraphics(DemoGraphics g) {
		IDemo.g = g;
	}

	public static void kioskMode() {
		g.kioskMode();
	}

}

