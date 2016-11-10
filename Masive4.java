package pack;

public class Masive4 {

	public static void main(String[] args) {
//		 Створіть масив з 8 випадкових цілих чисел з відрізка [1; 10].
//		 Виведіть масив на екран у рядок. Замініть кожен елемент з непарним
//		 індексом на нуль. Знову виведете масив на екран на окремому рядку.
		
		
		int[] array = new int[8];
		
		for(int i=0;i<8;i++){	int rand=(int)(Math.random()*10+1);
			
			array[i]=rand;
		System.out.print(array[i]+" ");
			
		}
		
		System.out.println();
		
		for(int i=0;i<8;i++){
			if(i%2!=0){
			array[i]=0;
			
		}	
			System.out.print(array[i]+" ");
			
		}
		
		
	}

}
