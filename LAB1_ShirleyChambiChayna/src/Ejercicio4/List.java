package Ejercicio4;

public class List<T> {
private Node<T> root;
private int tamano;
private Node<T> fin;
public List() {
	root=null;
	tamano=0;
    fin=null;
}
public boolean add(T e) {
	Node<T> nuevo=new Node<T>(e);
	if(this.root==null)
		this.root=this.fin=nuevo;
	else
		this.fin=this.fin.nextNode=nuevo;
	++this.tamano;
	return true;
}
public int size() {
	return this.tamano;
}
public void add(int index,T element) {
	if(this.root==null ||index>this.size())return;
	Node<T> actual=this.root,anterior=this.root;
	Node <T>nuevo=new Node<T>(element);
	if(index==0) {
		nuevo.nextNode=this.root;
		this.root=nuevo;
		
	}else {
	
	for(int i=0;actual!=null &&i<index;++i) {
		anterior=actual;
		actual=actual.nextNode;
	}
	nuevo.nextNode=actual;
	anterior.nextNode=nuevo;
	if(actual==null)
		fin=fin.nextNode=nuevo;
	
	}
	++this.tamano;
}
public void clear() {
	Node<T> actual=null;
	while(this.root!=null) {
		actual=this.root;
		this.root=this.root.nextNode;
		actual.data=null;
		actual=null;
		--this.tamano;
	}
	this.fin=null;
}
public boolean contains(T dato) {
	Node<T> actual=this.root;
	for(;actual!=null;actual=actual.nextNode) {
		 if(actual.data.equals(dato)==true)
			 return true;
	}
	
	return false;
}
public T get(int index) {
	Node<T> actual=this.root;
	if(actual==null || index>=this.size()) return null;
	T dato=null;
	int count=0;
	while( actual!=null) {
		if(count==index)
		return actual.data;
		actual=actual.nextNode;
		++count;
	}
	
return null;
}
public int indexOf(T dato) {
	Node<T> actual=this.root;
	
	for(int i=0;actual!=null;actual=actual.nextNode,++i) {
		if (actual.data.equals(dato)==true)
			return i;
	}
		
	
	return -1;
	
}
public int lastindexOf(T dato) {
	Node<T> actual=this.root;
	int index=-1;
	for(int i=0;actual!=null;actual=actual.nextNode,++i) {
		if (actual.data.equals(dato)==true)
			index=i;
	}
		
	
	return index;
	
}
public T set(int index,T elemento) {
	if(index>=this.size())return null;
	T dato=null;
	Node<T> actual=this.root;
	for(int i=0;actual!=null;actual=actual.nextNode,++i) {
		if (i==index) {
			actual.data=elemento;
			dato=actual.data;
			break;
		}
	}
	return dato;
}
public T remove(int index) {
	if(this.root==null || this.size()<=index)return null;
	T dato=null;
	Node<T> actual=this.root,anterior=this.root;
	int count=0;
	while(actual!=null && count<index) {
		anterior=actual;
		actual=actual.nextNode;
		++count;
	}
	
	if(actual==anterior) {
		this.root=this.root.nextNode;
	}else {
		anterior.nextNode=actual.nextNode;
	}
	--tamano;
	if(actual==fin) {
		fin=anterior;
	}
	return actual.data;
}
public boolean remove(T dato) {
	
	Node<T> actual=this.root,anterior=this.root;
	
	while(actual!=null && actual.data.equals(dato)==false) {
		anterior=actual;
		actual=actual.nextNode;
	
	}
	if(actual==null)return false;
	if(actual==anterior) {
		this.root=this.root.nextNode;
	}else {
		anterior.nextNode=actual.nextNode;
	}
	--tamano;
	if(actual==fin) {
		fin=anterior;
	}
	return true;
}
public boolean isEmpty() {
	return (this.root==null);
}
public String imprimir() {
	// TODO Auto-generated method stub
	String n="";
	Node<T> actual=this.root;
	if(this.tamano==0)return null;
	for(;actual!=null;actual=actual.nextNode ) 
    n+=actual.data.toString()+" ";
	return n;
}
}

