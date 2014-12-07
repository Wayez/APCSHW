public class Driver{
    public static SuperArray start(String[] args){
	SuperArray ans=new SuperArray();
	if (args.length==1){
	    return ans;
	} else {
	    System.out.println("Choose First Args:\n1: insertionSort\n2: selectionSort\n3: Arrays.sort()\n4: OrderedArrayList");
	    return null;
	}
    }
    public static void main(String[]args){
	SuperArray Wayez =start(args);
    }	
}
