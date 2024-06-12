package challenge.two;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DicTest {
	public static void main(String[] args) {
		Map<String, String> dic = new HashMap<>();

		dic.put("cat", "꼬네이");
		dic.put("head", "대가빠리");
		dic.put("aunt", "아지매");
		dic.put("noodle", "국시");
		dic.put("teacher", "쌤");
		dic.put("child", "얼라");

		Iterator<String> keys = dic.values().iterator();
		for (String key : dic.keySet())
			System.out.printf("%s=%s  ", key, dic.get(key));
	}
}