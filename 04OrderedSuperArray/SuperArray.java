import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
public class SuperArray{
    public String[] A;
    public int size;
    public SuperArray(){
	this(10);
	size=0;
    }
    public SuperArray(String file){
	this();
	//System.out.println();
	loadWordsToSuperArray(file);
    }

    public SuperArray(int length){
	//A=new String[10];
	A=new String[length];
	size=0;
    }
    public String toString(){
	String ans="[ ";
	for (int x=0; x<size; x++){
	    ans+=A[x]+" ";
	}
	ans +="]";
	return ans;
    }
    public void add(){
	this.add(new String());
    }
    public void add(int index, String e){
	if (size==0){
	    A[0]=e;
	    size++;
	}
	else if (size<A.length){
	    String[] B=new String[A.length];
	    for(int x=0;x<=index;x++){
		B[x]=get(x);
	    }
	    B[index]=e;
	    for(int y=index+1;y<B.length;y++){
		B[y]=get(y-1);
	    }
	    size++;
	    A=B;
	} else {
	    String[] B=new String[size+1];
	    for(int x=0;x<=index;x++){
		B[x]=get(x);
	    }
	    B[index]=e;
	    for(int y=index+1;y<B.length;y++){
		B[y]=get(y-1);
	    }
	    size++;
	    A=B;
	}
    }
    /*public void add(int index, String e){
	if (size<A.length){
	    String[] B=new String[A.length];
	    for(int x=0;x<index;x++){
		B[x]=A[x];
		if (size==0){
		    A[0]=e;
		    size++;
		    A=B;
		}
	    }
	}
    }
    */
    
	    
    public void add(String e){
	if (size<A.length){
	    A[size]=e;
	    size++;
	} else {
	    String[] B=new String[size+1];
	    for (int y=0; y<A.length; y++){
		B[y]=A[y];
	    }
	    B[size]=e;
	    size++;
	    A=B;
	}
    }
    public int size(){
	return this.size;
    }
    public void resize(int newCapacity){
	String[] B=new String[newCapacity];
	if (B.length>=size){
	    for (int x=0; x<size; x++){
		B[x]=A[x];
	    }
	} else {
	    for (int y=0; y<B.length; y++){
		B[y]=A[y];
		size=newCapacity;
	    }
	}
	A=B;
    }
    public void clear(){
	for (int x=0; x<size; x++){
	    A[x]=new String();
	}
	size=0;
    }
    public String get(int index){
	if (index<0){
	    //System.out.println("Error: Index cannot be less than 0");
	    return null;
	} else if(index>=size){
	    //System.out.println("Error: Index cannot be greater than or equal to size");
	    return null;
	} else {
	    return A[index];
	}
	
    }
    public String set(int index, String e){
	if (index<0){
	    //System.out.println( "Error: Index cannot be less than 0");
	    return null;
	} else if(index>=size){
	    //System.out.println( "Error: Index cannot be greater than or equal to size");
	    return null;
       } else {
	    String x=A[index];
	    A[index]=e;
	    return x;
	}
    }
    public String remove(int index){
	if (index<0){
	    System.out.println( "Error: Index cannot be less than 0");
	    return null;
	} else if(index>=size){
	    System.out.println( "Error: Index cannot be greater than or equal to size");
	    return null;
       } else {
	    String[] B=new String[A.length];
	    String ans=A[index];
	    for (int x=0;x<index;x++){
		B[x]=A[x];
	    } 
	    for (int y=index;y<A.length-1;y++){
		B[y]=A[y+1];
	    }
	    A=B;
	    size--;
	    return ans;
	}
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
    public void InsertionSort(){
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
	    
