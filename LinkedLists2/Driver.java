import java.util.Random;

public class Driver {

    public static void main(String[] args){
	Random r = new Random();
	LList ll = new LList();
	for (int i = 0; i < 10; i++)
	    ll.add(r.nextInt(100) + "");
	System.out.println(ll);
    }

}
