package cu.anonymouscode.taller.models;

public class Diesel extends Vehiculo {
	TipoBomba tipoBomba;

	public Diesel(String matricula, int identificacion, TipoBomba tipoBomba) {
		super(matricula, identificacion);
		this.tipoBomba = tipoBomba;
	}

	public TipoBomba getTipoBomba() {
		return tipoBomba;
	}

	public void setTipoBomba(TipoBomba tipoBomba) {
		this.tipoBomba = tipoBomba;
	}

	@Override
	public String toString() {
		return "Vehículo Diesel: "
				+ "[ Matrícula = "+this.getMatricula()+", "
				+ "Tipo de Bomba = "+this.tipoBomba.name()+", "
				+ "(Identificacion Unica = "+this.getIdentificacionUnica()+")]";
	}
	
}
