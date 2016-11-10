package pack;

public class Masive5 {

	public static void main(String[] args) {
		
//		  Створіть 2 масиви з 5 випадкових цілих чисел з відрізка [0; 5]
//				  кожен, виведіть масиви на екран у двох окремих рядках. Порахуйте
//				  середнє арифметичне елементів кожного масиву і повідомте, для якого з
//				  масивів це значення виявилося більше (або повідомте, що їх середні
//				  арифметичні рівні).
		
		
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		
		
		int i;
		double sum1=0;
		double sum2=0;
		double mid1=0;
		double mid2=0;
		
		System.out.print("array1   ");
		
		for(i=0;i<5;i++){
			
			int rand1=(int)(Math.random()*6);
			
			array1[i]=rand1;
			
			System.out.print(array1[i]+" ");
			sum1+=array1[i];
		}
		System.out.print(" summa "+sum1);
		mid1=sum1/5;
		System.out.println("   middle1 "+mid1);
		
		System.out.print("array2   ");
		for(i=0;i<5;i++){
			
			int rand2=(int)(Math.random()*6);
			array2[i]=rand2;
			
			System.out.print(array2[i]+" ");
			sum2+=array2[i];
		}
		System.out.print(" summa "+sum2);
		mid2=sum2/5;
		System.out.println("   middle2 "+mid2);
		
		if(mid1>mid2){System.out.println("middle arifmetic array1 is more");}
			else{
				if(mid1<mid2){System.out.println("middle arifmetic array2 is more");}
		
		else{System.out.println("array1 and array2 is similar");}
				
				
		}
		
		
	}

}
