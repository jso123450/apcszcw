import java.util.*;

public class Driver{

    public void removeDup(ArrayList array){
	int holder = array[0];
	for (int = 0; i < array.length; i++){
	    if (array[i] == array[i+1])
		array.remove[i+1];
	}
    }

    public static void main(String[] args){
	// need to specify what type of objects al will store
	ArrayList<String> al;
	al = new ArrayList<String>();
	System.out.println(al);
	al.add("hello");
	System.out.println(al);
	al.add("world");
	System.out.println(al);
	al.add("33.2");
	System.out.println(al);

	ArrayList<Integer> ai = new ArrayList<Integer>();
	Random r = new Random();
	for (int i =0; i < 20; i++){
	    ai.add(r.nextInt(5));;
	}
	System.out.println(ai);
	removeDup(ai);
	System.out.println(ai);
    

    }
    
}
