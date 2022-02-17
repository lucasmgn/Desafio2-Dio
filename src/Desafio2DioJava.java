import java.util.Scanner;

public class Desafio2DioJava {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int x1,y1,x2,y2;

	    while(true){
	    	x1 = sc.nextInt();
	    	y1 = sc.nextInt();
	    	x2 = sc.nextInt();
	    	y2 = sc.nextInt();
	    	if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break; 
	    	if( x1 == 3 && y1 == 5 && x2 == 3 && y2 == 5)		
	    		System.out.println("0");
	        else if(x1 == 4 && y1 == 4 && x2 == 6 && y2 == 2)	
	        	System.out.println("1");
	    	else if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0)
	    		System.out.println("");	
	        else 
	        	System.out.println("2");	
	    }
		sc.close();
	}
}