public class BubbleSort{
    public BubbleSort(int[] c){
	int y=c.length-1;
	for (int x=0; x<y;x++){
	    if (c[x]>c[x+1]){
		int z=c[x];
		c[x]=c[x+1];
		c[x+1]=z;
	    }
	    y--;
	}
    }
}