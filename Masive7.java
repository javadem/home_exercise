package pack;

public class Masive7 {

	public static void main(String[] args) {
		
//		Створіть масив з 20-ти перших чисел Фібоначчі і виведіть його
//		на екран. Нагадуємо, що перший і другий члени послідовності рівні
//		одиницям, а кожен наступний - сумою двох попередніх.
//		
		
		int[] array = new int[20];
		
		int i;
		for(i=0; i<20;i++){
			if((i==0)||(i==1)){array[i]=1;}
		else{
			array[i]=(array[i-1]+array[i-2]);}
			
		System.out.print(array[i]+" ");	
		}
		

	}

}
