import java.util.*;

class ReverseString {
	public static void main (String[] j) {
		Scanner sr=new Scanner(System.in);int i=0;
		String s[]=sr.next().split("\\.");
		for(String s1:s){
		    StringBuffer br=new StringBuffer(s1);
		    br.reverse();
		    if(i!=s.length-1)
		    System.out.print(br+".");
		    else
		    System.out.print(br);
		    i++;
		}
		
	}
}
