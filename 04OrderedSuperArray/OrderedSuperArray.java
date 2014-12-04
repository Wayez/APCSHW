public class SuperArray extends{
    public String[] A;
    public int size;
    public SuperArray(){
	this(10);
	size=0;
    }
    public SuperArray(int length){
	A=new String[10];
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
	if (size<A.length){
	    String[] B=new String[A.length];
	    for(int x=0;x<index;x++){
		B[x]=A[x];
	    }
	    B[index]=e;
	    for(int y=index+1;y<B.length;y++){
		B[y]=A[y-1];
	    }
	} else {
	    String[] B=new String[size+1];
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
	    System.out.println("Error: Index cannot be less than 0");
	    return null;
	} else if(index>=size){
	    System.out.println("Error: Index cannot be greater than or equal to size");
	    return null;
	} else {
	    return A[index];
	}
	
    }
    public String set(int index, String e){
	if (index<0){
	    System.out.println( "Error: Index cannot be less than 0");
	    return null;
	} else if(index>=size){
	    System.out.println( "Error: Index cannot be greater than or equal to size");
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
	    return ans;
	}
    }
	
}

	    
