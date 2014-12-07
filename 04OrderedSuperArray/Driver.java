import java.util.Arrays;
public class Driver{
    public static SuperArray start(String[] args){
	SuperArray ans=new SuperArray();
	if (args.length==1){
	    if (args[0].equals("1")){
		ans=new SuperArray("numbers.txt");
		ans.InsertionSort();
		return ans;
	    } else if (args[0].equals("2")){
		ans=new SuperArray("numbers.txt");
		ans.SelectionSort();
		return ans;
	    } else if (args[0].equals("3")){
		ans=new SuperArray("numbers.txt");
		ans.builtInSort();
		return ans;
	    } else if (args[0].equals("4")){
		ans=new OrderedSuperArray();
		ans.add("Apple");
		ans.add("Orange");
		ans.add("Grape");
		ans.add("Banana");
		ans.add("Cherry");
		ans.add("Watermellon");
		ans.add("Mango");
		return ans;
	    } else {
		System.out.println("Choose First Args:\n1: insertionSort\n2: selectionSort\n3: Arrays.sort()\n4: OrderedArrayList");
		return null;
	    }
	} else {
	    System.out.println("Choose First Args:\n1: insertionSort\n2: selectionSort\n3: Arrays.sort()\n4: OrderedArrayList");
	    return null;
	}
    }
    public static void main(String[]args){
	SuperArray Wayez =start(args);
	if (args.length==1 && (args[0].equals("1") || args[0].equals("2") || args[0].equals("3") || args[0].equals("4"))){
	    System.out.println(Wayez.toString());
	}	
    }
}
