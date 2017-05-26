package jason;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.Timer;
import java.util.TreeSet;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class ClassLoader {

	public static void main (String[] args)
	{
		List<String> list = new ArrayList<>();
		Map<String, String> collection = new HashMap();
		Set<String> set = new HashSet<>();
		Collection<Integer> integers = new HashSet<>();
		HashSet<String> set2 = new LinkedHashSet<>();
		List<Integer> integers2 = new Vector<>();
		integers2.add(33);
		integers2.add(2);
		integers2.add(22);
		integers2.add(21);
		integers2.add(2);
		Vector<Integer> vector = new Vector<Integer>();
		LinkedList<String> linklist = new LinkedList<>();
		linklist.add("1");
		linklist.add("2");
		linklist.addFirst("04");
		linklist.add(null);
		linklist.element();
		System.out.println(linklist.element());
		System.out.println(linklist);
		System.err.println(linklist.size());
		ClassLoader classLoader = new ClassLoader();
		SortedSet<Integer> sortedSet = new TreeSet<Integer>();
		sortedSet.add(1);
		sortedSet.add(2);
		sortedSet.add(2);
		sortedSet.first();
		System.out.println(sortedSet.first());
		Map<Map<Map<String, Integer>, Map<String, Integer>>, Integer> map = new HashMap<>();
		Map<String, Integer> mapStrInt = new HashMap<>();
		mapStrInt.put("A", 1);
		mapStrInt.put("B", 2);
		Map<Map<String, Integer>, Map<String, Integer>> mapMapMap = new HashMap<>();
		mapMapMap.put(mapStrInt, mapStrInt);
		map.put(mapMapMap, 2);
		System.out.println(map);
		Hashtable<SortedSet<Integer>, Integer> hashtable = new Hashtable<>();
		hashtable.put(sortedSet, 1);
		System.out.println(hashtable);
		Collections collections = null;
		System.out.println(integers2);
		collections.sort(integers2);
		System.out.println(integers2);
//		HashMapSet<Integer, String> hashMapSet = new HashMapSet<Integer,String>();
	
	}
	
	class HashMapSet<K,V>
	{
		public HashMapSet() {
			// TODO Auto-generated constructor stub
		}
		
		public V put(K key, V value)
		{
			System.out.println(key + "=" + value);
			return value;
		}
	}
}
