package pack;

public class Masive8 {

	public static void main(String[] args) {
		
//		Створіть масив з 12 випадкових цілих чисел з відрізка [-15;
//		15]. Визначте який елемент є в цьому масиві максимальним і повідомте
//		індекс його останнього входження в масив.
		
		int[] array =new int[12];
		
		int i;
		int max=-15;
		int maxIndex=0;
		for(i=0; i<12;i++){
			int rand=(int)(Math.random()*32-16);
			array[i]=rand;
			System.out.print(array[i]+" ");
		}
		
		for(i=0; i<12;i++){ 
			if(array[i]>=max){max=array[i];
			maxIndex=i;
			}
		}
	System.out.println();
		System.out.println("max "+max);
		System.out.println("index "+maxIndex);

	}

}
   