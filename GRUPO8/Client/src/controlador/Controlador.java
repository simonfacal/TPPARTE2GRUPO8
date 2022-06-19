package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import vista.IVista;
import vista.VistaInicial;
import vista.VistaRegistrarAdministrador;
import vista.Ventana;

public class Controlador implements ActionListener
{
	private IVista vista=null;
	
	private final String VISTA_INICIAL_CREAR_CUENTA = "VistaInicial_CrearCuenta";
	
	public Controlador(IVista vista) {
		super();
		this.vista = vista;
		vista.setActionListener(this);
	}

	//hacer constructor y settear la vista,la clase o clases del modelo y tambien a la vista le seteo el actionListener el propio controlador
	@Override
	public void actionPerformed(ActionEvent e)
	{
		JPanel contentPane = this.vista.getContentPane();
		CardLayout cl = (CardLayout)(contentPane.getLayout());
		String comando = e.getActionCommand();
		
		if(comando.equals(VISTA_INICIAL_CREAR_CUENTA)) {
			vista.setSizeVentana(350, 265);
			cl.show(contentPane, Ventana.VISTA_REGISTRAR_ADMINISTRADOR);
		}
	}

	
	
	
	
	
	
	
	
}