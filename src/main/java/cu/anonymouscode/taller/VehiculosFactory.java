package cu.anonymouscode.taller;

import java.util.EnumSet;

import cu.anonymouscode.taller.models.Diesel;
import cu.anonymouscode.taller.models.Electrico;
import cu.anonymouscode.taller.models.Gasolina;
import cu.anonymouscode.taller.models.TipoBateria;
import cu.anonymouscode.taller.models.TipoBomba;
import cu.anonymouscode.taller.models.TipoCombustible;
import cu.anonymouscode.taller.models.Vehiculo;

public class VehiculosFactory {
	
	public static Vehiculo getVehiculo(String tipoVehiculo, String matricula, int identificacion, Object... parametros) {
		if ("diesel".equalsIgnoreCase(tipoVehiculo)) {
			if (parametros.length == 1) {
				TipoBomba tipoBomba = (TipoBomba) parametros[0];
				return new Diesel(matricula, identificacion, tipoBomba);
			}
		} else if ("gasolina".equalsIgnoreCase(tipoVehiculo)) {
			if (parametros.length == 1) {
				@SuppressWarnings("unchecked")
				EnumSet<TipoCombustible> combustibles = (EnumSet<TipoCombustible>) parametros[0];
				return new Gasolina(matricula, identificacion, combustibles);
			}
		} else if ("electrico".equalsIgnoreCase(tipoVehiculo)) {
			if (parametros.length == 3) {
				int voltaje = (Integer) parametros[0];
				int corriente = (Integer) parametros[1];
				TipoBateria tipoBateria = (TipoBateria) parametros[2];
				
				return new Electrico(matricula, identificacion, voltaje, corriente, tipoBateria);
			}
		} else {
			throw new IllegalArgumentException("Tipo de vehículo desconocido: " + tipoVehiculo);
		}
		
		return new Vehiculo(matricula, identificacion);
	}
}
