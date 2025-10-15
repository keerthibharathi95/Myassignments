package week3.day3.home.assignment;

public interface DatabaseConnection {
	void connect();
	default void  disConnect(){
		System.out.println("The database connection disconnected sucessfully");
		
	}
	static void handleException() {
		System.out.println("The exception handled sucessfully");
	}

}
