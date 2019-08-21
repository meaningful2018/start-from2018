package com.example.demo.simple.service;

import java.net.URI;
import java.time.LocalDate;
import java.time.ZoneId;

public class TimeTest {
	public static void main(String[] args) {
		ZoneId zone = ZoneId.of("UTC+8");
		LocalDate initDate = LocalDate.of(2019, 4, 9);
		long firstDayMilli = initDate.atStartOfDay(zone).toInstant().toEpochMilli();
		System.out.println("" + firstDayMilli);
//		initDate = initDate.plusDays(1);
//		firstDayMilli = initDate.atStartOfDay(zone).toInstant().toEpochMilli();
//		System.out.println("" + firstDayMilli);
//		initDate = initDate.plusDays(1);
//		firstDayMilli = initDate.atStartOfDay(zone).toInstant().toEpochMilli();
//		System.out.println("" + firstDayMilli);
		URI uri = URI.create("http://192.168.15.33:80");
		System.out.println(uri.toString());
		System.out.println(uri.getHost());
		System.out.println(uri.getPort());
		System.out.println(uri.getPath());
	}
}
