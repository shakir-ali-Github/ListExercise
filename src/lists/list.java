package lists;

import java.util.HashSet;
import java.util.Set;

public class list {
	public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        
        hashSet.add("Shak");
    	hashSet.add("Stretch");
    	hashSet.add("Asif");
    	hashSet.add("Rimzy");
    	hashSet.add("Bash");
    	hashSet.add("Rips");
    	
    	
    	for (String i : hashSet){
            System.out.println(i);
        }

    }
	
}
