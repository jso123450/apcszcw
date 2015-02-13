import java.util.Random;

public class nQueens {
 
    private char[][] board;
    private char queen = 'Q';
    private char space = '.';
    // num = maxX = maxY = numQueens
    private int num;
    private Random r;
    private boolean solved;

    public nQueens(int n){
        num = n;
	board = new char[num][num];
	for (int i = 0; i < num; i++){
	    for (int j = 0; j < num; j++)
		board[i][j] = space;
	}
    }

    // n in ms
    public void wait(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e){}
    }

    // print out the board
    public String toString(){
	String s = "^[[2J\n";
	for (int i = 0; i < num; i++){
	    for (int j = 0; j < num; j++)
		s+= board[i][j];
	    s+= "\n";
	}
	return s;
    }

    // check if position is legal
    public boolean check(int x, int y){
	boolean legal = true;
	// check the row
	for (int i = 0; i < num; i++){
	    if (board[x][i] == 'Q'){
		legal = false;
		break;
	    }
	}
	// check the column
	for (int i = 0; i < num; i++){
	    if (board[i][y] == 'Q'){
		legal = false;
		break;
	    }
	}
	// check diagonals
	int x2 = x;
	int y2 = y;
	while (x2 > 0 || y2 > 0){
	    x2--;
	    y2--;
	}
	while (x2 < num || y2 < num){
	    legal = false;
	    break;
	}
	return legal;
    }

    // solving method
    public void solve(int x, int y){
	if (solved)
	    return;
	if (check(x, y)){
	    board[x][y] = queen;
	    x++;
	    System.out.println(this);
	    if (x == num - 1)
		solved = true;
	}
	else
	    return;
	wait(50);
	int ry = r.nextInt(num);
	solve(x+1,ry);
	System.out.println(this);
    }

    public static void main(String[] args){
	nQueens nQ = new nQueens(5);
	System.out.println(nQ);
	nQ.solve(0,1);
    }
}
