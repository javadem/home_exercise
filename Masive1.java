package pack;

public class Masive1 {

	public static void main(String[] args) {
		
//		Створіть масив з усіх парних чисел від 2 до 20 і виведіть
//		елементи масиву на екран спочатку в рядок, відокремлюючи один елемент
//		від іншого прогалиною, а потім в стовпчик (відокремлюючи один елемент
//		від іншого початком нового рядка). Перед створенням масиву подумайте,
//		якого він буде розміру.
//		
		
		int k=1;
		int p;
		for(p=2; p<20; p+=2){
			k+=1;
		}
		
		System.out.println("masive length ="+k);
		
		int[] arrayH = new int[k];
		int[] arrayV = new int[k];
		
		p=2;
		for(int i=0; i<k; i++){
			arrayH[i]=p;
			System.out.print(arrayH[i]+" ");
			p+=2;
		}
		
		System.out.println();
		
		p=2;
		for(int i=0; i<k; i++){
			arrayV[i]=p;
			System.out.println(arrayV[i]);
			p+=2;
		}
		
		
		
		
		
		
		
	}

}
