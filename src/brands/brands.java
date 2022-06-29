package brands;

import java.util.LinkedList;

public class brands {
	
	public static void main(String[] args) {
	    LinkedList<String> brands = new LinkedList<String>();
	    brands.add("Nike");
	    brands.add("Adidas");
	    brands.add("Under Armor");
	    brands.add("Air Jordan");
	    
	    for (String i : brands){
            System.out.println(i);
        }
	  }

}
