package week3.day2.polymorphism.method.overloading;

public class LearnMethodOverloading {
	public static void reportStep(String msg) {
		System.out.println("The reported message is"+msg);
	}
	public static void reportStep(String msg,String status) {
		System.out.println("The reported message is  "+msg+"  The status of the message is "+status);
	}
	public static void reportStep(String msg,String status,Boolean snap) {
		System.out.println("The reported message is  "+msg+"  The status of the message is "+status+"The snap value is"+snap);
	
	}
	
public static void main(String[] args) {
	reportStep("Hello World");
	reportStep("TempID","active");
	reportStep("TempID","active",false);
	
}
}
