package localDates;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDateTime;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Data {

	public static void main(String[] args) {
		
		LocalDate sc = LocalDate.now();
		LocalDateTime sc2 = LocalDateTime.now();
		Instant sc3 = Instant.now();

		LocalDate sc4 = LocalDate.parse("2023-11-20");
		LocalDateTime sc5 = LocalDateTime.parse("2023-11-20T15:25:15");
		Instant sc6 = Instant.parse("2023-11-20T15:25:15-03:00");
		
		DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate sc7 = LocalDate.parse("21/11/2023", fm);
		LocalDate sc8 = LocalDate.of(0001, 12, 30);
		
		DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("MM/dd/yyyy mm:HH:");
		DateTimeFormatter fm4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime sc9 = LocalDateTime.now();
		DateTimeFormatter fm5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		LocalDateTime passado = sc2.minusYears(2024);
		LocalDateTime semanaPassada = sc2.minusWeeks(1);
		Instant futuro = sc3.plus(5, ChronoUnit.DAYS);
		
		Duration d1 = Duration.between(semanaPassada, sc5);
		
		System.out.println("Local Date agora = " + sc);
		System.out.println("Local Date time agora = " + sc2);
		System.out.println("Instant com fuso de londres = " + sc3);
		System.out.println("Local Date definido = " + sc4);
		System.out.println("Local Date Time definido = " + sc5);
		System.out.println("Instant definido = " + sc6);
		System.out.println("DateFormat = " + sc7);
		System.out.println("LocalDate elementos separados = " + sc8);
		System.out.println("Local Date formatado de maneira customizada = " + fm4.format(sc9));
		System.out.println("Local Date formatado de maneira customizada = " + fm2.format(sc9));
		System.out.println("Instant com fuso de londres = " + fm5.format(sc3));
		System.out.println("Passado da hora de agora = " + fm4.format(passado));
		System.out.println("Instante de hora de agora no futuro = " + fm5.format(futuro));
	}

}
