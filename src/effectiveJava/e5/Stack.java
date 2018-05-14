package effectiveJava.e5;

import java.util.Arrays;
import java.util.Collection;
import java.util.EmptyStackException;

public class Stack<E> {
	
	private E[] elements;
	private int size = 0;
	private static final int DEFAULT_INITAL_CAPCITY = 16;
	
	@SuppressWarnings("checked")
	public Stack(){
		elements = (E[])new Object[DEFAULT_INITAL_CAPCITY];
	}
	
	public void push(E e){
		ensureCapacity();
		elements[size++] = e;
	}
	
	public E pop(){
		if(size == 0)
			throw new EmptyStackException();
		@SuppressWarnings("unchecked")
		E result = elements[--size];
		elements[size] = null;
		return result;
	}
	
	public void ensureCapacity(){
		if(elements.length == size){
			elements = Arrays.copyOf(elements, 2*size+1);
		}
	}
	
	public void pushAll(Iterable<? extends E> src){
		for(E e: src){
			push(e);
		}
	}
	
	public void popAll(Collection<? super E> dist){
		while(this.size>0){
			dist.add(pop());
		}
	}
	
	public int size(){
		return size;
	}
}
