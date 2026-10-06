import java.util.Scanner;

public class IT26102608Lab3Q1A{
	
	public static void main(String[]args){
		
		double unitPrice, weight, totalPrice;
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of price:");
		unitPrice= input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy:");
		weight= input.nextDouble();
		
		
		totalPrice= unitPrice*weight;
		System.out.println("");
		System.out.println("The total amount is: "+totalPrice);
	}
	
}