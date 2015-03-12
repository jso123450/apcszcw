public class Driver{

    public static void main(String[] args){
	Node n = new Node("hello");
	//System.out.println(n);

	Node n2 = new Node("World");
	//System.out.println(n2);

	n.setNext(n2);

	//System.out.println(n.getNext().getData());
	//System.out.println(n.getNext());

	n.getNext().setData("pickle");
	//System.out.println(n2);
	//System.out.println(n.getNext().getData());

	n2.setData("watermelon");
	//System.out.println(n.getNext().getData());
	
	// n2's next will refer to a new node with 
	// data "abc" whose next points to null
	n2.setNext(new Node("abc"));
	//System.out.println(n.getNext().getNext().getData()); // lol

	n.getNext().getNext().setNext(new Node("yabba dabba doo"));
	//System.out.println(n.getNext().getNext().getNext().getData());

	// keep n at the start of the list
	Node tmp = new Node("start");
	tmp.setNext(n);
	n = tmp;
	//System.out.println(tmp);
	//System.out.println(n);
	//System.out.println(n.getNext());

	tmp = n;
	while (tmp != null){
	    System.out.println(tmp);
	    tmp = tmp.getNext();
	}
	System.out.println();
	for (tmp = n; tmp != null; tmp = tmp.getNext())
	    System.out.println(tmp);
	System.out.println();
	tmp = n;
	tmp.getRest();
    }

}
