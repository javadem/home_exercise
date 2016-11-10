package pack;

public class Masive6 {

	public static void main(String[] args) {
		
//		 Створіть масив з 4 випадкових цілих чисел з відрізка [10; 99],
//		 виведіть його на екран у рядок. Визначити і вивести на екран
//		 повідомлення про те, чи є масив строго зростаючої послідовністю.
		
		
		int[] array = new int[4];
		
		int i;
		
		for(i=0;i<4; i++){
			
			int rand=(int)(Math.random()*90+10);
			array[i]=rand;
			System.out.print(array[i]+" ");
			
		}
		System.out.println();
		System.out.println(array[0]+" "+array[1]+" "+array[2]+" "+array[3]);
		
			if(array[0]<array[1]){
				if(array[1]<array[2]){
					if(array[2]<array[3]){System.out.print("array is grow ");
				}
			  }
			}
	

	}

}
