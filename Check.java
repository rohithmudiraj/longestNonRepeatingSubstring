package longestSubString;

public class Check {
	

	public static int lengthOfLongestSubstring(String name) {
		int max=0;
		
		for(int i=0;i<=name.length();i++) {
			
			for(int j=i+2;j<=name.length();j++) {
				
			
			
			String store=name.substring(i, j);
			int fg=funn(store);
		//	System.out.println(fg);
			
			if(fg!=0) {
				
				if(fg>max) {
				max=fg;
				}
			}
			else 
			{
				j++;
			}
					//System.out.println(store);
			}
		}
		return max;
	}
			public static int funn(String na) {
				
				for(int k=0;k<=na.length()-2;k++) {
					if(na.charAt(k)==na.charAt(k+1)) {
					
	
					return 0;
					}
				
					else {
						
					}
					
				}
				return na.length();
					
				}
		
	}


					
				
				
			
			
			
			
			
			//System.out.println(store);

	
	


