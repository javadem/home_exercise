package pack;

public class Masive10 {

	public static void main(String[] args) {
	
//		 Створіть масив з 11 випадкових цілих чисел з
//		 відрізка [-1; 1], виведіть масив на екран у рядок. Визначте який
//		 елемент зустрічається в масиві найчастіше і виведіть про це
//		 повідомлення на екран. Якщо два якихось елемента зустрічаються
//		 однакову кількість разів, то не виводьте нічого.
		
		int[] array =new int[11];
		
		int i;
		int q0=0;
		int q1=0;
		int qminus=0;
		for(i=0;i<11;i++){
			int rand=(int)Math.round((Math.random()*2-1));
			array[i]=rand;
			System.out.print(array[i]+" "); 
			
			if(array[i]==0){q0+=1;}
			if(array[i]==1){q1+=1;}
			if(array[i]==(-1)){qminus+=1;}
		}
		
		System.out.println();
		
			if((q1>qminus)&&(q1>q0)){System.out.println("quantity 1 is often and = "+q1);}
			if((q0>q1)&&(q0>qminus)){System.out.println("quantity 0 is often and = "+q0);}
			if((qminus>q0)&&(qminus>q1)){System.out.println("quantity -1 is often and = "+qminus);}
		

	}

}
