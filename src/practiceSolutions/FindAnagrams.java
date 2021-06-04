package practiceSolutions;

public class FindAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 int search(String pat, String txt) {
	        int res =0;
	        int m= txt.length();
	        int n= pat.length();
	        pat.toLowerCase();
	        txt.toLowerCase();
	        
	        char[] ta = new char[26];
	        char[] pa = new char[26];
	        
	        for(int i=0;i<n;i++){
	            ta[txt.charAt(i)-'a']++;
	            pa[pat.charAt(i)-'a']++;
	        }
	        
	        for(int i=n;i<m;i++){
	            if(compare(pa,ta))
	                res++;
	            ta[txt.charAt(i)-'a']++;
	            ta[txt.charAt(i-n)-'a']--;
	        }
	        
	        if(compare(pa,ta))
	            res++;
	            
	        return res;
	    }
	    
	    boolean compare(char[] a1,char[] a2){
	        for(int i=0;i<a1.length;i++){
	            if(a1[i]!=a2[i])
	               return false;
	        }
	        return true;
	    }

}
