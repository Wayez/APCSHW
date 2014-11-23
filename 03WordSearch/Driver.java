public class Driver{
    public static void main(String[]args){
	WordGrid A=new WordGrid(5,5);
	System.out.println(A.addWordHorizontal("Wayez", 0, 0));
	System.out.println(A.addWordHorizontal("Wayez", 4, 3));    
	System.out.println(A.toString());
    }
}
