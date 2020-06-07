package date.newapi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		
		String dataNasc = "19/11/1986 22:00:00";
		
		LocalDateTime ldt = LocalDateTime.parse(dataNasc, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		LocalDateTime now = LocalDateTime.now();
		
		Duration d = Duration.between(ldt, now);
		System.out.println("HORAS: " + d.toHours());
		System.out.println("DIAS: " + d.toDays());
		
		Period p = Period.between(ldt.toLocalDate(), now.toLocalDate());
		System.out.println("MESES: " + p.toTotalMonths());
		
		System.out.println("SEMANAS: " + ChronoUnit.WEEKS.between(ldt, now));
		System.out.println("ANOS: " + ChronoUnit.YEARS.between(ldt, now));
		
		YearMonth ym = YearMonth.of(2030, 10);
		System.out.println(ym);
		
		Month m = Month.of(3);
		System.out.println(m);
		
		LocalDate ld = LocalDate.now();
		ld = ld.plusMonths(1);
		ld = ld.minusWeeks(2).plusDays(2);
		System.out.println(ld);
	}
}
