package Cars;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class carshashmap {
	
	public static void main(String[] args) {
        Map<String, String> carModels = new HashMap<>();
        
        carModels.put("BMW", "3 Series");
        carModels.put("Audi", "A4");
        carModels.put("Ford", "Focus");
        
        
        for (Entry<String, String> i : carModels.entrySet()) {
            System.out.println(i);
        }
	}
}
