package fechasyhoras;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class CambioDeMilenio {

	public static void main(String[] args) {
		
/* Tomamos la fecha del segundo milenio, el anio 2000, y lo comparamos con la actualidad por lo que debemos ajustar las fechas y horas de ese tiempo */
		
		
//Apartado fecha (LocalDate)
		LocalDate date1 = LocalDate.of(2000, 1, 1); 
		System.out.println(date1.getYear());     
		System.out.println(date1.getMonth());    
		System.out.println(date1.getDayOfMonth());
		
		LocalDate date2 = LocalDate.of(2000, Month.JANUARY, 1);

		LocalDate dateNow = LocalDate.of(2000, 1, 1);
		
		System.out.println("La fecha es: " + dateNow);
		System.out.println("-------------------------------------------");
		
//Apartado tiempo (LocalTime)
		LocalTime time1 = LocalTime.of(0, 0, 0, 0); 
		System.out.println(time1.getHour());   
		System.out.println(time1.getMinute()); 
		System.out.println(time1.getSecond()); 
        System.out.println(time1.getNano());   
		
		LocalTime timeNow = LocalTime.of(0, 0, 0, 0);
		
		System.out.println("La hora es: " + timeNow);
		System.out.println("-------------------------------------------");
		
//Apartado DateTime
		LocalDateTime dateTime1 = LocalDateTime.of(2000, 1, 1, 0, 0, 0, 0); 
		
		LocalDate date3 = LocalDate.of(2000, 1, 1);
		LocalTime time2 = LocalTime.of(0, 0, 0, 0);
		LocalDateTime dateTime2 = LocalDateTime.of(date3, time2);
		
		// Simulación de "now"
		LocalDateTime dateTimeNow = LocalDateTime.of(2000, 1, 1, 0, 0);
		
		System.out.println("La fecha y hora son: " + dateTimeNow);
		System.out.println("-------------------------------------------");
		
//Apartado instante 
		Instant instant1 = Instant.ofEpochSecond(0); 
		System.out.println("Instant del inicio de la época Unix: " + instant1);
		
		Instant instantNow = Instant.parse("2000-01-01T00:00:00Z");
		System.out.println("Instant en el cambio de milenio:     " + instantNow);
		System.out.println("-------------------------------------------");
		
//Apartado duration
		LocalTime localTimeA = LocalTime.of(23, 0);  
		LocalTime localTimeB = LocalTime.of(0, 0);   
		
		
		Duration duracion1 = Duration.between(
		    localTimeA,
		    localTimeB.plusHours(24) // No es lo mismo plus Days que Hours, incluso da error
		);
		
		LocalDateTime localDateTimeA = LocalDateTime.of(1999, Month.DECEMBER, 31, 23, 0);
		LocalDateTime localDateTimeB = LocalDateTime.of(2000, Month.JANUARY, 1, 0, 0);
		Duration duracion2 = Duration.between(localDateTimeA, localDateTimeB);
		
		Duration duracionUnDia1 = Duration.of(1, ChronoUnit.DAYS);
		
		Duration duracionUnDia2 = Duration.ofDays(1);
		
		// PT significa PeriodTime, que es basicamente menos de 23 horas
		
		System.out.println("Duración entre 23:00 y 00:00 del día siguiente: " + duracion1);
		System.out.println("Duración entre 31/12/1999 23:00 y 1/1/2000 00:00: " + duracion2);
		System.out.println("Un día de duración (opción 1): " + duracionUnDia1);
		System.out.println("Un día de duración (opción 2): " + duracionUnDia2);
		System.out.println("-------------------------------------------");
		
//Apartado period
		LocalDate localDateA = LocalDate.of(1999, Month.DECEMBER, 31);
		LocalDate localDateB = LocalDate.of(2000, Month.JANUARY, 1);
		Period period1 = Period.between(localDateA, localDateB);
		
		Period period2 = Period.of(1, 2, 3);

		Period period3 = Period.ofYears(1);

		System.out.println("Periodo entre 31/12/1999 y 1/1/2000: " + period1);
		System.out.println("Periodo de 1 año, 2 meses y 3 días: " + period2);
		System.out.println("Periodo de 1 año: " + period3);

	}

}
