public class Driver{
    public static void main(String[]superArraysAreAwesome){
	SuperArray B=new SuperArray();
	B.add(0, "k");
	OrderedSuperArray Wayez=new OrderedSuperArray(10);
	System.out.println(B.toString());
	//System.out.println(Wayez.size());
	Wayez.add("Apple");
	System.out.println(Wayez.toString());
	//System.out.println(Wayez.size());
	Wayez.add("Banana");
	//System.out.println(Wayez.toString());
	//System.out.println(Wayez.size());
	Wayez.add("Orange");
	//System.out.println(Wayez.toString());
	//System.out.println(Wayez.size());
	Wayez.add("Pear");
	Wayez.add("Grape");
	Wayez.add("Cherry");
	Wayez.add("Pineapple");
	Wayez.add("Watermellon");
	Wayez.add("Mango");
	System.out.println(Wayez.toString());
	//SuperArray numbers=new SuperArray("numbers.txt");
	SuperArray numbers=new SuperArray();
	for (int x=0; x<100; x++){
	    numbers.add(Integer.toString(x));
	}
	numbers.InsertionSort();
	System.out.println(numbers.toString());
	System.out.println("2".compareTo("10"));
	System.out.println("2".compareTo("20"));
	System.out.println("2".compareTo("29"));
    }
}
