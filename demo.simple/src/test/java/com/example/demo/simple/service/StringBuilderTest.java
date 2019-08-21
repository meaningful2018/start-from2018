package com.example.demo.simple.service;

import java.net.URI;

public class StringBuilderTest {

	public static void main(String[] args) {
//		String state = "000";
//		StringBuilder b = new StringBuilder(state);
//		System.out.println(b.replace(0, 1, "1"));
//		System.out.println(b.replace(1, 2, "1"));
//		System.out.println(b.replace(2, 3, "1"));
        String url = "http://192.168.15.191:7090/";
        //url = url + "uap" + "/";
        URI uri = URI.create(url);
        System.out.println(uri);
        String url2 = uri.resolve("/uap/restApi").toString();
        System.out.println(url2);
	}

}
