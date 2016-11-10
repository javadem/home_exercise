package pack;

import java.util.Scanner;

public class Loops8scanner {

	public static void main(String[] args) {
		
// Виведіть на екран всі позитивні подільники натурального числа,
//		введеного користувачем з клавіатури.		
		
		Scanner sc = new Scanner(System.in);
		
		int q=1;
		while(q>0){
		System.out.println("Enter number");
		System.out.println();
		int i=sc.nextInt();
		System.out.println("number "+i);
		System.out.println();
		
		
		for(int m=i;m>0;m--){int p=i/m;
			
		if(p>0){
			if(i%m==0){
				System.out.println("podilnik ="+p);}
			}
		
		}
		
		System.out.println();
		
		}
		
		

	}

}
