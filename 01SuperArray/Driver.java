public class Driver{
    public static void main(String[]superArraysAreAwesome){
	SuperArray Wayez=new SuperArray(1);
	System.out.println(Wayez.toString());
	Wayez.add("Apple");
	Wayez.add("Banana");
	Wayez.add("Orange");
	System.out.println(Wayez.toString());
	System.out.println(Wayez.size());
	Wayez.add("Pear");
	Wayez.add("Grape");
	Wayez.add("Cherry");
	Wayez.add("Pineapple");
	Wayez.add("Watermellon");
	Wayez.add("Mango");
	Wayez.add("Raspberry");
	Wayez.add("Strawberry");
	System.out.println(Wayez.toString());
	System.out.println(Wayez.size());
	Wayez.resize(20);
	System.out.println(Wayez.toString());
	System.out.println(Wayez.size());
	Wayez.resize(3);
	System.out.println(Wayez.toString());
	System.out.println(Wayez.size());
        Wayez.clear();
	System.out.println(Wayez.toString());
	System.out.println(Wayez.size());
	Wayez.add("Pear");
	Wayez.add("Grape");
	Wayez.add("Cherry");
	Wayez.add("Pineapple");
	Wayez.add("Watermellon");
	Wayez.add("Mango");
	Wayez.add("Raspberry");
	Wayez.add("Strawberry");
	System.out.println(Wayez.get(3));
	System.out.println(Wayez.set(3, "Apple"));
	System.out.println(Wayez.toString());
	System.out.println(Wayez.get(-5));
	System.out.println(Wayez.get(100));
	Wayez.add(3, "Pineapple");
	System.out.println(Wayez.toString());
	System.out.println(Wayez.set(-4,"Pineapple"));
	System.out.println(Wayez.set(100, "Grape"));
	System.out.println(Wayez.remove(5));
	System.out.println(Wayez.toString());
			   
    }
}
