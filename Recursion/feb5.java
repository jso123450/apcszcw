public class feb5{

    public void printme(int n){
	if (n > 0){
	    printme(n-1);
	    System.out.println(n);
	}
    }

    public int fact(int n){
	if (n == 0)
	    return 1;
	else if (n > 0){
	    return (n * fact(n-1));
	}
	return 0;
    }

    public static void main(String[] args){
	feb5 test = new feb5();
	test.printme(5);
	test.fact(5);
	test.fact(-5);
    }

}
