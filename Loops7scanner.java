package pack;

import java.util.Scanner;

public class Loops7scanner {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int q=0;
		while(q>=0){
				
		System.out.println("Enter number");
		int n = sc.nextInt();
		System.out.println(n);		
	
		int f=1;
			
		for(int k=1; k<=n; k++){
			f*=k;	
		}
		System.out.println("factorial number "+n+"! = "+f);
				
	}
		

	}

}
