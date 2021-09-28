package test;

import java.util.HashMap;
import java.util.Map;

public class MyHashCode {
	public static void main(String[] args) {
		String a = "Z@S.ME";
		String b = "Z@RN.E";
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("a","aa");
		map.put("b","bb");
		map.put("a","aaa");
		map.put("b","bbb");
		System.out.println(map.get("a"));
		System.out.println(map.get("b"));
		
	}
}
