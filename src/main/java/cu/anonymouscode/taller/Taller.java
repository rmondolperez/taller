package cu.anonymouscode.taller;

import java.util.HashMap;
import java.util.Map;

import cu.anonymouscode.taller.models.Diesel;
import cu.anonymouscode.taller.models.Electrico;
import cu.anonymouscode.taller.models.Gasolina;
import cu.anonymouscode.taller.models.Vehiculo;

class Taller {
    private Map<String, Vehiculo> vehiculos;

    public Taller() {
        this.vehiculos = new HashMap<>();
    }

    public void registrarEntrada(Vehiculo vehiculo) {
        vehiculos.put(vehiculo.getMatricula()+vehiculo.getIdentificacion(), vehiculo);
    }

    public void registrarSalida(String identificacionUnica) {
        vehiculos.remove(identificacionUnica);
    }

    public void vehiculosEnTaller() {
        vehiculos.forEach((identificacionUnica, vehiculo) -> {
            if (vehiculo instanceof Diesel) {
                System.out.println(vehiculo);
            } else if (vehiculo instanceof Electrico) {
            	System.out.println(vehiculo);
            } else if (vehiculo instanceof Gasolina) {
            	System.out.println(vehiculo);
            } 
        });
    }

	public Map<String, Vehiculo> getVehiculos() {
		return vehiculos;
	}
    
}
