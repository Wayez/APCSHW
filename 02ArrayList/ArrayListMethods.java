import java.util.*;
public class ArrayListMethods{
    public static void collapseDuplicates(ArrayList<Integer> L){
	for (int x=0; x<L.size()-1; x++){
	    if (L.get(x)==L.get(x+1)){
		L.remove(x);
		x--;
	    }
	}
    }
    public static void randomize(ArrayList<Integer> L){
	for (int x=0; x<L.size(); x++){
	    int a=L.get(x);
	    Random index=new Random();
	    int i=index.nextInt(L.size()-x)+x;
	    L.set(x, L.get(i));
	    L.set(i, a);
	}
    }
	    
    public static void main(String[]args){
	ArrayList A=new ArrayList(10);
	A.add(0);
	A.add(1);
	A.add(2);
	A.add(2);
	A.add(3);
	A.add(5);
	A.add(5);
	A.add(5);
	A.add(8);
	A.add(8);
	System.out.println(A.toString());
	collapseDuplicates(A);
	System.out.println(A.toString());
	randomize(A);
	System.out.println(A.toString());
    }
	
		    
}
