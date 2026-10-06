import java.util.Scanner;

public class IT26102608Lab3Q3{
	
	public static void main(String[]args){
		
		int amount, remain, coin1, coin2, coin5, coin10, note20, note50, note100, note200, note500, note1000, note5000;
		note5000=0;
		note1000=0;
		note500=0;
		note200=0;
		note100=0;
		note50=0;
		note20=0;
		coin10=0;
		coin5=0;
		coin2=0;
		coin1=0;
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter the Rupee amount: ");
		amount= input.nextInt();
		
		note5000= amount/5000;
		remain=amount%5000;
		
		note1000=remain/1000;
		remain%=1000;
		
		note500=remain/500;
		remain%=500;
		
		note200=remain/200;
		remain%=200;
		
		note100=remain/100;
		remain%=100;
		
		note50=remain/50;
		remain%=50;
			
		note20=remain/20;
		remain%=20;
		
		coin10=remain/10;
		remain%=10;
		
		coin5=remain/5;
		remain%=5;
		
		coin2=remain/2;
		remain%=2;
		
		coin1=remain/1;
		remain%=1;
		 
		System.out.println();
		System.out.println("5000 Notes - "+note5000);
		System.out.println("1000 Notes - "+note1000);
		System.out.println("500 Notes - "+note500);
		System.out.println("200 Notes - "+note200);
		System.out.println("100 Notes - "+note100);
		System.out.println("50 Notes - "+note50);
		System.out.println("20 Notes - "+note20);
		System.out.println("10 Coins - "+coin10);
		System.out.println("5 Coins - "+coin5);
		System.out.println("2 Coins - "+coin2);
		System.out.println("1 Coins - "+coin1);
		
	}
	
}