package cu.anonymouscode.taller.models;

public class Vehiculo {
	private String matricula;
	private int identificacion;
	
	public Vehiculo() {}
	
	public Vehiculo(String matricula, int identificacion) {
		this.matricula = matricula;
		this.identificacion = identificacion;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	public String getMatricula() {
		return matricula;
	}
	
	public int getIdentificacion() {
		return identificacion;
	}
	
	public String getIdentificacionUnica() {
		return matricula + identificacion;
	}
	
	@Override
	public String toString() {
		return "Vehiculo "
				+ "[Matricula=" + matricula + ", "
				+ "Identificacion=" + identificacion;
	}
	
}
