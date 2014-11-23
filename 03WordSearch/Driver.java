public class Driver{
    public static void main(String[]args){
	WordGrid A=new WordGrid(5,5);
	System.out.println(A.addWordHorizontal("Wayez", 0, 0));
	System.out.println(A.addWordHorizontal("Wayez", 4, 3));
	System.out.println(A.addWordVertical("Wayez", 0, 0));
	System.out.println(A.addWordVertical("Yelow", 0, 2));
	System.out.println(A.addWordVertical("Wayez", 5, 7));
	System.out.println(A.addWordVertical("Wayez", 0, 1));
	System.out.println(A.addWordVertical("LOL", 2, 1));
	System.out.println(A.addWordDiagonal("Wayez", 0, 0));
	System.out.println(A.addWordDiagonal("Wally", 0, 0));
	System.out.println(A.addWordDiagonal("yes", 0, 2));
        System.out.println(A.toString());
    }
}
