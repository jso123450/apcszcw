import java.io.*;
import java.util.*;
import java.lang.System;

public class TimeTest{

    private ArrayList<Integer> AL = new ArrayList<Integer>();
    private LList LL = new LList();
    private LinkedList<Integer> biLL = new LinkedList<Integer>();
    private Random r = new Random();

    public void setupAL(int len){
        for (int i = 0; i < len; i++)
	    AL.add(r.nextInt(11));
    }

    public int sumAL(){
	int sum = 0;
	for (int i = 0; i < AL.size(); i++)
	    sum+= AL.get(i);
	return sum;
    }
    
    public void setupLL(int len){
	for (int i = 0; i < len; i++)
	    LL.add(r.nextInt(11));
    }

    public int sumLL(){
	int sum = 0;
	for (int i = 0; i < LL.getLen(); i++)
	    sum+= LL.get(i);
	return sum;
    }

    public void setupBILL(int len){
	for (int i = 0; i < len; i++)
	    biLL.add(r.nextInt(11));
    }

    public int sumBILL(){
	int sum = 0;
	for (int i = 0; i < biLL.size(); i++)
	    sum+= biLL.get(i);
	return sum;
    }

    public static void main(String[] args){
	/*
	long t = System.currentTimeMillis();
	System.out.println(t);
	long start, elapsed;
	start = System.currentTimeMillis();
	// do stuff here
	elapsed = System.currentTimeMillis() - start;
	*/

        TimeTest t = new TimeTest();
        t.setupAL(10000);
	long start, elapsed;
	start = System.currentTimeMillis();
	int sumAL = t.sumAL();
	elapsed = System.currentTimeMillis() - start;
	System.out.println(elapsed);
	System.out.println(sumAL);
	t.setupLL(100);
    }

}
