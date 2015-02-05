public class feb5{

    public void printme(int n){
	if (n > 0){
	    printme(n-1);
	    System.out.println(n);
	}
    }

    public static void main(String[] args){
	feb5 test = new feb5();
	test.printme(5);
    }

}
