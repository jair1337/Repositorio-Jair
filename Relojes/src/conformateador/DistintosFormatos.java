package conformateador;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class DistintosFormatos {

	public static void main(String[] args) {

		
		System.out.print("Introduce una fecha en el siguiente formato dd/mm/aaaa:");
		String fechaString = UtilidadesT.introducirCadena();
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fecha = LocalDate.parse(fechaString, formateador);
		
		formateador = DateTimeFormatter.ofPattern("d-M-yy");
		System.out.println(fecha.format(formateador));
		formateador = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println(fecha.format(formateador));
		formateador = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		System.out.println(fecha.format(formateador));
		formateador = DateTimeFormatter.ofPattern("yyyy-MMMM-dd");
		System.out.println(fecha.format(formateador));
		System.out.println(fecha.getDayOfMonth() + " de " + fecha.getMonth().toString() + " de " +
		fecha.getYear());
		System.out.println(fecha.getDayOfMonth() + " de " + fecha.getMonth().getDisplayName(TextStyle.FULL,
		new Locale("es", "ES")) + " de " + fecha.getYear());
		
		LocalDateTime hoy = LocalDateTime.now(); 
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println(hoy.format(formato));
		formato = DateTimeFormatter.ofPattern("dd/MM/yyyy KK:mm a");
		System.out.println(hoy.format(formato));
		formato = DateTimeFormatter.ofPattern("dd/MMM/yyyy KK:mm a");
		System.out.println(hoy.format(formato));
		formato = DateTimeFormatter.ofPattern("dd/MMMM/yyyy KK:mm a");
		System.out.println(hoy.format(formato));
		formato = DateTimeFormatter.ofPattern("w");
		String semanaDelAño = hoy.format(formato);
		System.out.println("Semana del año: " + semanaDelAño);
		formato = DateTimeFormatter.ofPattern("W");
		String semanaDelMes = hoy.format(formato);
		System.out.println("Semana del mes: " + semanaDelMes);
		System.out.println("Día del año: " + hoy.getDayOfYear());
		System.out.println("Día de la semana en inglés: " + hoy.getDayOfWeek());
		System.out.println("Día de la semana en francés: " +
		hoy.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.FRANCE));
		System.out.println("Nº de día de la semana: " + hoy.getDayOfWeek().getValue());
		hoy = hoy.plusYears(1);
		System.out.println("Día de la semana el próximo año en inglés y formato corto: " +
		hoy.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.UK));
		formato = DateTimeFormatter.ofPattern("dd/MMMM/yyyy hh:mm");
		System.out.println("Día de la semana el próximo año: " + hoy.format(formato));
	}

}
