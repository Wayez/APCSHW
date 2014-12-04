public class OrderedSuperArray extends SuperArray{
    public OrderedSuperArray(){
	super(10);
	size=0;
    }
    public void add(int index, String e){
	System.out.println("No need to specify index, this is an ordered array list");
	this.add(e);
    }
    public void order(String e){
	boolean flled=false;
	for (int x=0; x<super.size()-1; x++){
	    if (e.compareTo(super.get(x))<=0){
		super.add(x, e);
		super.remove(size);
		resize(super.size()-1);
		break;
	    }
	}
    }
    public void InsertionSort(){
    }
		
	    
    public void add(String e){
	super.add(e);
	order(e);
    }
    public String set(int index, String e){
	System.out.println("This method is useless for ordered superarray. Instead we will remove the String in the specified index and add new String to file");
	if (index<0){
	    System.out.println( "Error: Index cannot be less than 0");
	    return null;
	} else if(index>=size){
	    System.out.println( "Error: Index cannot be greater than or equal to size");
	    return null;
       } else {
	    String x=A[index];
	    add(e);
	    return x;
	}
    }
	
} 