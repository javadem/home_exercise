package pack;
import java.util.*;

public class VgadatiNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rand;
		int num;
		int a;
		Scanner sc= new Scanner(System.in);
		
		
		rand = (int)(Math.random()*10);
		a=1;
		while(a>0){
		System.out.println("input number");
		num= sc.nextInt();
		
		if(num==rand){System.out.println("you win");
		a=0;}
		else{System.out.println("try again");
		if(num<rand){System.out.println("your number is less");}
		else{System.out.println("your number is more");}
		}
		
		}
		
		
		
		
		
		
		

	}

}
