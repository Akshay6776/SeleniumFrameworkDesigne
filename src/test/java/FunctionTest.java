import java.util.ArrayList;
import java.util.Arrays;

public class FunctionTest {
	
	
	//Function to get Marks of Students
	
//	int marks;
//	
//	public int getStudentMarks(String studentName) 
//	{
//		if(studentName.equalsIgnoreCase("Akshay")) 
//		{
//			System.out.println("The marks of student "+studentName);
//			marks = 95;
//		}
//		else if(studentName.equalsIgnoreCase("Amruta")) 
//		{
//			System.out.println("The marks of student "+studentName);
//			marks = 90;
//		}
//		else if(studentName.equalsIgnoreCase("Sunil")) 
//		{
//			System.out.println("The marks of student "+studentName);
//			marks = 85;
//		}
//		else 
//		{
//			System.out.println("Please enter valid student name");
//			marks = -1;
//		}
//		return marks;
//	}
//	

	//using switch case
//	int marks;
//	public int getMarks(String name) 
//	{
//		System.out.println("Marks of student "+name);
//		switch (name) {
//		case "Akshay":
//			return 56;
//		case "Sunil":
//			return 42;
//		case "Amruta":
//			return 78;
//
//		default:
//			return -1;
//		}
//		
//	}
	
	ArrayList<String> deviceList = new ArrayList<String>();
	ArrayList<String> List = new ArrayList<String>(Arrays.asList("Macbook air","iphone","ipad"));
	
	public ArrayList<String> getDeviceList(String empName) 
	{
		System.out.println("Getting List of devices the emp has: "+ empName);
		if(empName.equalsIgnoreCase("Akshay")) 
		{
//			deviceList.add("Macbook pro");
//			deviceList.add("iphone 14");
//			deviceList.add("ipad");
			deviceList.addAll(List);
		}
		else if(empName.equalsIgnoreCase("Amruta")) 
		{
			deviceList.add("HP laptop");
			deviceList.add("Samsung m15");
		}
		else if(empName.equalsIgnoreCase("sunil")) 
		{
			deviceList.add("Samsung m23");
		}
		else 
		{
			System.out.println("Please enter valied empName "+empName);
		}
		return deviceList;
	}
	
	
	
	

	public static void main(String[] args) {
		
//		FunctionTest obj = new FunctionTest();
//		int m1 = obj.getStudentMarks("Akshay");
//		System.out.println(m1);

		
		FunctionTest obj = new  FunctionTest();
		ArrayList<String> List =obj.getDeviceList("sunil");
		System.out.println(List);
		
		
		
	}

}
