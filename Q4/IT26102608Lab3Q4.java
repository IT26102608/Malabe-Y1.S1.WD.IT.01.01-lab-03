import java.util.Scanner;

public class IT26102608Lab3Q4{
	
	public static void main(String[]args){
		
		int remain, inputNo, digit1, digit2, digit3, digit4, digit5;
		
		digit1=0;
		digit2=0;
		digit3=0;
		digit4=0;
		digit5=0;
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter a five-digit number: ");
		inputNo= input.nextInt();
		
		digit1=inputNo/10000;
		remain=inputNo%10000;
		
		digit2=remain/1000;
		remain%=1000;
		
		digit3=remain/100;
		remain%=100;
		
		digit4=remain/10;
		remain%=10;
		
		digit5=remain;
		
		System.out.println();
		System.out.print(+digit1);
		System.out.print(" ");
		System.out.print(+digit2);
		System.out.print(" ");
		System.out.print(+digit3);
		System.out.print(" ");
		System.out.print(+digit4);
		System.out.print(" ");
		System.out.print(+digit5);
		
	}
	
}