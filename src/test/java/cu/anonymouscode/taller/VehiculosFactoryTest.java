package cu.anonymouscode.taller;

import org.junit.Before;
import org.junit.Test;

import cu.anonymouscode.taller.models.Diesel;
import cu.anonymouscode.taller.models.Electrico;
import cu.anonymouscode.taller.models.Gasolina;
import cu.anonymouscode.taller.models.TipoBateria;
import cu.anonymouscode.taller.models.TipoBomba;
import cu.anonymouscode.taller.models.TipoCombustible;
import cu.anonymouscode.taller.models.Vehiculo;

import static org.junit.Assert.*;

import java.util.EnumSet;

public class VehiculosFactoryTest {

    private Vehiculo vehiculo;

    @Before
    public void setUp() {
        vehiculo = VehiculosFactory.getVehiculo("diesel", "ABC123", 456789, TipoBomba.LINEAL);
    }

    @Test
    public void testGetVehiculoDiesel() {
        assertTrue(vehiculo instanceof Diesel);
        assertEquals("ABC123", vehiculo.getMatricula());
        assertEquals(456789, vehiculo.getIdentificacion());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetVehiculoTipoDesconocido() {
        VehiculosFactory.getVehiculo("híbrido", "XYZ987", 654321);
    }

    @Test
    public void testGetVehiculoGasolina() {
        vehiculo = VehiculosFactory.getVehiculo("gasolina", "DEF456", 789012, EnumSet.of(TipoCombustible.B100));
        assertTrue(vehiculo instanceof Gasolina);
        assertEquals("DEF456", vehiculo.getMatricula());
        assertEquals(789012, vehiculo.getIdentificacion());
    }

    @Test
    public void testGetVehiculoElectrico() {
        vehiculo = VehiculosFactory.getVehiculo("electrico", "GHI789", 101112, 12, 15, TipoBateria.LITIO);
        assertTrue(vehiculo instanceof Electrico);
        assertEquals("GHI789", vehiculo.getMatricula());
        assertEquals(101112, vehiculo.getIdentificacion());
    }
}