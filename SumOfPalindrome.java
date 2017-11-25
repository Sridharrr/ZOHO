import java.util.*;

class SumOfPalindrome{
	public static void main (String[] args) {
		Scanner sr=new Scanner(System.in);
		int n=sr.nextInt();int c=0;boolean f=true;
		while(c<=5&&f==true){
		String s=String.valueOf(n);
		StringBuffer br=new StringBuffer(s);
		br.reverse();
		int n1=Integer.valueOf(s)+Integer.valueOf(br.toString());
		String s1=String.valueOf(n1);
		StringBuffer br1=new StringBuffer(s1);
		br1.reverse();
		if(s1.equals(br1.toString())){
		    System.out.println(br1);
		    f=false;
		}c++;
		}
		if(f==true)
		System.out.print("-1");
	}
}
