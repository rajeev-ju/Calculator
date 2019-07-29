import java.util.Scanner;

public class Calculator{
	public int x;
	public int y;
	public void add(int x, int y){
		System.out.println("Add :" + (x + y));
	}

	public void sub(int x, int y){
		System.out.println("result : " + (x - y));
	}

	public void mul(int x, int y){
		System.out.println("Product : " + (x * y));
	}

	public void div(int x, int y){
		if(y == 0){
			System.out.println("Cannot divide by Zero");
			
		}
		System.out.println("Div : " + (x / y));
	}

	public static void main(String []args){
		Calculator cal = new Calculator();
		System.out.print("Enter two integers : ");
		Scanner in = new Scanner(System.in);
		int a = (int)in.nextInt();
		int b = (int)in.nextInt();
		cal.add(a, b);
		cal.sub(a, b);
		cal.mul(a, b);
		cal.div(a, b);
	}
}