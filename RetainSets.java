import java.util.*;  
public class RetainSets {    
    public static void main(String arg[]) {  
       HashSet<Integer> set1 = new HashSet<Integer>();   
        set1.add(1);  
        set1.add(2);  
        set1.add(3);  
        set1.add(4);  
        set1.add(6);   	
        HashSet<Integer> set2 = new HashSet<Integer>();	
        set2.add(2);  
        set2.add(3);   
        set2.add(6);     
        System.out.println("Values in set :" +set1);  
        set1.retainAll(set2);  
        System.out.println("Values in set :" +set1);  
      }  
}  