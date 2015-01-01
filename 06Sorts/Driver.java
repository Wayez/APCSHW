import java.util.Arrays;
public class Driver{
    public static Sorts start(String[] args){
	Sorts ans=new Sorts();
	if (args.length==1){
	    if (args[0].equals("1")){
		ans=new Sorts("numbers.txt");
		ans.insertion();
		return ans;
	    } else if (args[0].equals("2")){
		ans=new Sorts("numbers.txt");
		ans.bubble();
		return ans;
	    } else if (args[0].equals("3")){
		ans=new Sorts("numbers.txt");
		ans.selection();
		return ans;
		/* } else if (args[0].equals("4")){
		ans=new Sorts("numbers.txt");
		ans.builtInSort();
		return ans;
	    } else if (args[0].equals("5")){
		ans=new OrderedSorts();
		ans.add("Apple");
		ans.add("Orange");
		ans.add("Grape");
		ans.add("Banana");
		ans.add("Cherry");
		ans.add("Watermellon");
		ans.add("Mango");
		return ans;
		*/
	    } else {
		System.out.println("Choose First Args:\n1: insertionSort\n2: bubbleSort\n3: selectionSort\n4: Arrays.sort()\n5: radixSort");
		return null;
	    }
	} else {
	    System.out.println("Choose First Args:\n1: insertionSort\n2: badInsertionSort\n3: selectionSort\n4: Arrays.sort()\n5: OrderedArrayList");
	    return null;
	}
    }
    public static void main(String[]args){
	long start = System.currentTimeMillis();
	Sorts Wayez =start(args);
	if (args.length==1 && (args[0].equals("1") || args[0].equals("2") || args[0].equals("3") || args[0].equals("4") || args[0].equals("5"))){
	    System.out.println(Wayez.A.toString());
	    long elapsed = System.currentTimeMillis() - start;
	    System.out.println("Time Elapsed = " + elapsed);
	}	
    }
}
