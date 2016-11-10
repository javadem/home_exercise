package pack;

public class Masive3 {

	public static void main(String[] args) {
//		 Створіть масив з 15 випадкових цілих чисел з відрізка [0; 9].
//		 Виведіть масив на екран. Підрахуйте скільки в масиві парних елементів
//		 і виведете цю кількість на екран на окремому рядку.

		
			int[] array = new int[15];
		
		int k=0;
		int i;
		for(i=0; i<15; i++){
			
			int rand;
			rand=(int)(Math.random()*10);
			array[i]=rand;
			
			System.out.print(array[i]+" ");
			
			if((rand%2==0)&(rand>=2)){k+=1;
				
			}
			
			
		}
		System.out.println();
		System.out.println("quantity = "+k);
		System.out.println();
		
	System.out.println(array);
		
		

		
		
	}

}
