package week3.day2;

public class OpenSafari extends OpenEdge {

public static void readerMode() {
	System.out.println("Reader Mode");
}
public static void fullScreenMode() {
	System.out.println("Full screen Mode");
}
public static void main(String[] args) {
	OpenSafari safari=new OpenSafari();
	//safari.openURL();
	safari.clearCache();
	safari.fullScreenMode();
	safari.openURL();
	safari.browserName="Hello";
	System.out.println(safari.browserName);
}
}
