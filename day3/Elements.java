package week3.day3;

public interface Elements {
	void findElement();//default access modifier
	public void setElement();
	 default void hello() {
		System.out.println("Hello World");
	}
	 default void check() {
		 System.out.println("Checking for object creation");
	 }
	

}
