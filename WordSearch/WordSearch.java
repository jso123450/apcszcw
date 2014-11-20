public class WordSearch {

    /* ----------------------- Instance Variables --------------------- */
    
    private char[][] board;

    /* ------------------------- Constructors ------------------------- */
    
    public WordSearch(){
	this(20,40);
    }
    
    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++){
	    for (int j = 0; j < board[i].length; j++){
		// . is used as a placeholder; default value is null
		// which is non-printing; not good for testing
		// single quotes are used for individual characters
		board[i][j] = '.';
	    }
	}
    }

    /* -------------------------- Methods ----------------------------- */

    public String toString(){
	String output = "";
	for (int i = 0; i < board.length; i++){
	    for (int j = 0; j < board[i].length; j++){
		output+= board[i][j];
	    }
	    output+= "\n";
	}
	return output;
    }

    public void addWordH(String w, int row, int col){
	int c = col;
	for (int i = 0; i < w.length(); i++){
	    board[row][c] = w.charAt(i);
	    c++;
	}
    }

    /* --------------------------- Main ------------------------------- */
    public static void main(String[] args){
	WordSearch w = new WordSearch();
	System.out.println(w);
	w.addWordH("hello",3,15); // should work
	//w.addWordH("look",3,14); // test illegal overlap
	//w.addWordH("look",3,18); // test legal overlap
	//w.addWordH("look",-3,20); // test illegal row
	//w.addWordH("look",3,55); // test illegal col
	//w.addWordH("look",3,39); // test IndexOutOfBounds
	System.out.println(w);
    }
}
    
