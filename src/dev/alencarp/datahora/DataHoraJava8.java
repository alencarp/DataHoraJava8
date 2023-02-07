package dev.alencarp.datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DataHoraJava8 {

	public static void main(String[] args) {
		
		//LocalDate - representa uma data: 06/08/1990
		LocalDate ldNow = LocalDate.now();
		System.out.println(ldNow);
		LocalDate ld = LocalDate.of(1990, Month.APRIL, 06);
		System.out.println(ld);
		
		//LocalTime - representa uma hora: 11:40:00
		LocalTime ltNow = LocalTime.now();
		System.out.println(ltNow);
		LocalTime lt = LocalTime.of(11, 40, 34);
		System.out.println(lt);
		
		//LocalDateTime - representa data+hora: 06/08/1990 11:40:00
		LocalDateTime ldtNow = LocalDateTime.now();
		System.out.println(ldtNow);
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		System.out.println(ldt);
		
		//Instant - representa um instante/momento na linha do tempo em Greenwich
		//(milissegundos a partir de: 01/01/1970 00:00:00)
		// Ex.: 06/08/1990 11:40:00 GMT/UTC (Greenwich Mean Time)
		Instant iNow = Instant.now();
		System.out.println(iNow);
		Instant i = Instant.ofEpochMilli(500000000000L);
		System.out.println(i);
		
		//ZonedDateTime - LocalDateTime com TimeZone (fuso horário)
		//Ex.: 06/08/1990 11:40:00 GMT-3 (America/Sao_Paulo)
		ZonedDateTime zdtNow = ZonedDateTime.now();
		System.out.println(zdtNow);		
//		ZoneId zone = ZoneId.systemDefault();		
		ZoneId zone = ZoneId.of("Asia/Tokyo");
		ZonedDateTime zdt = ZonedDateTime.of(ldt, zone);
		System.out.println(zdt);
		
	}

}
