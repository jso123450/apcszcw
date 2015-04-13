import java.io.*;
import java.util.*;

public class Maze {

    private char[][] board;
    private int maxX;
    private int maxY;
    private char wall = ' ';
    private char exit = '$';
    private char path = '#';
    private char me = 'z';
    private char visited = '.';
    private boolean solved = false;
    private Frontier f;

    public Maze(){
	// instantiate variables
        maxX = 40;
        maxY = 20;
        board = new char[maxX][maxY];
	// read in (load) the maze
	try {
	    Scanner sc = new Scanner(new File("maze.dat"));
	    int j = 0;
	    while (sc.hasNext()){
		String line = sc.nextLine();
		for (int i = 0; i < maxX; i++)
		    {
			board[i][j] = line.charAt(i);
		    }
		j++;
	    }
	}
	catch (Exception e){} // do nothing
    }

    // gives a delay of n milliseconds
    public void wait(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e){} // do nothing
    }

    // print out the maze
    public String toString(){
	String s = "[2J\n";
	for (int y = 0; y < maxY; y++){
	    for (int x=0;x<maxX;x++)
		s = s +board[x][y];
	    s=s+"\n";
	}
	return s;
    }

    // a type of Path Finding
    //    known as a blind/exhaustive/depth first/linear/recursive/backtracking search
    //    this tries basically all the possibilities
    //    possible until we reach the end
    public void solve(int x, int y){
	if (board[x][y] == exit){
	    System.out.println(this);
	    solved = true;
	}
	if (board[x][y] != path || solved)
	    return;
	System.out.println(this);
	System.out.println("(" + x + "," + y + ")");
	wait(50);
        board[x][y] = me;
	solve(x+1,y);
	solve(x-1,y);
	solve(x,y+1);
	solve(x,y-1);
	if (!solved)
	    board[x][y] = visited;
    }

    public void addToFrontier(int x, int y, Node current){
	if (board[x][y] == '#' || board[x][y] == '$'){
	    Node tmp = new Node(x,y);
	    tmp.setPrev(current);
	    f.add(tmp);
	}
    }

    public void bfs(int x, int y){
	f = new Frontier();
	// add initial node to the frontier
	f.add(new Node(x,y));
	
	board[x][y] = 'x';
	Node current = null;
	int tx = 0;
	int ty = 0;
	Node tmp = null;

	while (!(f.isEmpty())){
	    current = f.remove();
	    int cx = current.getX();
	    int cy = current.getY();
	    if (board[cx][cy] == exit)
		break;
	   
	    board[cx][cy] = me;

	    // can factor out the if block
	    tx = cx+1;
	    ty = cy;
	    addToFrontier(tx,ty,current);

	    tx = cx-1;
	    ty = cy;
	    addToFrontier(tx,ty,current);

	    tx = cx;
	    ty = cy+1;
	    addToFrontier(tx,ty,current);

	    tx = cx;
	    ty = cy-1;
	    addToFrontier(tx,ty,current);

	    wait(50);
	    System.out.println(this);

	}

	// recover the path
	for (Node p = current.getPrev(); p != null; p = p.getPrev()){
	    board[p.getX()][p.getY()] = 'P';
	    wait(50);
	    System.out.println(this);
	}

    }

    public static void main(String[] args){
	Maze m = new Maze();
	System.out.println(m);
	//m.solve(1,1);
	m.bfs(1,1);
    }

}

