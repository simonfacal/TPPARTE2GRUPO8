package entidades;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import excepciones.ModificacionTicketInvalidaException;
import patronState.ActivoState;
import patronState.IState;

public abstract class Ticket {
    private GregorianCalendar fechaAlta; //tener en cuenta para visual
    protected  IState estado;
    private FormularioDeBusqueda formularioDeBusqueda;
    /**
     * @aggregation shared
     */
    
    
    public void suspender()
	   {
		  this.estado.suspender();
		  
	   }
	   public void cancelar()
	   {
		  this.estado.cancelar();
	   }
	   
	public  void modificarTicket_Formulario(FormularioDeBusqueda form) throws ModificacionTicketInvalidaException
	   {
		   this.estado.modificarTicket_Formulario(form);  
	   }
 
	   
	public void comparaFormularioEmpleador(Persona_Empleador empleador,Persona_EmpleadoPretenso empleadoP,GregorianCalendar fecha,ArrayList<Persona_EmpleadoPretenso>empleadosPretensos)
	{
		this.estado.comparaFormularioEmpleador(empleador,empleadoP, fecha, empleadosPretensos);
			
	}
	
	public void comparaFormularioEmpleadoPretenso(Persona_EmpleadoPretenso empleadoP,Persona_Empleador empleador)
	{
		this.estado.comparaFormularioEmpleadoPretenso(empleadoP, empleador);	
	}
	   
	public String visualizaResultado(Usuario usuario)
	{
		return this.estado.visualizaResultado(usuario);
	}
	
	public void seteaResultado(Persona_EmpleadoPretenso empleadoElegido)
	{
		this.estado.seteaResultado(empleadoElegido);
	}
	
	public void activar()
	{
		this.estado.activar();
	}
	
	public String visualizarCostoServicio(Persona usuario)
	{
		
		return this.estado.visualizarCostoServicio(usuario);
	}
	
	public void setEstado(IState estado) {
		this.estado = estado;
	}

	public Ticket(FormularioDeBusqueda formularioDeBusqueda) {
		super();
		this.formularioDeBusqueda = formularioDeBusqueda;
		this.fechaAlta=new GregorianCalendar();
		this.estado = new ActivoState(this);
	}
	
	public FormularioDeBusqueda getFormularioDeBusqueda() {
		
		return formularioDeBusqueda;
	}

	public void setFormularioDeBusqueda(FormularioDeBusqueda formularioDeBusqueda) {
		this.formularioDeBusqueda = formularioDeBusqueda;
	}

	

	@SuppressWarnings("deprecation")
	@Override
	public String toString() {
		return " [Fecha de alta = " + fechaAlta.getTime().toLocaleString() + ", estado=" + estado + ", formulario de busqueda="
				+ formularioDeBusqueda+ "]";
	}
	
	
}