package pack;

public class Main {

	public static void main(String[] args) {
//		Написати власний метод int compateTo(String str1, String str2), який буде працювати точно так само,
//		як і сompareTo в класі String. Врахувати те, що стрічки можуть бути різної довжини. 
//		Зробити код максимально оптимальним (вчасно припиняти роботу циклів і т.д.).
		
//		public int compareTo(String string)
//		Сравнивает указанную строку, используя значения символов Unicode и вычисляет, какая из строк меньше,
//		равна или больше следующей. Может использоваться при сортировке. Регистр учитывается. Если строки совпадают, 
//		то возвращается 0, если меньше нуля, то вызывающая строка меньше строки string, если больше нуля,
//		то вызывающая строка больше строки string. Слова с большим регистром стоят выше слова с нижним регистром.

		String str1 ="ggggggg0";
		String str2 ="ggggggg0";
		compateTo(str1,str2);
	}
	
	static int compateTo(String str1, String str2){
		int len1=str1.length();
		int len2=str2.length();

		char[] array1 = new char[len1];
		char[] array2 = new char[len2];
		int[] int1=new int[len1];
		int[] int2=new int[len2];

		int res=0;
		int length=len1;
		if(len2<len1){length=len2;}
		int i=0;
		while(i<length){	//while st
			
			array1[i]=str1.charAt(i);
			int1[i]=(int)(array1[i]);
			array2[i]=str2.charAt(i);
			int2[i]=(int)(array2[i]);
			
			if(int1[i]<int2[i]){
				System.out.println("string 1 is less");
				return res;
			}else
			{if(int1[i]>int2[i]){
				System.out.println("string 2 is less");
				return res;
								}
			}
			i++;
			
		} //while end

		if(len1<len2){System.out.println("string 1 is less");}
			else{
				if(len1>len2){System.out.println("string 2 is less");}
				else{System.out.println("string 1 == string 2");}
			}
	
		return res;
	}

}
