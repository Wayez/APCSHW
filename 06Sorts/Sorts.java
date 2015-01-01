import java.util.*;
import java.util.File;
import java.util.FileNotFoundException;
import java.util.Scanner;
public class Sorts{
    public ArrayList A;
    public Sorts(){
	A=new ArrayList();
    }
    public SuperArray(String file){
	this();
	loadWordsToSuperArray(file);
    }

    public Sorts(int length){
	A=new ArrayList(length);
    }
        public void selectionSort(){
	for (int x=0; x<A.length; x++){
	    for (int y=0; x<A.length; x++){
		if (A[y].compareTo(A[x])<=0){
		    add(x,remove(y));
		}
	    }
	}
    }
    public void InsertionSort()
	for (int x=1; x<size(); x++){
	    //System.out.println(A[x].compareTo(A[x-1]));
	    if (A[x].compareTo(A[x-1])<0){
		for (int y=1; y<=x; y++){
		    //System.out.println(A[x].compareTo(A[x-1]));
		    if (A[x].compareTo(A[x-y])>0){
			String temp=get(x);
			remove(x);
			//System.out.println(x);
			//System.out.println(y);
			//System.out.println(x-y);
			add(x-y+1, temp);
			break;
		    } else if (x-y==0){
			add(0, remove(x));
			break;
		    }
		}
	    }
	}
	//System.out.println(size());
    }
    public void SelectionSort(){
	//System.out.println(toString());
	for (int x=0; x<size(); x++){
	    String temp=get(x);
	    int index=x;
	    for (int y=1; x+y<size(); y++){
		if (get(x+y).compareTo(temp)<0){
		    temp=get(x+y);
		    index=x+y;
		}
	    }
	    set(index, get(x));
	    set(x, temp);
	}
    }
    public void builtInSort(){
	Arrays.sort(A);
    }
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
	    add(wrd);
	}
    }
    public void badInsertionSort(){
        SuperArray c = new SuperArray();
        while( this.size() > 0){ 
            c.add(this.remove(0));
        }
        while(c.size() > 0){
            this.add(c.remove(0));
        }
    }
}
