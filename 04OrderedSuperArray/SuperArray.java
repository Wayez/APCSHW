public class SuperArray{
    public Object[] A;
    public int size;
    public SuperArray(){
	this(10);
	size=0;
    }
    public SuperArray(int length){
	A=new Object[10];
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
	this.add(new Object());
    }
    public void add(int index, Object e){
	if (size<A.length){
	    Object[] B=new Object[A.length];
	    for(int x=0;x<index;x++){
		B[x]=A[x];
	    }
	    B[index]=e;
	    for(int y=index+1;y<B.length;y++){
		B[y]=A[y-1];
	    }
	} else {
	    Object[] B=new Object[size+1];
	    for(int x=0;x<index;x++){
		B[x]=A[x];
	    }
	    B[index]=e;
	    for(int y=index+1;y<B.length;y++){
		B[y]=A[y-1];
	    }
	    size++;
	    A=B;
	}
    }
	    
    public void add(Object e){
	if (size<A.length){
	    A[size]=e;
	    size++;
	} else {
	    Object[] B=new Object[size+1];
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
	Object[] B=new Object[newCapacity];
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
	    A[x]=new Object();
	}
	size=0;
    }
    public Object get(int index){
	if (index<0){
	    System.out.println("Error: Index cannot be less than 0");
	    return null;
	} else if(index>=size){
	    System.out.println("Error: Index cannot be greater than or equal to size");
	    return null;
	} else {
	    return A[index];
	}
	
    }
    public Object set(int index, Object e){
	if (index<0){
	    System.out.println( "Error: Index cannot be less than 0");
	    return null;
	} else if(index>=size){
	    System.out.println( "Error: Index cannot be greater than or equal to size");
	    return null;
       } else {
	    Object x=A[index];
	    A[index]=e;
	    return x;
	}
    }
    public Object remove(int index){
	if (index<0){
	    System.out.println( "Error: Index cannot be less than 0");
	    return null;
	} else if(index>=size){
	    System.out.println( "Error: Index cannot be greater than or equal to size");
	    return null;
       } else {
	    Object[] B=new Object[A.length];
	    Object ans=A[index];
	    for (int x=0;x<index;x++){
		B[x]=A[x];
	    } 
	    for (int y=index;y<A.length-1;y++){
		B[y]=A[y+1];
	    }
	    A=B;
	    return ans;
	}
    }
	
}

	    
