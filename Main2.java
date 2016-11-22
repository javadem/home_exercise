package pack;

public class Main2 {

	public static void main(String[] args) {
		
//		Написати власний метод int compateTo(String str1, String str2), який буде працювати точно так само,
//		як і сompareTo в класі String. Врахувати те, що стрічки можуть бути різної довжини. 
//		Зробити код максимально оптимальним (вчасно припиняти роботу циклів і т.д.).
		
//		public int compareTo(String string)
//		Сравнивает указанную строку, используя значения символов Unicode и вычисляет, какая из строк меньше,
//		равна или больше следующей. Может использоваться при сортировке. Регистр учитывается. Если строки совпадают, 
//		то возвращается 0, если меньше нуля, то вызывающая строка меньше строки string, если больше нуля,
//		то вызывающая строка больше строки string. Слова с большим регистром стоят выше слова с нижним регистром.

		String str1 ="ggg";
		String str2 ="hhh";
		compateTo(str1,str2);
	}
	
	static int compateTo(String str1, String str2){
		int len1=str1.length();
		int len2=str2.length();
		int length=len1;
		if(len2>len1){length=len2;}
		char[] array1 = new char[len1];
		char[] array2 = new char[len2];
		char[] array3 = new char[length];
		int[] int1=new int[len1];
		int[] int2=new int[len2];
		int[] int3=new int[length];
		int res=0;
		
		if(len1<len2){
			
			int i=0;

		while(i<len1){	//while st
			
			array1[i]=str1.charAt(i);
//			System.out.print(array1[i]+" ar1 ");
			
			int1[i]=(int)(array1[i]);
//			System.out.print(int1[i]+" ar1 ");
			array3[i]=array1[i];
//			System.out.print(array3[i]+" ar3 ");
			
			int3[i]=(int)(array3[i]);
//			System.out.print(int3[i]+" ar3 ");
			i++;
//			System.out.println();
		} //while end
		
		for(int a=0;a<length;a++){
			array2[a]=str2.charAt(a);
//			System.out.print(array2[a]+" ar2 ");
			
			int2[a]=(int)(array2[a]);
//			System.out.print(int2[a]+" ar2 ");
			
//			System.out.println();
		}
		
		
		 int s=0;

		while(s<length){	//while st
			
			if(int3[s]<int2[s]){
				System.out.println("string 1 is less");

				return res;
			}else
			{if(int3[s]>int2[s]){
				System.out.println("string 2 is less");
				return res;
								}
			}
			s++;
			} //while end
		
		}	
		
		if(len1>len2){
			int i=0;

			while(i<len2){	//while st
				array2[i]=str2.charAt(i);
//				System.out.print(array2[i]+" ");
				int2[i]=(int)(array2[i]);
//				System.out.print(int2[i]+" ");
				array3[i]=array2[i];
//				System.out.print(array3[i]+" ");
				int3[i]=(int)(array3[i]);
//				System.out.print(int3[i]+" ");
				i++;
			} //while end
			
			for(int n=0;n<length;n++){
				array1[n]=str1.charAt(n);
//				System.out.print(array1[n]+" ");
				int1[n]=(int)(array1[n]);
//				System.out.print(int1[n]+" ");
					}
			
			 int s=0;
		while(s<length){	//while st
					if(int3[s]>int1[s]){
						System.out.println("string 1 is less");
			return res;
					}else
					{if(int3[s]<int1[s]){
						System.out.println("string 2 is less");
						return res;
										}
//					System.out.println("s="+s+" "+int3[s]+" "+int1[s]);
					}
					s++;
					} //while end
		}

		if(len1==len2){
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
		
		}
		
		return res;
	}

}
