package Ejercicio4;

public class TEST {
	public static void main(String[] args) {
		
		List<Integer> test=new List<Integer>();
		   for(int i=3;i<=15;i+=3)
			   test.add(i);
		   System.out.println("Se creo la lista con los elementos 3,6,9,12,15 ");
		   System.out.println(" Se imprime la lista"+test.imprimir());
		   System.out.println("Muestra el tamano de la lista "+test.size());
		   test.add(1,1);
		   System.out.println("Se inserto el elemento 1 en la posicion 1 de la lista ");
		   System.out.println("Se imprime la lista actualizada "+test.imprimir());
		   System.out.println("Muestra el tamano de la lista actualizada "+test.size());
		   test.add(18);
		   System.out.println("Se inserto el elemento 18 en la ultima posicion de la lista ");
		   System.out.println("Se imprime la lista actualizada "+test.imprimir());
		   System.out.println("Muestra el tamano de la lista actualizada "+test.size());
		   test.add(2,2);
		   System.out.println("Se inserto el elemento 2  en la  posicion 2  de la lista ");
		   System.out.println("Se imprime la lista actualizada "+test.imprimir());
		   System.out.println("Muestra el tamano de la lista actualizada "+test.size());
		   test.add(21);
		   System.out.println("Se inserto el elemento 21 en la ultima posicion de la lista ");
		   System.out.println("Se imprime la lista actualizada "+test.imprimir());
		   System.out.println("Muestra el tamano de la lista actualizada "+test.size());
		  
		   test.clear();
		   System.out.println("Se llama al metodo clean para vaciar la lista ");
		   System.out.println("el tamano de la lista despues de vaciar la lista es "+test.size());
		   System.out.println("Se inserta 27 en la lista ");
		   test.add(27);
		   System.out.println("Se imprime la lista actualizada "+test.imprimir());
		   System.out.println("Muestra el tamano de la lista actualizada "+test.size());
		   test.add(0,40);
		   System.out.println("Se inserto el elemento 40 en la posicion 0  de la lista ");
		   System.out.println("Se imprime la lista actualizada "+test.imprimir());
		   System.out.println("Muestra el tamano de la lista actualizada "+test.size());

		   test.add(2,41);
		   System.out.println("Se inserto el elemento 41 en la posicion 2 de la lista ");
		   System.out.println("Se imprime la lista actualizada "+test.imprimir());
		   System.out.println("Muestra el tamano de la lista actualizada "+test.size());
		   
		   System.out.println("40 esta en la lista?"+test.contains(40));
		   
		   System.out.println("La primera posicion de 40 en la lista es "+test.indexOf(40));
		  System.out.println("El elemento que se encuentra en la posicion 1 de la lista es ");
		   Integer n=test.get(1);
		   if (n!=null)
		   System.out.println(n+" ");
		   else
			   System.out.println("no esta ");
		   
		   boolean b=test.remove(new Integer(40));
		   System.out.println("Se elimino 40 de la lista ");
		   System.out.println("Se imprime la lista actualizada "+test.imprimir());
		   System.out.println("Muestra el tamano de la lista actualizada "+test.size());		   
	}	
}
