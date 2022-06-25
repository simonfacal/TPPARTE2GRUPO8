package vista;

import java.awt.event.ActionListener;

public interface IVistaSimulacion
{
	void setActionListener(ActionListener actionListener);
	void setIniciarDisabled();
	void setDetenerDisabled();
	void setTextArea_Consola(String textArea_Consola);
	void setTextArea_Empleadores(String textArea_Empleadores);
	void setTextArea_EmpleadosPretensos(String textArea_EmpleadosPretensos);
}
