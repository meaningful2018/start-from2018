package com.example.demo.simple.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.example.demo.simple.domain.model.UapCalendar;

public class CalendarService {

	public List<UapCalendar> init(Long tenantId, String timeZone, Long year) {
		//ZoneId zone = ZoneId.of(timeZone, ZoneId.SHORT_IDS);
		LocalDate now = LocalDate.now();
		int thisYear = now.getYear();
		int initYear = year.intValue();
		if (thisYear > initYear) {
			return Collections.emptyList();
		}
		LocalDate local = LocalDate.ofYearDay(initYear, 1);
		int lengthOfYear = local.lengthOfYear();
		List<UapCalendar> result = new ArrayList<>();
		for (int day = 1; day <= lengthOfYear; day ++) {
			UapCalendar calendar = new UapCalendar(tenantId, timeZone, year);
			local = LocalDate.ofYearDay(initYear, day);
			calendar.setMonth((long) local.getMonthValue());
			calendar.setDay((long) local.getDayOfMonth());
			calendar.setWeek(local.getDayOfWeek().name());
			if (local.getDayOfWeek().getValue() > 5) {
				calendar.setType("1");
			} else {
				calendar.setType("0");
			}
			result.add(calendar);
		}
		return result;
		
	}
	
	public boolean judge(long date) {
		return false;
		//ZonedDateTime local = ZonedDateTime.ofInstant(Instant.ofEpochMilli(date), zone);
	}
}
