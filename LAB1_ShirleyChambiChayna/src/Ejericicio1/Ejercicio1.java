package Ejericicio1;

public class Ejercicio1 {
	public static int [] reverseArray(int array [] ) {
		int copia [] =new int [array.length];
		int count=0;
		for(int i=array.length-1;i>=0;--i)
			copia [count ++]=array[i];
		 
		
		return copia;
	}
	public static void main(String[] args) {	
		int array []= {1,2,3};
		array=reverseArray(array);
		for(int i=0;i<array.length;++i)
			System.out.print(array [i]+" " );
	}
}

