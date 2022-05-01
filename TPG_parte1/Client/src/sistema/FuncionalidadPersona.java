package sistema;

import entidades.FormularioDeBusqueda;
import entidades.Persona;

public abstract class FuncionalidadPersona {
	
	public void activarTicket(Persona persona) {
		persona.getTicket().setEstado("activado");
	}
	
	public void suspenderTicket(Persona persona) {
		persona.getTicket().setEstado("suspendido");
	}
	
	public void cancelarTicket(Persona persona) {
		persona.getTicket().setEstado("cancelado");		
	}
	
	public void modificarTicket_Formulario(Persona persona,FormularioDeBusqueda form) {
		persona.getTicket().setFormularioDeBusqueda(form);
	}
	
	public abstract void iniciarRondaEleccion(Persona persona);
	
	public void visualizarListaAsignacion(Persona persona) {
		System.out.println(persona.getListaDeAsignacion());
	}
	
	public void visualizarCostoServicio(Persona persona) {
		System.out.println(persona.getCostoServicio());
	}
}
