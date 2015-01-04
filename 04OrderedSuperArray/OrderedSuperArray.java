/*import java.util.*;

public class OrderedSuperArray extends SuperArray{
    public OrderedSuperArray(){
	super();
    }
    public OrderedSuperArray(int length){
	super(length);
    }
    public void add(int index, String e){
	System.out.println("No need to specify index for ordered superarray. Adding and sorting "+ e);
	add(e);
    }
    //bob
					
	    
    public void add(String e){
	//System.out.println("Adding and sorting " + e + " into ordered superarray");
	int a=0;
	for (int x=0; x<size(); x++){
	    if (e.compareTo(get(x))>0){
		a++;
	    }
	}
	order(e);
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
	if (index<0){
	    System.out.println( "Error: Index cannot be less than 0");
	    return null;
	} else if(index>=size){
	    System.out.println( "Error: Index cannot be greater than or equal to size");
	    return null;
        } else {
	    String x=A[index];
	    remove(index);
	    add(e);
	    return x;
	}
    }

	
}
    
*/

	   
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
	if (index<0){
	    System.out.println( "Error: Index cannot be less than 0");
	    return null;
	} else if(index>=size){
	    String c="Error: Index cannot be greater than or equal to size";
	    System.out.println(c);
	    return null;
       } else {
	    String x=A[index];
	    remove(index);
	    add(e);
	    return x;
	}
    }
	
}

	
