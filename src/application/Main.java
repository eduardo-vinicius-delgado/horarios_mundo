package application;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a").withZone(ZoneId.systemDefault());
		Instant d01 = Instant.now();
		LocalDateTime dtPortugal  = LocalDateTime.ofInstant(d01, ZoneId.of("Portugal"));
		LocalDateTime dtJpan  = LocalDateTime.ofInstant(d01, ZoneId.of("Japan"));
		LocalDateTime dtAustralia =  LocalDateTime.ofInstant(d01, ZoneId.of("Australia/Hobart"));
		LocalDateTime dtGreenwich = LocalDateTime.ofInstant(d01, ZoneId.of("Greenwich"));
		
		System.out.println("Dia e horário local (Brasil) - " + fmt1.format(d01));
		System.out.println("Dia e horário remoto (Portugual) - " + dtPortugal.format(fmt1));
		System.out.println("Dia e horário remoto (Japão) - " + dtJpan.format(fmt1));
		System.out.println("Dia e horário remoto (Australia/Hobart) - " + dtAustralia.format(fmt1));
		System.out.println("Dia e horário remoto (Londres) - " + dtGreenwich.format(fmt1));
	}

}
