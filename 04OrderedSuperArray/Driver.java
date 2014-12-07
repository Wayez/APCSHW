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
		ans.badInsertionSort();
		return ans;
	    } else if (args[0].equals("3")){
		ans=new SuperArray("numbers.txt");
		ans.SelectionSort();
		return ans;
	    } else if (args[0].equals("4")){
		ans=new SuperArray("numbers.txt");
		ans.builtInSort();
		return ans;
	    } else if (args[0].equals("5")){
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
		System.out.println("Choose First Args:\n1: insertionSort\n2: badInsertionSort\n3: selectionSort\n4: Arrays.sort()\n5: OrderedArrayList");
		return null;
	    }
	} else {
	    System.out.println("Choose First Args:\n1: insertionSort\n2: badInsertionSort\n3: selectionSort\n4: Arrays.sort()\n5: OrderedArrayList");
	    return null;
	}
    }
    public static void main(String[]args){
	long start = System.currentTimeMillis();
	SuperArray Wayez =start(args);
	if (args.length==1 && (args[0].equals("1") || args[0].equals("2") || args[0].equals("3") || args[0].equals("4") || args[0].equals("5"))){
	    System.out.println(Wayez.toString());
	    long elapsed = System.currentTimeMillis() - start;
	    System.out.println("Time Elapsed = " + elapsed);
	}	
    }
}
