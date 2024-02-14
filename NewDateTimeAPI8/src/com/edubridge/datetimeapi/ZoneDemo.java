package com.edubridge.datetimeapi;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneDemo {

	public static void main(String[] args) {
		ZonedDateTime z = ZonedDateTime.now();
		System.out.println(z);
		
		OffsetTime o = OffsetTime.now();
		System.out.println(o);
		
		OffsetDateTime d = OffsetDateTime.now();
		System.out.println(d);
		
		ZoneId i = ZoneId.of("Asia/Calcutta");
		System.out.println(i);
		
		ZoneOffset s = ZoneOffset.UTC;
		System.out.println(s);
		
		ZoneOffset s1 = ZoneOffset.MAX;
		System.out.println(s1);
		
		String str ="2024-02-14 01:00";
		DateTimeFormatter dr = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime l1 = LocalDateTime.parse(str, dr);
		System.out.println(l1);
		System.out.println(dr);

	}

}
