import java.io.*;
import java.util.*;

public class Mode {

    /*----------- Instance Variables --------*/
    int[] a;
    Random r;

		
    /*----------- Constructors --------*/
    public Mode() {
	this(20,100);
    }

    public Mode(int n) {
	this(n,100);
    }

    /*
      n - size of the array
      m - max value for each element
    */
    public Mode(int n,int m){
	r = new Random();
	a = new int[n];
	for (int i=0;i<n;i++){
	    a[i] = r.nextInt(m);
	}
    }

		
    /*----------- methods --------*/

    public String toString() {
	String s = "";
	for (int i=0;i<a.length;i++)
	    s = s  + a[i]+", ";
	return s;
    }

    public int freq(int n){
	int count = 0;
	for (int i=0;i<a.length;i++){
	    if (a[i] == n){
		count = count + 1;
	    }
	}
	return count;
    }

    public int maxVal(int[] param){
	int output = param[0];
	for (int i = 1; i < param.length; i++){
	    if (param[i] > output){
		output = param[i];
	    }
	}
	return output;
    }

    public int maxValIndex(int[] param){
	int output = 0;
	for (int i = 1; i < param.length; i++){
	    if (param[i] > param[output]){
		output = i;
	    }
	}
	return output;
    }

    public int mode(){
	int modeSoFar=a[0],
	    modeCount=freq(a[0]);
				
	for (int i=0;i<a.length;i++){
	    if (freq(a[i])>modeCount){
		modeSoFar = a[i];
		modeCount = freq(a[i]);
	    }
	}
	/* just for testing purposes */
	System.out.println("Modecount: "+modeCount);
	return modeSoFar;
    }

    public int fastmode(){
	int[] tally = new int[ maxVal( a ) + 1 ];
	// Java initializes the array to all 0s so we don't have to do it
	// Other languages, like C, don't, so we would have to initialize everything to 0
	for (int i = 0; i < a.length; i++){
	    tally[ a[i] ]++;
	}
	int maxIndex = maxValIndex(tally);
	System.out.println( "Fastmode count: " + tally[ maxIndex ] );
        return maxIndex;
    }
    
    /*----------- main --------*/

    public static void main(String[] args) {
	int arraylength=20,
	    maxvalue=20;

	if (args.length > 0) {
	    arraylength = Integer.parseInt(args[0]);
	}
	if (args.length > 1) {
	    maxvalue = Integer.parseInt(args[1]);
	}
				
	Mode m = new Mode(arraylength,maxvalue);
	// System.out.println(m);
	//System.out.println("Mode value: "+m.mode());
        System.out.println("Fastmode value: " + m.fastmode());
    }

}
