package week1.day1;

public class EmployeeDetails {
	       
			 

	public static void main(String[] args) {
		
		    String name = "John Doe";

	        // Default and most common choice for whole numbers
	        int age = 30;

	        // Default and preferred choice for floating-point numbers (double-precision)
	        double salary = 55000.75;

	        // Used for a single 16-bit Unicode character
	        char gender = 'M';

	        // Used for logical values (true or false)
	        boolean acceptTerms = true;

	        // Used for floating-point numbers when memory is a concern (single-precision).
	        // The 'f' suffix is essential for a float literal.
	        float rating = 4.5f;

	        // Use long for very large whole numbers, like a 10-digit mobile number,
	        // which exceeds the capacity of an int. The 'L' suffix is optional but good practice.
	        long mobileNumber = 9876543210L;

	        // A whole number well within the range of an int
	        int pinCode = 56001;
	        
	        // A simple integer
	        int luckyNumber = 7;

	        // c) Print values
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Salary: " + salary);
	        System.out.println("Gender: " + gender);
	        System.out.println("Accept Terms: " + acceptTerms);
	        System.out.println("Rating: " + rating);
	        System.out.println("Mobile Number: " + mobileNumber);
	        System.out.println("Pin Code: " + pinCode);
	        System.out.println("Lucky Number: " + luckyNumber);

	}

}
