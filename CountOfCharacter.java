
import java.util.*;

class CountOfCharacter {
	public static void main (String[] args) {
	    Scanner sr=new Scanner(System.in);
		String s[]=sr.next().split("");
		if(s.length>=1&&s.length<=(10^4))
		{int c=0;
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(s));
		HashSet<String> hs=new HashSet<String>();
		int n=sr.nextInt();
		for(String s1:al){
		    int m=Collections.frequency(al,s1);
		    if(m>=n&&hs.add(s1)){
		        c++;
		    }
		}
		System.out.print(c);}
		else
		{
		    System.out.print("out of range");
		}
	}
}
