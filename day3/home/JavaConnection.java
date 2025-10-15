package week3.day3.home.assignment;

public class JavaConnection implements DatabaseConnection{

	

	@Override
	public  void connect() {
		// TODO Auto-generated method stub
		System.out.println("The connection established successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection JC=new JavaConnection();
		JC.connect();
	//	JC.handleException();	since it is static we cant call it with object	
		JC.disConnect();
		

	}
	

}
