package application;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		DateTimeFormatter formatoSaida = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a").withZone(ZoneId.systemDefault());
		Instant dtBrazil = Instant.now();
		LocalDateTime dtPortugal  = LocalDateTime.ofInstant(dtBrazil, ZoneId.of("Portugal"));
		LocalDateTime dtJapan  = LocalDateTime.ofInstant(dtBrazil, ZoneId.of("Japan"));
		LocalDateTime dtAustralia =  LocalDateTime.ofInstant(dtBrazil, ZoneId.of("Australia/Hobart"));
		LocalDateTime dtGreenwich = LocalDateTime.ofInstant(dtBrazil, ZoneId.of("Greenwich"));
		
		System.out.println("Dia e hor�rio local (Brasil) - " + formatoSaida.format(dtBrazil));
		System.out.println("Dia e hor�rio remoto (Portugual) - " + dtPortugal.format(formatoSaida));
		System.out.println("Dia e hor�rio remoto (Jap�o) - " + dtJapan.format(formatoSaida));
		System.out.println("Dia e hor�rio remoto (Australia/Hobart) - " + dtAustralia.format(formatoSaida));
		System.out.println("Dia e hor�rio remoto (Londres) - " + dtGreenwich.format(formatoSaida));
	}

}
