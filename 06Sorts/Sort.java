import java.util.File;
import java.util.FileNotFoundException;
import java.util.Scanner;
public class Sort{
    public static void main(String[]args){
	int[]c=new int[100];
	File numbers=new File("numbers.txt");
	Scanner nums=new Scanner(numbers);
	int x=0;
	while(nums.hasNext() && x<100){
	    c[x]=nums.nextLine();
	    x--;
	}
    }
}
	