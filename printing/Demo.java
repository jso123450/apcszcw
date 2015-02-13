public class Demo{

    public static void main(String[] args){
	int i;
	for (i = 0; i < 20; i++)
	    System.out.println(i);
	System.out.println();
	System.out.printf("Hello");
	System.out.printf("World\n");
	System.out.printf("before %s after\n", "middle");
	System.out.printf("before %s after %s shuffle\n", "middle", "more stuff");
	System.out.printf("An int: %d\n", 123);
	System.out.printf("An int: %d , A double: %f\n", 123, 13.37);
	System.out.printf("An int: %d , A double: %10%f", 123, 13.37);
    }

}
