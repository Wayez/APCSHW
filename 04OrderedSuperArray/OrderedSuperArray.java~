<<<<<<< HEAD
import java.util.*;
public class OrderedSuperArray extends SuperArray{
    public OrderedSuperArray(){
	super(10);
	size=0;
    }
    public void add(int index, String e){
	System.out.println("No need to specify index, this is an ordered array list");
	this.add(e);
    }
    public void order(){
	Arrays.sort(A);
    }
		
	    
    public void add(String e){
	super.add(e);
	order();
    }
    public String set(int index, String e){
	System.out.println("This method is useless for ordered superarray. Instead we will remove the String in the specified index and add new String to file");
=======
public class OrderedSuperArray extends SuperArray{
    public OrderedSuperArray(){
	super(10);
    }
    public OrderedSuperArray(int length){
	super(length);
    }
    public void add(int index, String e){
	System.out.println("No need to specify index for ordered superarray. Adding and sorting "+ e);
	add(e);
    }
	    
					
	    
    public void add(String e){
	//System.out.println("Adding and sorting " + e + " into ordered superarray");
	int a=0;
	for (int x=0; x<size(); x++){
	    if (e.compareTo(get(x))>0){
		a++;
	    }
	}
	super.add(a, e);
    }
    public void order(String e){
	System.out.println(size());
	for (int i=0; i<size(); i++){
	    if (e.compareTo(get(i))<=0){
		super.add(i, e);
		break;
	    }
	}
	remove(size());
    }
    public String set(int index, String e){
	System.out.println("New set method will add " + e + " to ordered superarray and remove the string in index " + index);
>>>>>>> 9bfd8f624e45b887093e9bcb7de0476d270fbdf2
	if (index<0){
	    System.out.println( "Error: Index cannot be less than 0");
	    return null;
	} else if(index>=size){
	    System.out.println( "Error: Index cannot be greater than or equal to size");
	    return null;
       } else {
	    String x=A[index];
<<<<<<< HEAD
=======
	    remove(index);
>>>>>>> 9bfd8f624e45b887093e9bcb7de0476d270fbdf2
	    add(e);
	    return x;
	}
    }
	
<<<<<<< HEAD
} 
=======
}

	    
>>>>>>> 9bfd8f624e45b887093e9bcb7de0476d270fbdf2
