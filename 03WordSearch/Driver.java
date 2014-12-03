import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Driver{
    public static WordGrid start(int row, int col,long seed){
	WordGrid A=new WordGrid(row, col, seed);
	return A;	
	
    }
    public static void set(String[] args){
	if (args.length==0){
	    System.out.println("Set Arguments\nFirst Argument:\nRows (5 min, 20 max)\n\nSecond Argument:\nCols (5 min, 50 max)\n\nThird Argument:\nRandom Seed Number\n\nForth Argument:\n1: Answer Key\nBlank or not 1: Wordsearch ");
	}
	if (args.length==4 || args.length==3){
	    int row=Integer.parseInt(args[0]);
	    int col=Integer.parseInt(args[1]);
	    long seed=Long.parseLong(args[2]);
	    if (col>=5 && col<=50 && row>=5 && row<=20){
	    
		if (args.length==4 && args[3].equals("1")){
		    WordGrid A=start(row, col, seed);
		    //A.setWordSearch();
		    A.loadWordsFromFile("words.txt", false);
		    System.out.println(A.WordBox());
		    System.out.println();
		    System.out.println();
		    System.out.println();
		    System.out.println(A.toString());
		} else {
		    WordGrid A=start(row, col, seed);
		    //A.setWordSearch();
		    //System.out.println(A.toString());
		    //System.out.println();
		    //System.out.println();
		    A.loadWordsFromFile("words.txt", true);
		    System.out.println(A.WordBox());
		    System.out.println();
		    System.out.println();
		    System.out.println();
		    System.out.println(A.toString());
		} 
	    } else {
		System.out.println("You're Dumb. Make sure your col and row arguments are in correct interval");
		System.out.println();
		
	    }
		
	} else {
	    System.out.println("Set Arguments\nFirst Argument:\nRows (5 min, 20 max)\n\nSecond Argument:\nCols (5 min, 50 max)\n\nThird Argument:\nRandom Seed Number\n\nForth Argument:\n0: Regular Wordsearch\n1: Cheatsheet Included");
	}
		   
    }
	
	    
    public static void main(String[]args){
	set(args);
	//WordGrid A=start();
	//A.setWordSearch();
	//A.play();
	//System.out.println(A.WordBox());
	//System.out.println();
	//System.out.println();
	//System.out.println();
	//A.randomize();
        //System.out.println(A.toString());
    }
}
