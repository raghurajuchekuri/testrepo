package Programs;


public class EliminateStringDuplicates {

	public static void main(String[] args) 
	{
		
		String str1 = "Experience";
        System.out.println(removeDuplicateChars(str1));
        
    }
			
			//Re Usable Component Method
		    private static String removeDuplicateChars(String sourceStr) 
		    	{
			        // Store encountered letters in this string.		    	
			        char chrArray[] = sourceStr.toLowerCase().toCharArray();
			        String targetStr = "";
			 
			        // Loop over each character.
				    for (char value : chrArray) 
				       {
				            // See if character is in the target 
				        	//Logic --> string returns -1 if not found  
				        	
				            if (targetStr.indexOf(value) == -1) {
				                targetStr += value; 
				                
				            }
				      }
			      return targetStr;
		    	}

		
	}


