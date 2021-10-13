package Ejercicio3;

public class Ejercicio3 {

	public static void rectriangle(int base) {
		if(base<1) {
			
			return ;
		}else
		{
			rectriangle(base-1);
			for(int i=0;i<base;++i)
			System.out.print(".");
			
			System.out.print("\n");
		}
	    }	
	public static void main(String[] args) {
		rectriangle(6);
	}
}