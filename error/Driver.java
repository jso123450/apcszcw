public class Driver{

    public static void main(String[] args){
        Eexample ee = new Eexample();
	System.out.println("Before the error test");
	ee.etest(1);
	System.out.println("After the error test");
	try {
	    ee.etest(11);
	    System.out.println("call to etest finished");
	} catch (IndexOutOfBoundsException e){
	    System.out.println("IOB crashed with " + e);
	} catch (ArithmeticException e){
	    System.out.println("Arith crashed with " + e);
	} catch (Exception e){
	    System.out.println("Catch all at the end " + e);
	}
    }

}
