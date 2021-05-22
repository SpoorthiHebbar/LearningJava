package practiceSolutions;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "ahherrary";
		 int[] count= new int[256];
	        char[] s = S.toCharArray();
	        String str = "";
	        
	        for(char c:s)
	          count[(int)c]++;
	          
	        for(int i=0;i<S.length();i++){
	            
	            if(count[(int)s[i]]>0){
	            str+= S.charAt(i);
	            
	            }
	            if(count[(int)s[i]]-1>0)
	             count[(int)s[i]]=0;
	        
	}System.out.println(str);

}
}
