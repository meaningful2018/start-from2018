package com.example.demo.simple.something;

public class StringIntern {

	public static void main(String[] args) {
//		String a = new String("a");
//		String c = a.intern();
//		String b = "a";
//		String d = new String("a");
//        System.out.println(c == a);
        String aa = "a" + "b" + 1;
        String cc = aa.intern();
        String bb = "a" + "b" + 1;
        System.out.println(aa == bb);
        System.out.println(cc == bb);
	}

}
