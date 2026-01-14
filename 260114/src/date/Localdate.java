package date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Localdate {
	public void seoulzone() {
		ZoneId seoulZone =ZoneId.of("Asia/Seoul");
		System.out.println(LocalDate.now(seoulZone));}
	public void zoneids() {
		Set<String> zoneIds = ZoneId.getAvailableZoneIds();
		List<String> sortedZones= new ArrayList<>(zoneIds);
		Collections.sort(sortedZones);
		System.out.println(sortedZones);}
	public void zoneid() {
		ZoneId seoulZone =ZoneId.of("Asia/Seoul");
		System.out.println(seoulZone);}
	public void datemanipulation() {
		LocalDate d=LocalDate.of(2026, 1, 17);
		System.out.println(d.plusDays(1));
	}
	public void timemanipulation() {
		LocalTime t=LocalTime.of(23, 59, 59);
		System.out.println(t.plusSeconds(1));
	}
	public void zoneddatetime() {
		ZonedDateTime zdt=ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(zdt.getOffset());
	}
	public void zoneddatetimemanipulation() {
		ZonedDateTime seoultime=ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		ZonedDateTime nzt=
		seoultime.withZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println(nzt);
	}
	public void between() {
		LocalDate start = LocalDate.of(2026, 1, 1);
		LocalDate end = LocalDate.of(2026, 12, 31);
		System.out.println(ChronoUnit.DAYS.between(start,end));
	}
	public void buisnessdays() {
		LocalDate start = LocalDate.of(2025, 11, 27);
		LocalDate end = LocalDate.of(2026, 1, 14);
		long buisnessDays=start.datesUntil(end)
			.filter(date->{DayOfWeek day= date.getDayOfWeek();
						   return day!=DayOfWeek.SATURDAY&& day!=DayOfWeek.SUNDAY;})
			.count();
		System.out.println("평일 수:"+buisnessDays);}
	public void formatting() {
		LocalDateTime dateTime= LocalDateTime.now();
		DateTimeFormatter formatter =DateTimeFormatter.ofPattern("yyyy/mm/dd a hh:mm:ss");
		System.out.println(dateTime.format(formatter));
	}
}
