import java.io.*;
import java.util.*;

public class LLiterator<E> implements Iterator<E>{

    private Node<E> l;
    private E lastElemRet;

    public LLiterator(Node<E> n){
	l = n;
    }

    public boolean hasNext(){
	return l != null;
    }

    /*
      move to the next node
      returns the value in original node
    */
    public E next(){
	E data = l.getData();
	l = l.getNext();
	lastElemRet = data;
	return data;
    }
    
    public void remove() {
	// if next has not yet been called or remove has
	// already been called after the last call to next
	if (lastElemRet == null)
	    throw new IllegalStateException();
	
        // remove
	lastElemRet = null;
    }



}
