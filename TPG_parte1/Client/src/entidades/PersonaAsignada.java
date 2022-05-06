package entidades;


public class PersonaAsignada implements Comparable<PersonaAsignada>{
	private Persona persona;
	private double puntajeDeContratacion;
	
	public PersonaAsignada(Persona persona, double puntajeDeContratacion) {
		super();
		this.persona = persona;
		this.puntajeDeContratacion = puntajeDeContratacion;
	}

	public Persona getPersona() {
		return persona;
	}

	public double getPuntajeDeContratacion() {
		return puntajeDeContratacion;
	}

	@Override
	public int compareTo(PersonaAsignada o) { 
		
		int respuesta=0;
		if (this.puntajeDeContratacion<o.puntajeDeContratacion)
			respuesta=1;
		else
			if (this.puntajeDeContratacion > o.puntajeDeContratacion)
				respuesta=-1;
			else
				respuesta = 0;
		
		return respuesta;
	}

	@Override
	public String toString() {
		return persona + ", puntajeDeContratacion=" + puntajeDeContratacion;
	}
	
	
}
