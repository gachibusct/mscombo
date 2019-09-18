public class Main 
{
    public static int[] a=new int[10];
	public static void main(String[] args){
	    for(int i=0;i<10;i++){
		    a[i] = (int) (Math.random()*(20+1)) - 10;
		    System.out.print(a[i]+" ");
	    }
	    System.out.println();
	    sort();
	}
	public static void sort(){
	    for(int i=0;i<10;i++){
	        int max=-11;
	        int maxi=0;
	        for(int q=i;q<10;q++){
	            if(a[q]>max){
	                maxi=q;
	                max=a[q];
	            }
	        }
	        a[maxi]=a[i];
	        a[i]=max;
	        System.out.print(a[i]+" ");
	    }
	}
}
