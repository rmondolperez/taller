package cu.anonymouscode.taller;

import org.junit.Before;
import org.junit.Test;

import cu.anonymouscode.taller.models.Diesel;
import cu.anonymouscode.taller.models.Electrico;
import cu.anonymouscode.taller.models.Gasolina;
import cu.anonymouscode.taller.models.TipoBomba;
import cu.anonymouscode.taller.models.Vehiculo;
import cu.anonymouscode.taller.models.TipoCombustible;
import cu.anonymouscode.taller.models.TipoBateria;

import static org.junit.Assert.*;

import java.util.EnumSet;

public class TallerTest {

    private Taller taller;
    private Vehiculo diesel;
    private Vehiculo gasolina;
    private Vehiculo electrico;

    @Before
    public void setUp() {
        taller = new Taller();
        diesel = new Diesel("D", 456789, TipoBomba.LINEAL);
        gasolina = new Gasolina("G", 789012, EnumSet.of(TipoCombustible.B100));
        electrico = new Electrico("E", 58439, 34, 45, TipoBateria.GEL);
        
    }

    @Test
    public void testRegistrarEntrada() {
        taller.registrarEntrada(diesel);
        taller.registrarEntrada(gasolina);
        taller.registrarEntrada(electrico);
        assertTrue(taller.getVehiculos().containsKey(diesel.getMatricula() + diesel.getIdentificacion()));
        assertTrue(taller.getVehiculos().containsKey(gasolina.getMatricula() + gasolina.getIdentificacion()));
        assertTrue(taller.getVehiculos().containsKey(electrico.getMatricula() + electrico.getIdentificacion()));
    }

    @Test
    public void testRegistrarSalida() {
        taller.registrarEntrada(gasolina);
        taller.registrarSalida(gasolina.getMatricula() + gasolina.getIdentificacion());
        assertFalse(taller.getVehiculos().containsKey(gasolina.getMatricula() + gasolina.getIdentificacion()));
    }
}