import java.util.*;  
public class valuekey 
{  
  public static void main(String args[]) 
  {  
    HashMap<Integer,String> h = new HashMap<Integer,String>();  
    h.put(1, "Monday");
    h.put(2, "Tuesday");
    h.put(3, "Wednesday");
    h.put(4, "Thursday");
    h.put(5, "Friday");
	h.put(6, "Saturday");
	h.put(7, "Sunday");
	    for(Map.Entry x:h.entrySet())
			{  
		       System.out.println(x.getKey() + " " + x.getValue());  
			}  
	}  
}