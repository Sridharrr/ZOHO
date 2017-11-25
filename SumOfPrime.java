import java.util.*;

class SumOfPrime {
	public static void main (String[] args) {
	    Scanner sr=new Scanner(System.in);
	    int n=sr.nextInt();
	    try{
	    if(n%2==0){ 
	        if(n==2){
	            System.out.print("Yes");
	            
	        }
	        boolean f=false;
	        int n1=n/2;
	        while(n1!=0&&f==false){ f=true;
	            int m1=n-n1;
	            int n11=n1/2;
	            int m11=m1/2;
	            while(m11!=1){
	                if(m1%m11==0){
	                    f=false;
	                }
	                m11--;
	            }
	            while(n11!=1){
	                if(n1%n11==0){
	                    f=false;
	                }n11--;
	            }n1--;
	        }
	        if(f==true)
	        System.out.print("yes");
	        else
	        System.out.print("no");
	        
	    }
	    else{
	        System.out.print("no");
	    }}
	    catch(Exception e){
	        
	    }
	}
}
