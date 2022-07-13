package stream_example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class StreamHash {
	
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "abc");
		map.put(2, "xyz");
		map.put(3, "gtf");
		
		Integer key = map.entrySet().stream()
		.max((m1,m2) -> m2.getKey().compareTo(m1.getKey())).get().getKey();
		
		HashMap<Integer, List<Integer>> map2 = new HashMap<Integer, List<Integer>>();
		map2.put(22, Arrays.asList(1,5,7,8,4,6));
		map2.put(45, Arrays.asList(14,56,78,8,4,6));
		map2.put(67, Arrays.asList(1,5,77,88,44,6));
		map2.put(56, Arrays.asList(1,5,77,8,4,6));
		
		List<Integer> value = map2.entrySet().stream()
		.filter(m2 -> m2.getValue().contains(77))
		.max((m2,m3) -> m2.getKey().compareTo(m3.getKey())).get().getValue();
		
		System.out.println(key);
		
		System.out.println(value);
	}
	
	

}
