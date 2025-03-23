package Calc;
import java.util.Scanner;

public class calc {

	public static void main(String[] args) 
	{
		System.out.print("1.+\n2.-\n3.*\n4./\nВведите операци: ");
		Scanner scanner = new Scanner(System.in);
		int operation = scanner.nextInt();
		System.out.print("Первое число: ");
		int x  = scanner.nextInt();
		System.out.print("Второе число: ");
		int y  = scanner.nextInt();
		
		 if(operation ==1) 
		 {
			 System.out.println("Результат = " + (x+y));
		 }
		 else if(operation == 2) 
		 {
			 System.out.println("Результат = " + (x-y));
		 }
		 else if(operation == 3) 
		 {
			 System.out.println("Результат = " + (x*y));
		 }
		 else if(operation == 4) 
		 {
			 System.out.println("Результат = " + (x/y));
		 }
		 else 
		 {
			 System.out.println("Не знаю команды");
		 }
		 System.out.println("Грибков А.А.");
		 scanner.close();
	}
	
}
