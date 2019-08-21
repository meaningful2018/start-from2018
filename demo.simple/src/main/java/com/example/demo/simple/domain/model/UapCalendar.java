package com.example.demo.simple.domain.model;

import org.springframework.util.StringUtils;

public class UapCalendar {

	private Long id;
	private Long tenantId;
	private Long year;
	private Long month;
	private Long day;
	private String timeZone;
	private String type;
	private String remarks;
	private String week;
	private String date;
	
	public UapCalendar(Long tenantId, String timeZone, Long year) {
		this.tenantId = tenantId;
		this.timeZone = timeZone;
		this.year = year;
	}
	private String toDate() {
		return year + "-" + month + "-" + day;
	}
	public String getDate() {
		if (StringUtils.isEmpty(date)) {
			date = toDate();
		}
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getTenantId() {
		return tenantId;
	}
	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}
	public Long getYear() {
		return year;
	}
	public void setYear(Long year) {
		this.year = year;
	}
	public Long getMonth() {
		return month;
	}
	public void setMonth(Long month) {
		this.month = month;
	}
	public Long getDay() {
		return day;
	}
	public void setDay(Long day) {
		this.day = day;
	}
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	public String getWeek() {
		return week;
	}
	public void setWeek(String week) {
		this.week = week;
	}
	@Override
	public String toString() {
		return "UapCalendar [tenantId=" + tenantId + ", year=" + year + ", month=" + month + ", day=" + day
				+ ", timeZone=" + timeZone + ", type=" + type + ", remarks=" + remarks + ", week=" + week + "]";
	}
	
}
