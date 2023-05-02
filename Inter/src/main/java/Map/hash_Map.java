package Map;

import java.util.HashMap;
import java.util.Map.Entry;

public class hash_Map {
	public static void main(String[] args) {

		HashMap<Integer, String> map=new HashMap<>();
		
		map.put(5, "Java");
		map.put(2, "C");
		map.put(4, "C++");
		map.put(3, "Java");
		map.put(6, "Java");
		System.out.println(map);
		
		 for(Entry<Integer, String> m : map.entrySet()){    
			    System.out.println(m.getKey()+" "+m.getValue());    
			   }  
		 
		 System.out.println("Keys : "+map.keySet());
		 System.out.println("Values : "+map.values());
		 System.out.println("Key-value : "+map.entrySet());
		 
		 map.putIfAbsent(1, "React Js");
		 System.out.println(map);
		 
		 HashMap<Integer, String> map2=new HashMap<>();
		 map2.put(7, "Node");
		 
		 System.out.println(map2);
		 
		 map2.putAll(map);
		 System.out.println(map2);
		 
		 map.remove(5);
		 System.out.println(map);
		 map.replace(1, "java");
		 System.out.println(map);
		 
		 map.remove(1, "java");
		 System.out.println(map);
	}
}
