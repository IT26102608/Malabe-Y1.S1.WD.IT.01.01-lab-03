import java.util.Scanner;

public class IT26102608Lab3Q2{
	
	public static void main(String[]args){
		
		double monthlySalary, otHours, otRate, totalSalary, otAmount;

		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the monthly salary: ");
		monthlySalary=input.nextDouble();
		
		System.out.print("Enter the number of OT hours: ");
		otHours=input.nextDouble();
		
		System.out.print("Enter OT hourly rate: ");
		otRate=input.nextDouble();
		
		otAmount=otHours*otRate;
		totalSalary=otAmount+monthlySalary;
		
		System.out.println();
		System.out.print("The total salary including OT is: "+totalSalary);
		
	}
	
	
	
}