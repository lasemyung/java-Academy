package examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ex121 {

	public static void main(String[] args) {
		
		
		Map<String, String> data = new HashMap<String, String>();
		data.put("age", "20");
		data.put("height", "170"); 
		data.put("name", "배철수"); 
		
		Set<String> keys = data.keySet();
		System.out.println( keys );
		Iterator<String> it = keys.iterator();
		while( it.hasNext() ) {
			String key = it.next();
			String value = data.get( key );
			System.out.println( "key:" + key + ", value:" + value );
		}
	}

}
