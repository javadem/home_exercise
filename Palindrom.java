package pack;

public class Palindrom {

	public static void main(String[] args) {
//		Дати завдання: написати метод, який перевіряє чи слово є паліндромом.

		
		String s;
		s="rotor";
		palindrom(s);
		
		
	}

	static String palindrom(String str){
		int len=str.length();
		char[] word =new char[len];
		char[] word2 = new char[len];
		String res;
		int a=(len-1);
		for(int i=0;i<len;i++){
			word[i]=str.charAt(i);
//			System.out.print(word[i]);
			word2[a]=str.charAt(i);
			System.out.print(word2[a]);
			a--;
			if(a<0){continue;}
								}
		System.out.println();
		for(int b=0;b<len;b++){
			if(word[b]!=word2[b]){
				System.out.println("it not palindrom");
				res="it not palindrom";
				return res;
								  }
			
								}
	System.out.println("it word palindrom");
	res="it word palindrom";
	return res;
	}
	
}
