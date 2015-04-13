public class Node {

    private int x;
    private int y;
    private Node prev;
    
    public Node(int x, int y){
	this.x = x;
	this.y = y;
    }

    public int getX(){
	return x;
    }

    public int getY(){
	return y;
    }

    public void setPrev(Node p){
	prev = p;
    }

    public Node getPrev(){
	return prev;
    }
    
}
