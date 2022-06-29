package Sandwiches;

import java.util.ArrayList;
import java.util.List;

public class sandwiches {
	    public static void main(String[] args){
	        List<String> sandwiches = new ArrayList<>();
	        
	        sandwiches.add("Cheese and Onion");
	        sandwiches.add("Egg and Cress");
	        sandwiches.add("Tuna Mayo");
	        sandwiches.add("Cheddar cheese");
	        
	        for (String i : sandwiches){
	            System.out.println(i);
	        }
	    }

}
