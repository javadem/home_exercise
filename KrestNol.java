package pack;

import java.util.*;

public class KrestNol {

	public static void main(String[] args) {
	
		int[][] field = new int[3][3];
		for(int i=0;i<field.length;i++){
			for(int j=0;j<field[i].length;j++){
				System.out.print(field[i][j]+" ");
			}
			System.out.println();
		}
		
		int x;
		int c;
		
		int hor=0;
		int vert=0;

		int randI;
		int randJ;
		int win=3;
		int sum;
	
		while(win==1|win==2|win==3){
		

		Scanner sc= new Scanner(System.in);
//		System.out.println("your move, x, input 1 ");  
//		x=sc.nextInt();
		c=1;
		while(c>0){
			x=1;
			while(x>0){
			System.out.println();
			System.out.println("input ryadok");             //first move player
			hor=(sc.nextInt()-1);
		if(hor>=0&hor<=2){x=0;}
		else{System.out.println("input number between 1-3");}
			}
			x=1;
			while(x>0){
		System.out.println("input stovp");
		vert=(sc.nextInt()-1);
		if(vert>=0&vert<=2){x=0;}
		else{System.out.println("input number between 1-3");}
			}
		if(field[hor][vert]==0){field[hor][vert]=1;c=0;}
		else{System.out.println("choose other box");}
		}
		
		System.out.println();
		
		
		  if(((field[0][0]==1)&(field[0][1]==1)&(field[0][2]==1)) 
					|((field[1][0]==1)&(field[1][1]==1)&(field[1][2]==1))	
					|((field[2][0]==1)&(field[2][1]==1)&(field[2][2]==1))
					|((field[0][0]==1)&(field[1][0]==1)&(field[2][0]==1))
					|((field[0][1]==1)&(field[1][1]==1)&(field[2][1]==1))
					|((field[0][2]==1)&(field[1][2]==1)&(field[2][2]==1))
					|((field[0][0]==1)&(field[1][1]==1)&(field[2][2]==1))	
					|((field[0][2]==1)&(field[1][1]==1)&(field[2][0]==1)))					
								{win=1;System.out.println("win player");
								System.out.println();
								for(int i=0;i<field.length;i++){
									for(int j=0;j<field[i].length;j++){
										System.out.print(field[i][j]+" ");
																		}
									System.out.println();
																}
								
								System.exit(0);}
					
		  	else{sum=0;
		  		for(int i=0;i<field.length;i++){
							for(int j=0;j<field[i].length;j++){sum+=field[i][j];
								if(sum==13){System.out.println(" no win, next game");
								System.exit(0);
											}
																}
														}
		  		}
		
			
		c=1;
		while(c>0){
		randI=(int)(Math.random()*3);   //first move comp
//		System.out.println(randI+1);
		randJ=(int)(Math.random()*3);
//		System.out.println(randJ+1);
		if(field[randI][randJ]==0){field[randI][randJ]=2;c=0;}

			}
		System.out.println();
		
		for(int i=0;i<field.length;i++){
			for(int j=0;j<field[i].length;j++){
				System.out.print(field[i][j]+" ");
												}
			System.out.println();
										}
					}

		if(((field[0][0]==2)&(field[0][1]==2)&(field[0][2]==2))
				|((field[1][0]==2)&(field[1][1]==2)&(field[1][2]==2))	
				|((field[2][0]==2)&(field[2][1]==2)&(field[2][2]==2))
				|((field[0][0]==2)&(field[1][0]==2)&(field[2][0]==2))
				|((field[0][1]==2)&(field[1][1]==2)&(field[2][1]==2))
				|((field[0][2]==2)&(field[1][2]==2)&(field[2][2]==2))
				|((field[0][0]==2)&(field[1][1]==2)&(field[2][2]==2))	
				|((field[0][2]==2)&(field[1][1]==2)&(field[2][0]==2)))	
				{win=2;System.out.println("win comp");
				System.exit(0);}
		

	}
}
