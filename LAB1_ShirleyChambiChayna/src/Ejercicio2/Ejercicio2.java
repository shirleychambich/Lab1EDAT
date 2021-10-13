package Ejercicio2;

public class Ejercicio2 {
	public static int [] rotateLeft(int array [],int rotaciones ) {
		
		int copia []=new int  [array.length];
		int inicio= rotaciones % array.length;
		
		int count=0;
		for(int i=inicio;i<array.length;++i)
			 copia [count++]=array [i];
		for(int j=0;j<inicio;++j)
			 copia [count++]=array [j];
		return copia;
	}
	public static void main(String[] args) {
		int array []= {1,2,3};
		array=rotateLeft(array,4);
		for(int i=0;i<array.length;++i)
			System.out.print(array [i]+" " );
		
}
}
