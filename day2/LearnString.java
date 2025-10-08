package week2.day2;

public class LearnString {
	public static void main(String[] args) {
		// String Instantization
		String name = new String("Bharathi");
		// String Literal
		String surname = "Bala";
		String lastname = "BALA";

		// methods
		System.out.println("No of Characters in the name--" + name.length());
		// compare two strings
		if (surname.equals(lastname)) {
			System.out.println("Both are same");
		}
		else if (surname.equalsIgnoreCase(lastname)) {
			System.out.println("Both are same irrespective of case");
		} else {
			System.out.println("Both are different");
		}
		//check the value is present or not using contains
		System.out.println(surname.contains("a"));//returns boolean
		
		//create a local variable using shortcut ctrl+2 l
		
		boolean contains = lastname.contains("a");
		System.out.println("contains"+contains);
		
		//CHAR AND CHARARRAY
		char[] spouse=new String("Thiru").toCharArray();
		for(int i=0;i<spouse.length;i++) {
			System.out.println(i);
			System.out.println(spouse[i]);
		}
		
		//vv important interview question how to reverse the array
		for (int i = spouse.length-1; i >= 0; i--) {
			System.out.println("condition check "+i+spouse[i]);
		}
		//to charat index starts from 0
		System.out.println(name.charAt(5));
		
		//split-- split the given string using delimiter
		String varName="Thiru~decborn~saturday";
		String[] newName=varName.split("~");
		System.out.println(newName.length);
		for(int j=0;j<newName.length;j++) {
			System.out.println(newName[j]);
		}
		String decimal="2356";
		Integer int1=Integer.parseInt(decimal);
		System.out.println(int1);
		
		String decimal1="23.56";
		Double int2=Double.parseDouble(decimal1);
		System.out.println(int2);
			
	}

}
