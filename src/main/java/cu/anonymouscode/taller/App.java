package cu.anonymouscode.taller;

import java.util.EnumSet;

import cu.anonymouscode.taller.models.TipoBateria;
import cu.anonymouscode.taller.models.TipoBomba;
import cu.anonymouscode.taller.models.TipoCombustible;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	
    	Taller mercedes = new Taller();
    	
    	mercedes.registrarEntrada(VehiculosFactory.getVehiculo("Diesel", "D", 4534, TipoBomba.LINEAL));
    	mercedes.registrarEntrada(VehiculosFactory.getVehiculo("Gasolina", "G", 1234, EnumSet.of(TipoCombustible.B100, TipoCombustible.B83)));
    	mercedes.registrarEntrada(VehiculosFactory.getVehiculo("Electrico", "E", 8753, 34, 45, TipoBateria.LITIO));
    	
    	mercedes.vehiculosEnTaller();
    	
    	mercedes.registrarSalida("G1234");
    	
    	System.out.println("+++++++++++++++++++++++");
    	
    	mercedes.vehiculosEnTaller();
    	
    }
}
