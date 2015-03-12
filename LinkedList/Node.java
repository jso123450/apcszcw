public class Node {

    private String data;
    private Node next;

    public Node(String s){
	data = s;
    }

    public void setData(String s){
	data = s;
    }

    public String getData(){
	return data;
    }

    public void setNext(Node n){
	next = n;
    }

    public Node getNext(){
	return next;
    }

    public String toString(){
	return data;
    }

    public void getRest(){
	for (Node tmp = this; tmp != null; tmp = tmp.getNext())
	    System.out.println(tmp);
    }
}
