package cu.anonymouscode.taller.models;

import java.util.EnumSet;

public class Electrico extends Vehiculo implements Convertible{
	private int voltaje;
	private int corriente;
	private TipoBateria tipoBateria;

	public Electrico(String matricula, int identificacion, int voltaje, int corriente, TipoBateria tipoBateria) {
		super(matricula, identificacion);
		this.voltaje = voltaje;
		this.corriente = corriente;
		this.tipoBateria = tipoBateria;
	}

	public int getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(int voltaje) {
		this.voltaje = voltaje;
	}

	public int getCorriente() {
		return corriente;
	}

	public void setCorriente(int corriente) {
		this.corriente = corriente;
	}

	public TipoBateria getTipoBateria() {
		return tipoBateria;
	}

	public void setTipoBateria(TipoBateria tipoBateria) {
		this.tipoBateria = tipoBateria;
	}

	@Override
	public Gasolina convertirAGasolina() {
		return new Gasolina(this.getMatricula()+"-C", this.getIdentificacion() + 1, EnumSet.of(TipoCombustible.B100));
	}
	
	@Override
	public String toString() {
		return "Vehículo Eléctrico: "
	            + "[ Identificación = "+this.getIdentificacion()+", "
	            + "Voltaje = "+this.getVoltaje()+", "
	            + "Corriente = "+this.getCorriente()+", "
	            + "Tipo Bateria = "+this.getTipoBateria().name()+", "
	            + "(Identificación Única = "+this.getIdentificacionUnica()+")\n"
	            + String.format("%" + "Información de Registro: ".length() + "s", " ") + "Información de Registro: "
	            + "Matrícula = "+this.getMatricula()+", "
	            + "Identificación = "+this.getIdentificacion()+", \n"
	            + String.format("%" + "Información de Registro: ".length() + "s", " ")
	            +"-> Convertido = "+this.convertirAGasolina()+"]";
	}
}
