import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Sorts{
    ArrayList<Integer> A=new ArrayList();
    public Sorts(){
	this("numbers.txt");
    }
    public Sorts(String file){
	//System.out.println();
	loadWordsToSuperArray(file);
	//test();
    }
    public void test(){
	for (int x=0; x<10; x++){
	    Random r=new Random();
	    int a=r.nextInt(999);
	    A.add(a);
	}
	System.out.println();
    }
    public void selection(){
	//SuperArray A=new SuperArray("numbers.txt");
	for (int x=0; x<A.size(); x++){
	    int temp=x;
	    for (int y=x+1; y<A.size(); y++){
		if (A.get(y)<A.get(temp)){
		    temp=y;
		}
	    }
	    A.add(x, A.remove(temp));
	}
	
    }
    public void bubble(){
	int y=A.size()-1;
	for (int w=0; w<A.size(); w++){
	    for (int x=0; x<y; x++){
		if (A.get(x)>=A.get(x+1)){
		    int z=A.get(x);
		    A.set(x, A.get(x+1));
		    A.set(x+1, z);
		}
	    }
	    y--;
	}
    }
    public void insertion(){
	for (int x=1; x<A.size(); x++){
	    //System.out.println(A[x].compareTo(A[x-1]));
	    if (A.get(x)<=A.get(x-1)){
		for (int y=1; y<=x; y++){
		    //System.out.println(A[x].compareTo(A[x-1]));
		    if (A.get(x)>=A.get(x-y)){
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

	
    }
    /*   public void builtInSort(){
	 int[] B =(int) A.toArray();
	/*for (int x=0; x<B.length; x++){
	    B[x]=(int) B[x];
	}
	
	Arrays.sort(B);
	A=new ArrayList<Integer>(Arrays.asList(B));
	}*/
    public void radix(){
	int x=A.size();	
	int y=1;
	boolean go=true;
	while(go){
	    ArrayList<Integer>[] B= new ArrayList[x];
	    for (int w=0; w<x; w++){
		B[w]=new ArrayList();
	    }
	    for (int z=0; z<x; z++){
		int num=A.get(z);
		int dig=(int)(Math.abs(num) / Math.pow(10, y - 1)) % 10;
		B[dig].add(num);
	    }
	    A.clear();
	    for (int z=0; z<x; z++){
		for (int w=0; w<B[z].size(); w++){
		    A.add(B[z].get(w));
		}
	    }
	    y++;
	    go = y <= 6;
	}

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
