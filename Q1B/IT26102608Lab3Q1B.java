import java.util.Scanner;

public class IT26102608Lab3Q1B{
	
	public static void main(String[]args){
		
		double unitPrice, weight, totalPrice, discount, finalPrice;
		discount=10;
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of price:");
		unitPrice= input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy:");
		weight= input.nextDouble();
		
		
		totalPrice= unitPrice*weight;
		finalPrice=totalPrice*(100-discount)/100;
		System.out.println();
		System.out.println("The total amount is: "+finalPrice);
	}
	
}