public class WordList{

    private ArrayList<String> myList; // contains Strings made up of letters

    public int numWordsOfLength(int len){
	int output = 0;
	for (int i = 0; i < myList.size(); i++){
	    if (myList.get(i).length() == len)
		output++;
	}
	return output;
    }
    
    public void removeWordsOfLength(int len){
	int i = 0;
	while (i < myList.size()){
	    if (myList.get(i).length() == len)
		myList.remove(i);
	    else
		i++;
	}
    }
    
}
