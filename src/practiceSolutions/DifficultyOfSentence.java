package practiceSolutions;

public class DifficultyOfSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello there";
		 String str = s.toLowerCase();
	        String[] strings = str.split(" ");
	        int hw=0,ew=0;
	        
	        for(String S : strings)
	        {int vow=0,consec=0,cons=0;
	            for(int i=0;i<S.length();i++)
	            {
	                if(S.charAt(i)=='a'||S.charAt(i)=='e'||S.charAt(i)=='i'||S.charAt(i)=='o'||S.charAt(i)=='u')
	                {
	                    vow++;
	                    consec=0;
	                }
	                else
	                {
	                    cons++;
	                    consec++;
	                }
	            }if(consec>=4)
	                hw++;
	            else if(vow<cons)
	                hw++;
	            else
	                ew++;
	        }
	        
	        System.out.println(5*hw+3*ew);
	}

}
