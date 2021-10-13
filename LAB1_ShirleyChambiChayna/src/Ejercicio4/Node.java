package Ejercicio4;


public class Node<T> {
	public Node<T>nextNode;
	public T data;
	public Node(T elemento,Node<T>siguiente) {
		this.data=elemento;
		this.nextNode=siguiente;
	}
	public Node(T dato) {
		this(dato,null);
	}
}