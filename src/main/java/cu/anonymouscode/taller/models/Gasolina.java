package cu.anonymouscode.taller.models;

import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

public class Gasolina extends Vehiculo {
	private EnumSet<TipoCombustible> combustibles;
	
	public Gasolina() {
		this.combustibles = EnumSet.noneOf(TipoCombustible.class);
	}
	
	public Gasolina(String matricula, int identificacion, EnumSet<TipoCombustible> combustibles) {
		super(matricula, identificacion);
		this.combustibles = combustibles;
	}


	public EnumSet<TipoCombustible> getCombustible() {
		return combustibles;
	}

	public void setCombustible(EnumSet<TipoCombustible> combustible) {
		this.combustibles = combustible;
	}
	
	public void añadirCombustible(TipoCombustible combustible) {
        this.combustibles.add(combustible);
    }
	
	private List<String> obtenerCombustible() {
        return this.combustibles.stream()
                .map(TipoCombustible::toString)
                .collect(Collectors.toList());
    }
	
	@Override
	public String toString() {
		return "Vehículo Gasolina: "
				+ "[ Matrícula = "+this.getMatricula()+", "
				+"Combustibles = "+this.obtenerCombustible()+", "
				+"(Identificación Única = "+this.getIdentificacionUnica()+"]";
	}
}
