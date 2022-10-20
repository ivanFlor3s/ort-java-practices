package ejercicio302;

import java.util.ArrayList;

public class Oficina {

	private ArrayList<Empleado> empleados;
	private int idOficina;
	private String nombreOficina;
	
	
	public Oficina(int idOficina, String nombreOficina) {
		this.empleados = new ArrayList<Empleado>();
		this.idOficina = idOficina;
		this.nombreOficina = nombreOficina;
	}
	
	public String informarNombreEmpleados() {
		String informe = "Informe de la oficina: " + idOficina + " - " + nombreOficina  + "\n";
		int index = 1;
		for (Empleado empleado : empleados) {
			informe += index + "- " + empleado.obtenerNombre() + "\n";
			index++;
		}
		return informe;
	}
	
	public void agregarEmpleado(Empleado emp) {
		this.empleados.add(emp);
	}
	
	public Empleado buscarEmpleado(Empleado emp) {
		Empleado empleadoRef = null;
		int index = 0;
		while (empleadoRef == null || (index != this.empleados.size() )  ) {
			empleadoRef = empleados.get(index).compararEmpleado(emp) ?  empleados.get(index) : null;
			
		}
		return empleadoRef;
	}
	
	public boolean puedoAgregarEmpleado(Empleado emp) {
		return this.buscarEmpleado(emp) == null;
	}

	public int getIdOficina() {
		return idOficina;
	}

	public String getNombreOficina() {
		return nombreOficina;
	}
	
	
	
	
	
}
