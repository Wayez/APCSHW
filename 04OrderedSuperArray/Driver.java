import java.util.Arrays;
public class Driver{
<<<<<<< HEAD
    public static void main(String[]superArraysAreAwesome){
	SuperArray Wayez=new OrderedSuperArray();
	System.out.println(Wayez.toString(10));
	Wayez.add("Apple");
	Wayez.add("Banana");
	Wayez.add("Orange");
	System.out.println(Wayez.toString());
	//System.out.println(Wayez.size());
	Wayez.add("Pear");
	Wayez.add("Grape");
	Wayez.add("Cherry");
	Wayez.add("Pineapple");
	Wayez.add("Watermellon");
	Wayez.add("Mango");
	Wayez.add("Raspberry");
	Wayez.add("Strawberry");
	System.out.println(Wayez.toString());
	//System.out.println(Wayez.size());
	//Wayez.resize(20);
	//System.out.println(Wayez.toString());
	//System.out.println(Wayez.size());
	//Wayez.resize(3);
	//System.out.println(Wayez.toString());
	//System.out.println(Wayez.size());
        Wayez.clear();
	System.out.println(Wayez.toString());
	//System.out.println(Wayez.size());
	Wayez.add("Pear");
	Wayez.add("Grape");
	Wayez.add("Cherry");
	Wayez.add("Pineapple");
	Wayez.add("Watermellon");
	Wayez.add("Mango");
	Wayez.add("Raspberry");
	Wayez.add("Strawberry");
	//System.out.println(Wayez.get(3));
	//System.out.println(Wayez.set(3, "Apple"));
	System.out.println(Wayez.toString());
	//System.out.println(Wayez.get(-5));
	//System.out.println(Wayez.get(100));
	//Wayez.add(3, "Pineapple");
	//System.out.println(Wayez.toString());
	//System.out.println(Wayez.set(-4,"Pineapple"));
       	//System.out.println(Wayez.set(100, "Grape"));
	//System.out.println(Wayez.remove(5));
	//System.out.println(Wayez.toString());
			   
=======
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
>>>>>>> 9bfd8f624e45b887093e9bcb7de0476d270fbdf2
    }
}
