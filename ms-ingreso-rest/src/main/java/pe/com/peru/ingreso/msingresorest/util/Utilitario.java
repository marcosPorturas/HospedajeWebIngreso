package pe.com.peru.ingreso.msingresorest.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilitario {
	
	public static String convertirFechaddMMYYYY (Date date) {
		String dateConvert = "";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		dateConvert = sdf.format(date);
		return dateConvert;
	}
	
	public static String convertirHoraHHmmss (Date date) {
		String dateConvert = "";
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		dateConvert = sdf.format(date);
		return dateConvert;
	}

}
