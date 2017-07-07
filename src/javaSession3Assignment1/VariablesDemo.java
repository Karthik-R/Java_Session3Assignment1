package javaSession3Assignment1;

class Variables{
	static int i = 10; // defining class variable
	int j = 0; // defining instance variable
	public void test(){
		System.out.println("Value of j: "+j);
	}
}

public class VariablesDemo {

	public static void main(String[] args) {
		System.out.println("Difference between class variable and instance variable");
		Variables obj = new Variables();
		Variables obj1 = new Variables();
		
		System.out.println("\nInitial values of obj variables");
		obj.test();
		System.out.println("Value of obj i: "+obj.i);
		
		System.out.println("\nInitial values of obj1 variables");
		obj1.test();
		System.out.println("Value of obj1 i: "+obj1.i);
		
		obj.j += 50;
		obj.i += 10;
		System.out.println("\nValues after incrementing obj variables");
		System.out.println("Value of i: "+obj.i);
		obj.test();
		
		obj1.j += 100;
		System.out.println("\nValues of variables after incrementing obj1.j");
		System.out.println("Value of i: "+obj1.i);
		obj1.test();
		
		System.out.println("\nValues of variables after incrementing i using Classname");
		Variables.i +=50; // incrementing the variable
		System.out.println("Value of Variables i: "+Variables.i);
		System.out.println("\nValue of obj1 i: "+obj1.i);
		System.out.println("Value of obj j: "+obj.j);
		System.out.println("Value of obj1 i: "+obj1.i);
		System.out.println("Value of obj1 j: "+obj1.j);
		

	}

}
