package sistema;

import entidades.FormularioDeBusqueda;
import entidades.Persona;
import entidades.Ticket;
import excepciones.ListaNoGeneradaException;
import excepciones.ModificacionTicketInvalidaException;

public abstract class FuncionalidadPersona extends FuncionalidadUsuario{

	private Persona persona=((Persona)usuario);
	public FuncionalidadPersona(Persona persona) {
		super(persona);
	}

	public void suspender()
	   {
		  persona.getTicket().suspender();
		  
	   }
	   public void cancelar()
	   {
		   persona.getTicket().cancelar(); 
	   }
	   
	   void modificarTicket_Formulario(FormularioDeBusqueda form) throws ModificacionTicketInvalidaException
	   {
		   persona.getTicket().modificarTicket_Formulario(form);  
	   }
	
	public void activar()
	{
		persona.getTicket().activar();
	}
	
	
	public abstract void iniciarRondaEleccion();
	
	public String visualizarListaAsignacion() throws ListaNoGeneradaException {
		String str = null;
		
		if (persona.getListaDeAsignacion() != null)
			str = "" + ((Persona) usuario).getListaDeAsignacion();
		else
			throw new ListaNoGeneradaException();
		return str;
	}
	
	public String visualizarCostoServicio()
	{
		
		return persona.getTicket().visualizarCostoServicio(persona);
	}
	
	public abstract String visualizaResultado();
	public abstract String visualizarPersonasElegidas();
} 