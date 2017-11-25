import java.util.*;

class ReverseOfVowels {
	public static void main (String[] args) {
		Scanner sr=new Scanner(System.in);
		String s[]=sr.next().split("");
		ArrayList<String> al=new ArrayList<String>();
		for(String s1:s){
		    if(s1.equals("a")||s1.equals("e")||s1.equals("i")||s1.equals("o")||s1.equals("u")){
		        al.add(s1);
		    }
		} int n1=(al.size())-1;
		for(int i=0;i<s.length;i++){
		    String s1=s[i];
		     if(s1.equals("a")||s1.equals("e")||s1.equals("i")||s1.equals("o")||s1.equals("u")){
		        s[i]=(al.get(n1)).toString();
		        n1--;
		    }
		    System.out.print(s[i]);
		}
	}
}
