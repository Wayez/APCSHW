import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;
import java.util.*;
public class WordGrid{
    private int rows, cols;
    private ArrayList Words=new ArrayList();
    private ArrayList PossibleWords=new ArrayList();
    private String[][] Data;
     /**Initialize the grid to the size specified and fill all of the positions
     *with spaces.
     *@param row is the starting height of the WordGrid
     *@param col is the starting width of the WordGrid
     */
    public WordGrid(){
	this(10,10);
    }
    public WordGrid(int rows,int cols){
	Data=new String[rows][cols];
	this.rows=rows;
	this.cols=cols;
	clear();
    }

    /**Set all values in the WordGrid to spaces ' '*/
    private void clear(){
	for (int x=0; x<Data.length; x++){
	    for (int y=0;y<Data[0].length; y++){
		Data[x][y]="_";
	    }
	}
    }

    /**The proper formatting for a WordGrid is created in the toString.
     *@return a String with each character separated by spaces, and each row
     *separated by newlines.
     */
    public String toString(){
	String ans="";
	for (int x=0; x<Data.length; x++){
	    for (int y=0;y<Data[0].length; y++){
		ans+=" "+Data[x][y]+" ";
	    }
	    ans+="\n\n";
	}
	return ans;
	
    }

    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     */
    public boolean inBounds(int row, int col){
	return (row<Data.length && row>=0 && col<Data[0].length && col>=0); 
    }
    public boolean fits(String letter, int row, int col){
	//System.out.println(Data[row][col]);
	//System.out.println(letter);
	return Data[row][col].equalsIgnoreCase(letter) || Data[row][col].equals("_");
    }
    public boolean addWordHorizontal(String word,int row, int col){
	int x=col;
	for (int y=0; y<word.length(); y++){
	    if (inBounds(row, x) && fits(word.substring(y,y+1), row, x)){
	    } else {
		return false;
	    }
	    x++;
	}
	x=col;
	for (int z=0; z<word.length(); z++){
	    Data[row][x]=word.substring(z,z+1).toUpperCase();
	    x++;
	}
	Words.add(word);
	return true;
    }
    public boolean addWordHorizontal2(String word,int row, int col){
	int x=col;
	for (int y=0; y<word.length(); y++){
	    if (inBounds(row, x) && fits(word.substring(y,y+1), row, x)){
	    } else {
		return false;
	    }
	    x--;
	}
	x=col;
	for (int z=0; z<word.length(); z++){
	    Data[row][x]=word.substring(z,z+1).toUpperCase();
	    x--;
	}
	Words.add(word);
	return true;
    }
    public boolean addWordVertical(String word,int row, int col){
	int x=row;
	for (int y=0; y<word.length(); y++){
	    if (inBounds(x, col) && fits(word.substring(y,y+1), x, col)){
	    } else {
		return false;
	    }
	    x++;
	}
	x=row;
	for (int z=0; z<word.length(); z++){
	    Data[x][col]=word.substring(z,z+1).toUpperCase();
	    x++;
	}
	Words.add(word);
	return true;
    }
    public boolean addWordVertical2(String word,int row, int col){
	int x=row;
	for (int y=0; y<word.length(); y++){
	    if (inBounds(x, col) && fits(word.substring(y,y+1), x, col)){
	    } else {
		return false;
	    }
	    x--;
	}
	x=row;
	for (int z=0; z<word.length(); z++){
	    Data[x][col]=word.substring(z,z+1).toUpperCase();
	    x--;
	}
	Words.add(word);
	return true;
    }
    public boolean addWordDiagonal(String word,int row, int col){
	int x=row;
	int y=col;
	for (int z=0; z<word.length(); z++){
	    if (inBounds(x, y) && fits(word.substring(z,z+1), x, y)){
	    } else {
		return false;
	    }
	    x++;
	    y++;
	}
	x=row;
	y=col;
	for (int z=0; z<word.length(); z++){
	    Data[x][y]=word.substring(z,z+1).toUpperCase();
	    x++;
	    y++;
	}
	Words.add(word);
	return true;
    }
    public boolean addWordDiagonal2(String word,int row, int col){
	int x=row;
	int y=col;
	for (int z=0; z<word.length(); z++){
	    if (inBounds(x, y) && fits(word.substring(z,z+1), x, y)){
	    } else {
		return false;
	    }
	    x--;
	    y++;
	}
	x=row;
	y=col;
	for (int z=0; z<word.length(); z++){
	    Data[x][y]=word.substring(z,z+1).toUpperCase();
	    x--;
	    y++;
	}
	Words.add(word);
	return true;
    }
    
    public boolean addWordDiagonal3(String word,int row, int col){
	int x=row;
	int y=col;
	for (int z=0; z<word.length(); z++){
	    if (inBounds(x, y) && fits(word.substring(z,z+1), x, y)){
	    } else {
		return false;
	    }
	    x++;
	    y--;
	}
	x=row;
	y=col;
	for (int z=0; z<word.length(); z++){
	    Data[x][y]=word.substring(z,z+1).toUpperCase();
	    x++;
	    y--;
	}
	Words.add(word);
	return true;
    }
    
    public boolean addWordDiagonal4(String word,int row, int col){
	int x=row;
	int y=col;
	for (int z=0; z<word.length(); z++){
	    if (inBounds(x, y) && fits(word.substring(z,z+1), x, y)){
	    } else {
		return false;
	    }
	    x--;
	    y--;
	}
	x=row;
	y=col;
	for (int z=0; z<word.length(); z++){
	    Data[x][y]=word.substring(z,z+1).toUpperCase();
	    x--;
	    y--;
	}
	Words.add(word);
	return true;
    }
    
    public void randomize(){
	String alpha="qwertyuiopasdfghjklzxcvbnm";
	for (int x=0; x<Data.length; x++){
	    for (int y=0; y<Data[0].length; y++){
		if (Data[x][y].equals("_")){
		    Random index=new Random();
		    int letter=index.nextInt(alpha.length());
		    Data[x][y]=alpha.substring(letter,letter+1).toUpperCase();
		}
	    }
	}
    }

    public String WordBox(){
	String Box = "";
	for (int x=0; x<Words.size(); x++){
	    float z=10;
	    Box+=x+1+". "+Words.get(x)+" ";
	}
	return Box;
    }

    public void insert(String word){
	Random Row=new Random();
	Random Col=new Random();
	Random Dir=new Random();
	int y,x;
	for (int z=0; z<rows*rows*cols; z++){
	    y=Row.nextInt(rows);
	    x=Col.nextInt(cols);
	    int dir=Dir.nextInt(8);
	    if (Words.indexOf(word)==-1){
		for (int a=1; a<8; a++){
		    if (dir==0 && addWordHorizontal(word, y, x)){
			break;
		    } else {
			dir++;
		    }
		    if (dir==1 && addWordHorizontal2(word, y, x)){
			break;
		    } else {
			dir++;
		    }
		    if (dir==2 && addWordVertical(word, y, x)){
			break;
		    } else {
			dir++;
		    }
		    if (dir==3 && addWordVertical2(word, y, x)){
			break;
		    } else {
			dir++;
		    }
		    if (dir==4 && addWordDiagonal(word, y, x)){
			break;
		    } else {
			dir++;
		    }
		    if (dir==5 && addWordDiagonal2(word, y, x)){
			break;
		    } else {
			dir++;
		    }
		    if (dir==6 && addWordDiagonal3(word, y, x)){
			break;
		    } else {
			dir++;
		    }
		    if (dir==7 && addWordDiagonal4(word, y, x)){
			break;
		    } else {
			dir=0;
		    }
		}
	    }
	}
    }
	    
	
    public void setWordSearch(){
	File text=new File("C:/User/Wayez/Downloads/APCS/APCSHW/03WordSearch/words.txt");
	Scanner scnr=new Scanner(System.in);
	try {
	scnr=new Scanner(text);
	} catch(FileNotFoundException e){
	}
	while (scnr.hasNextLine()){
	    String wrd=scnr.nextLine();
	    if(wrd.length()>=3){
		PossibleWords.add(wrd);
	    } else {
		PossibleWords.add("Konstantinovich");
	    }
	}
	for (int x=0; x<PossibleWords.size(); x++){
	    Random rand=new Random();
	    int index=rand.nextInt(PossibleWords.size());
	    insert(PossibleWords.get(index).toString());
	}
    }
       
	

	
			
					 

    //vertical + diagonal should be implemented as well.
} 
