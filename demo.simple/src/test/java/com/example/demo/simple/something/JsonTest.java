package com.example.demo.simple.something;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSONObject;

public class JsonTest {

	public static void main(String[] args) {
		JSONObject json = new JSONObject();
		json.put("sleep_time", 1000);
		json.put("r", 2);
		String s = json.toString();
		System.out.println(s);
		Map<String, Object> map = new HashMap<>();
//		if (s.startsWith("{") || s.endsWith("}")) {
//			StringBuilder sb = new StringBuilder(s);
//			if (s.startsWith("{")) {
//				sb.deleteCharAt(0);
//			}
//			if (s.endsWith("}")) {
//				sb.deleteCharAt(sb.length() - 1);
//			}
//			s = sb.toString();
//		}
		s = StringUtils.remove(s, "{");
		s = StringUtils.remove(s, "}");
		s = StringUtils.remove(s, "\"");
		String[] arr = s.split(",");
		for (String ss : arr) {
			System.out.println(ss);
			String[] arr2 = ss.split(":");
			System.out.println(arr2[0] + "  " + arr2[1]);
			map.put(arr2[0], arr2[1]);
		}
		map.forEach((k,v)-> {
			System.out.println(k);
			System.out.println(v);
		});
		System.out.println(map.get("sleep_time"));
	}

}
