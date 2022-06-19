package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class VistaFuncionalidadesAdministrador extends JPanel {
	private JPanel panel_Sur;
	private JPanel panel_Centro;
	private JButton btn_Logout;
	private JButton btn_BorrarCuenta;
	private JPanel panel_Salir;
	private JPanel panel_BorrarCuenta;
	private JPanel panel_Acciones_Border;
	private JPanel panel_Acciones;
	private JPanel panel_IniciarRondaEncuentrosLaborales_Border;
	private JButton btn_IniciarRondaEncuentrosLaborales;
	private JPanel panel_IniciarRondaContratacion_Border;
	private JButton btn_IniciarRondaContratacion;
	private JPanel panel;
	private JPanel panel_Sub_Border;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JPanel panel_Visualizar_Border;
	private JPanel panel_Visualizar;
	private JPanel panel_Visualizar_Norte;
	private JButton btn_VisualizarEmpleadosPretensos;
	private JButton btn_VisualizarTicketsEmpleadosPretensos;
	private JButton btn_VisualizarEmpleadores;
	private JButton btn_VisualizarTicketsEmpleadores;
	private JPanel panel_Visualizar_Sur;
	private JButton btn_VisualizarCuentas;
	private JButton btn_VisualizarLogins;
	private JButton btn_Contratos;

	/**
	 * Create the panel.
	 */
	public VistaFuncionalidadesAdministrador() {
		setLayout(new BorderLayout(0, 0));
		
		this.panel_Sur = new JPanel();
		add(this.panel_Sur, BorderLayout.SOUTH);
		this.panel_Sur.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel_Salir = new JPanel();
		this.panel_Sur.add(this.panel_Salir);
		
		this.btn_Logout = new JButton("Log out");
		this.panel_Salir.add(this.btn_Logout);
		
		this.panel_BorrarCuenta = new JPanel();
		this.panel_Sur.add(this.panel_BorrarCuenta);
		
		this.btn_BorrarCuenta = new JButton("Borrar cuenta");
		this.panel_BorrarCuenta.add(this.btn_BorrarCuenta);
		
		this.panel_Centro = new JPanel();
		add(this.panel_Centro, BorderLayout.CENTER);
		this.panel_Centro.setLayout(new BorderLayout(0, 0));
		
		this.panel_Acciones_Border = new JPanel();
		this.panel_Acciones_Border.setBorder(new TitledBorder(null, "Acciones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panel_Centro.add(this.panel_Acciones_Border, BorderLayout.NORTH);
		this.panel_Acciones_Border.setLayout(new BorderLayout(0, 0));
		
		this.panel_Acciones = new JPanel();
		this.panel_Acciones_Border.add(this.panel_Acciones);
		this.panel_Acciones.setLayout(new GridLayout(1, 2, 0, 0));
		
		this.panel_IniciarRondaEncuentrosLaborales_Border = new JPanel();
		this.panel_IniciarRondaEncuentrosLaborales_Border.setBorder(new TitledBorder(null, "Ronda de encuentros laborales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panel_Acciones.add(this.panel_IniciarRondaEncuentrosLaborales_Border);
		
		this.btn_IniciarRondaEncuentrosLaborales = new JButton("Iniciar");
		this.panel_IniciarRondaEncuentrosLaborales_Border.add(this.btn_IniciarRondaEncuentrosLaborales);
		
		this.panel_IniciarRondaContratacion_Border = new JPanel();
		this.panel_IniciarRondaContratacion_Border.setBorder(new TitledBorder(null, "Ronda de contrataci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panel_Acciones.add(this.panel_IniciarRondaContratacion_Border);
		
		this.btn_IniciarRondaContratacion = new JButton("Iniciar");
		this.panel_IniciarRondaContratacion_Border.add(this.btn_IniciarRondaContratacion);
		
		this.panel_Sub_Border = new JPanel();
		this.panel_Centro.add(this.panel_Sub_Border, BorderLayout.CENTER);
		this.panel_Sub_Border.setLayout(new BorderLayout(0, 0));
		
		this.scrollPane = new JScrollPane();
		this.panel_Sub_Border.add(this.scrollPane, BorderLayout.CENTER);
		
		this.textArea = new JTextArea();
		this.scrollPane.setViewportView(this.textArea);
		
		this.panel_Visualizar_Border = new JPanel();
		this.panel_Visualizar_Border.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Visualizar listas", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panel_Sub_Border.add(this.panel_Visualizar_Border, BorderLayout.NORTH);
		
		this.panel_Visualizar = new JPanel();
		this.panel_Visualizar_Border.add(this.panel_Visualizar);
		this.panel_Visualizar.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.panel_Visualizar_Norte = new JPanel();
		this.panel_Visualizar.add(this.panel_Visualizar_Norte);
		
		this.btn_VisualizarEmpleadosPretensos = new JButton("<html>Empleados <br/>pretensos</html>");
		this.panel_Visualizar_Norte.add(this.btn_VisualizarEmpleadosPretensos);
		
		this.btn_VisualizarTicketsEmpleadosPretensos = new JButton("<html><center>Tickets empleados<br/>pretensos<center/><html/>");
		this.panel_Visualizar_Norte.add(this.btn_VisualizarTicketsEmpleadosPretensos);
		
		this.btn_VisualizarEmpleadores = new JButton("Empleadores");
		this.panel_Visualizar_Norte.add(this.btn_VisualizarEmpleadores);
		
		this.btn_VisualizarTicketsEmpleadores = new JButton("<html><center>Tickets<br/><center/>empleadores<html/>");
		this.panel_Visualizar_Norte.add(this.btn_VisualizarTicketsEmpleadores);
		
		this.panel_Visualizar_Sur = new JPanel();
		this.panel_Visualizar.add(this.panel_Visualizar_Sur);
		
		this.btn_VisualizarCuentas = new JButton("Cuentas");
		this.panel_Visualizar_Sur.add(this.btn_VisualizarCuentas);
		
		this.btn_VisualizarLogins = new JButton("Logins");
		this.panel_Visualizar_Sur.add(this.btn_VisualizarLogins);
		
		this.btn_Contratos = new JButton("Contratos");
		this.panel_Visualizar_Sur.add(this.btn_Contratos);
		
		this.panel = new JPanel();
		add(this.panel, BorderLayout.NORTH);

	}

}