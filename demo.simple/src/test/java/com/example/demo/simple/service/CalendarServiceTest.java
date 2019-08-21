package com.example.demo.simple.service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

import com.example.demo.simple.domain.model.UapCalendar;

public class CalendarServiceTest {

	public static void main(String[] args) {
		CalendarService service = new CalendarService();
		Long tenantId = 1L;
		String timeZone = "CTT";
		Long year = 2020L;
		List<UapCalendar> result = service.init(tenantId, timeZone, year);
		result.forEach(r -> System.out.println(r.toString()));
		System.out.println("total:" + result.size());
		LocalDate date = LocalDate.now();
		LocalDate date2 = date.plusDays(5);
		ZoneId zone = ZoneId.of("UTC+8");
		System.out.println("begin:" + date.atStartOfDay(zone).toInstant().toEpochMilli());
		System.out.println("END:" + date2.atStartOfDay(zone).toInstant().toEpochMilli());
	}

}
