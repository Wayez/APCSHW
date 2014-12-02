import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Driver{
    public static WordGrid start(){
	WordGrid A=new WordGrid();
	int row, col;
	System.out.println("***Welcome to Wayez's Wordsearch***");
	for (int i=0; i>=0; i++){
	    System.out.println();
	    System.out.println("Set the Dimensions of your Wordsearch");
	    System.out.println("Set Height(5 min, 20 max)");
	    try{
		Scanner size=new Scanner(System.in);
		row=size.nextInt();
		System.out.println("Set Width(5 min, 50 max)");
		col=size.nextInt();
		if (col>=5 && col<=50 && row>=5 && row<=20){
		    A=new WordGrid(row, col);
		    break;
		} else {
		    System.out.println("You're Dumb");
		    System.out.println();
		}
	    } catch (InputMismatchException e){
		System.out.println("If you're not smart enough to tell the difference between a letter and number, you probably shouldn't be playing this wordsearch.");
		System.out.println();
	    
	    }
	}
	return A;	
	
    }
    public static void set(String[] args){
	if (args.length==0){
	    System.out.println("Select Arguments\nFirst Argument:\n0: Regular Wordsearch\n1: Answers Included\nSecond Argument\nRandom Seed Number");
	}
	if (args.length==1){
	    if (args[0].equals("0")){
		WordGrid A=start();
		A.setWordSearch();
		System.out.println(A.WordBox());
		System.out.println();
		System.out.println();
		System.out.println();
		A.randomize();
		System.out.println(A.toString());
	    } else if (args[0].equals("1")){
		WordGrid A=start();
		A.setWordSearch();
		System.out.println(A.toString());
		System.out.println();
		System.out.println();
		System.out.println(A.WordBox());
		System.out.println();
		System.out.println();
		System.out.println();
		A.randomize();
		System.out.println(A.toString());
	    } else {
		System.out.println("Select Arguments\nFirst Argument:\n0: Regular Wordsearch\n1: Answers Included\nSecond Argument\nRandom Seed Number");
	    }
		
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
