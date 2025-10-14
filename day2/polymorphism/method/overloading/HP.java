package week3.day2.polymorphism.method.overloading;

public class HP extends Laptop {
	
	public static void inBuiltKeyboard() {
		System.out.println("I am hp");
		System.out.println("Though It have Inbuilt keyboard, I perfer seperate keyboard");
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Laptop lp=new Laptop();
		//HP hp=new HP();
		lp.inBuiltKeyboard();
		inBuiltKeyboard();
	}

}
