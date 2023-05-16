package interfaces;


interface FirstInterface{
	public void myMethod();                     //interface method
}

interface SecondInterface{
	public void myOtherMethod();                //interface method
}


//DemoClass implements FurstInterface and SecondInterface
class DemoClass implements FirstInterface , SecondInterface{
	
	public void myMethod(){
		System.out.println("Enter Some Text ...");
	}
	
	public void myOtherMethod() {
		System.out.println("Enter Some Other Text  ...");
	}
}

public class Main {
	
	public static void main(String[] args) {
	DemoClass obj = new DemoClass();
	obj.myMethod();
	obj.myOtherMethod();
	
	}

}
