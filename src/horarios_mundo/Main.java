package horarios_mundo;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a").withZone(ZoneId.systemDefault());
		Instant d01 = Instant.now();
		LocalDateTime d02  = LocalDateTime.ofInstant(d01, ZoneId.of("Portugal"));
		LocalDateTime d03  = LocalDateTime.ofInstant(d01, ZoneId.of("Japan"));
		LocalDateTime d04 =  LocalDateTime.ofInstant(d01, ZoneId.of("Australia/Hobart"));
		LocalDateTime d05 = LocalDateTime.ofInstant(d01, ZoneId.of("Greenwich"));
		
		System.out.println("Dia e hor�rio local (Brasil) - " + fmt1.format(d01));
		System.out.println("Dia e hor�rio remoto (Portugual) - " + d02.format(fmt1));
		System.out.println("Dia e hor�rio remoto (Jap�o) - " + d03.format(fmt1));
		System.out.println("Dia e hor�rio remoto (Australia/Hobart) - " + d04.format(fmt1));
		System.out.println("Dia e hor�rio remoto (Londres) - " + d05.format(fmt1));
	}

}
