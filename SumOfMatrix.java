import java.util.*;

class SumOfMatrix{
	public static void main (String[] args) {
		Scanner sr=new Scanner(System.in);
		int n=sr.nextInt();int s=0;
		int m=sr.nextInt();
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        s=s+sr.nextInt();
		    }
		}
		System.out.print(s);
	}
}
