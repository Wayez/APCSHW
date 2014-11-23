import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Driver{
    public static WordGrid start(){
	WordGrid A=new WordGrid();
	int row, col;
	System.out.println("***Welcome to Wayez's Wordsearch***");
	for (int i=0; i>=0; i++){
	    System.out.println("Set the Dimensions of your Wordsearch");
	    System.out.println("Set Height(5 min, 20 max)");
	    Scanner size=new Scanner(System.in);
	    row=size.nextInt();
	    System.out.println("Set Width(5 min, 50 max)");
	    col=size.nextInt();
	    if (col>=5 && col<=50 && row>=5 && row<=20){
		A=new WordGrid(row, col);
		break;
	    } else {
		System.out.println("You're Dumb");
	    }
	}
	return A;	
    }
	
	    
    public static void main(String[]args){
	WordGrid A=start();
	System.out.println(A.addWordHorizontal("Wayez", 0, 0));
	System.out.println(A.addWordHorizontal("Wayez", 4, 3));
	System.out.println(A.addWordVertical("Wayez", 0, 0));
	System.out.println(A.addWordVertical("Yelow", 0, 2));
	System.out.println(A.addWordVertical("Wayez", 5, 7));
	System.out.println(A.addWordVertical("Wayez", 0, 1));
	System.out.println(A.addWordVertical("LOL", 2, 1));
	System.out.println(A.addWordDiagonal("Wayez", 0, 0));
	System.out.println(A.addWordDiagonal("Wally", 0, 0));
	System.out.println(A.addWordDiagonal("yes", 0, 2));
	System.out.println(A.WordBox());
	System.out.println();
	System.out.println();
	System.out.println();
	A.randomize();
        System.out.println(A.toString());
    }
}
