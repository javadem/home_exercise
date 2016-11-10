package pack;

public class Masive2 {

	public static void main(String[] args) {
//		 Створіть масив з усіх непарних чисел від 1 до 99, виведіть його
//		 на екран у рядок, а потім цей же масив виведіть на екран теж в рядок,
//		 але в зворотному порядку (99 97 95 93 ... 7 5 3 1).
		
		
		
		int k=1;
		int p;
		for(p=1; p<99; p+=2){
			k+=1;
		}
		
		System.out.println("masive length ="+k);
		
		int[] arrayH = new int[k];
		int[] arrayV = new int[k];
		
		p=1;
		for(int i=0; i<k; i++){
			arrayH[i]=p;
			System.out.print(arrayH[i]+" ");
			p+=2;
		}
		
		System.out.println();
		
		p=99;
		for(int i=0; i<k; i++){
			arrayV[i]=p;
			System.out.print(arrayV[i]+" ");
			p-=2;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
