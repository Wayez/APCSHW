import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Sorts{
    public ArrayList<Integer> A;
    public Sorts(){
	A=new ArrayList();
    }
    public Sorts(String file){
	this();
	loadWordsToSuperArray(file);
    }

    public Sorts(int length){
	A=new ArrayList(length);
    }
    public void selection(){
	for (int x=0; x<A.size(); x++){
	    for (int y=0; x<A.size(); x++){
		if (A.get(y)<=A.get(x)){
		    A.add(x,A.remove(y));
		}
	    }
	}
    }
    public void bubble(){
	int y=A.size()-1;
	for (int x=0; x<y; x++){
	    if (A.get(x)>A.get(x+1)){
		int z=A.get(x);
		A.set(x, A.get(x+1));
		A.set(x+1, z);
	    }
	    y--;
	}
    }
    public void insertion(){
	for (int x=1; x<A.size(); x++){
	    //System.out.println(A[x].compareTo(A[x-1]));
	    if (A.get(x)<A.get(x-1)){
		for (int y=1; y<=x; y++){
		    //System.out.println(A[x].compareTo(A[x-1]));
		    if (A.get(x)>A.get(x-1)){
			int temp=A.get(x);
			A.remove(x);
			//System.out.println(x);
			//System.out.println(y);
			//System.out.println(x-y);
			A.add(x-y+1, temp);
			break;
		    } else if (x-y==0){
			A.add(0, A.remove(x));
			break;
		    }
		}
	    }
	}
	//System.out.println(size());
    }
//  public void builtInSort(){
//	Arrays.sort(A);
//  }
    public void loadWordsToSuperArray(String file){
	File word=new File(file);
	Scanner scnr=new Scanner(System.in);
	try {
	scnr=new Scanner(word);
	} catch(FileNotFoundException e){
	    System.out.println("lOL");
	}
	while (scnr.hasNextLine()){
	    String wrd=scnr.nextLine();
	    int num=Integer.parseInt(wrd);
	    A.add(num);
	}
    }
}
/*   public void badInsertionSort(){
        SuperArray c = new SuperArray();
        while( this.size() > 0){ 
            c.add(this.remove(0));
        }
        while(c.size() > 0){
            this.add(c.remove(0));
        }
    }
}

*/
