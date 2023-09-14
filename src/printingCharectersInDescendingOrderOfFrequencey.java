import java.util.HashMap;
import java.util.Map;

public class printingCharectersInDescendingOrderOfFrequencey {

	public static void main(String[] args) {
		String s = "geeksforgeeks";
		Map<Character,Integer> m = new HashMap<>();
		for(int i=0; i<s.length();i++) {
			if(!m.containsKey(s.charAt(i))) {
				m.put(s.charAt(i), 1);				
			}else {
				m.put(s.charAt(i), m.get(s.charAt(i))+1);
			}			
		}
		System.out.println(m);
		int size = m.size();
		while(size-- >0) {
			 int currentMax = 0;
		        char arg_max = 0;
		        for (Map.Entry<Character,
		                        Integer> it : m.entrySet())
		        {
		            if (it.getValue() > currentMax ||
		               (it.getValue() == currentMax &&
		                it.getKey() > arg_max))
		            {
		                arg_max = it.getKey();
		                currentMax = it.getValue();
		            }
		        }
		     // Print the character
		        // alongwith its frequency
		        System.out.print(arg_max + " - " +
		                         currentMax + "\n");
		 
		        // Delete the maximum value
		        m.remove(arg_max);
		    }
		}
			
		
		
	}


