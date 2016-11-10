package pack;

public class Masive9 {

	public static void main(String[] args) {
		
//		 Створіть два масиви з 10 цілих випадкових чисел з відрізка [1;
//		 9] і третій масив з 10 дійсних чисел. Кожен елемент з i-им індексом
//		 третього масиву повинен дорівнювати відношенню елементу з першого
//		 масиву з i-им індексом до елементу з другого масиву з i-им індексом.
//		 Вивести всі три масиву на екран (кожен на окремому рядку), потім
//		 вивести кількість цілих елементів в третьому масиві.
		
		double[] array1 =new double[10];
		double[] array2 =new double[10];
		double[] array3 =new double[10];
		int q=0;
		int i;
		for(i=0;i<10;i++){
			int rand1=(int)(Math.random()*9+1);
			array1[i]=rand1;
			System.out.print(array1[i]+"    ");
		}
		
		System.out.println();
		
		for(i=0;i<10;i++){
			int rand2=(int)(Math.random()*9+1);
			array2[i]=rand2;
			System.out.print(array2[i]+"    ");
		}
		
		System.out.println();
		
		for(i=0;i<10;i++){
			array3[i]=array1[i]/array2[i];
			System.out.print(array3[i]+"  ");
			if(array3[i]%1==0){q+=1;}
		}
		System.out.println();

		System.out.println("quantity "+q);
		
	}

}
