package com.example.demo.simple.service;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.zone.ZoneRules;
import java.util.TimeZone;

public class TimeZoneTest {

	public static void main(String[] args) {
		//ZoneId.getAvailableZoneIds().forEach(System.out :: println);
//		ZoneOffset zoneOffset = ZoneOffset.of("+12");
//		System.out.println(zoneOffset.getId());
//		ZoneId zone = ZoneId.ofOffset("UTC", zoneOffset);
//		System.out.println(zone.getId());
		ZoneId zone2 = ZoneId.of("ACT", ZoneId.SHORT_IDS);
		System.out.println(zone2.toString());
		//ZoneId zone3 = ZoneId.systemDefault();
		ZoneRules rules = zone2.getRules();
		ZoneOffset zoneOffset2 = rules.getOffset(Instant.now());
		System.out.println(zoneOffset2.getId());
//		System.out.println(zoneOffset2.getTotalSeconds() / 3600);
		ZoneId zone4 = ZoneId.ofOffset("UTC", zoneOffset2);
		System.out.println(zone4.getId());
//		TimeZone zone10 = TimeZone.getDefault();
		
	}

}
