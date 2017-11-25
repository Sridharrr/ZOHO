import java.util.*;

class StringGrid{
	public static void main (String[] args) {
		Scanner sr=new Scanner(System.in);
	        int n=sr.nextInt();
	        int m=sr.nextInt();
	       String s[][]=new String[n][m];
	       for(int i=0;i<n;i++){
	           for(int j=0;j<m;j++){
	               s[i][j]=sr.next();
	           }
	       }
	       String tar=sr.next();
	       int n1=tar.length();
	       for(int i=0;i<n;i++){
	           for(int j=0;j<m;j++){
	                       int j1=j;
	                       int i1=i;
	                      // System.out.println(s[i][j1]);
	                       if((s[i][j1]).equals(String.valueOf(tar.charAt(0)))){
	                          // System.out.println("hiii");
	                       String s1="";
	                       while(j1!=m){
	                           s1=s1+s[i][j1];
	                           j1++;
	                       }
	                       if(s1.length()>=n1&&tar.equals(s1.substring(0,n1))){
	                           System.out.print(i+" "+j+",");
	                       }        s1="";
	                       while(i1!=n){
	                           s1=s1+s[i1][j];
	                           i1++;
	                       }
	                       if(s1.length()>=n1&&tar.equals(s1.substring(0,n1))){
	                           System.out.print(i+" "+j+",");
	                       }    s1="";
	               }
	               //System.out.print("jiii");
	           }
	       }
	    
	}
}
