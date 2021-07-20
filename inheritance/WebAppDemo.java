
abstract class App {
	abstract void appType();
}

class WebApp extends App implements ICommonFunctionalities {

	public void print() {
		System.out.println("Page is accessible for printing");
	}

	public void log() {
		System.out.println("working in Webapp");
	}

	public void appType() {
		System.out.println("i am a web app");
	}
}
class MobileApp extends App implements ICommonFunctionalities{
	public void appType() {
		System.out.println("I am a mobile app");
	}
	public void print() {
		System.out.println("Page is accessible for printing");
	}

	public void log() {
		System.out.println("working in Webapp");
	}
}

class ShoppingCart implements ICommonFunctionalities{
	public void print() {
		System.out.println("Page is accessible for printing");
	}

	public void log() {
		System.out.println("working in Webapp");
	}
}

public class WebAppDemo {
	public static void main(String[] args) {
		MobileApp app = new MobileApp();
		app.print();
		app.appType();
	}
}