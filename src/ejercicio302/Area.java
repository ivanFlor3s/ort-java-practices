package ejercicio302;

import java.util.ArrayList;

public class Area {

	private ArrayList<Oficina> oficinas;
	private String nombreArea;
	
	public Area(String nombre) {
		this.oficinas = new ArrayList<Oficina>();
		this.nombreArea = nombre;
		
	}
	
	public String informarEmpleadosOficinas() {
		String result = "Informe Area: " + this.nombreArea + "\n";
		
		for (Oficina oficina : oficinas) {
			oficina.informarNombreEmpleados();
		}
		return result;
	}
	
	public boolean agregarEmpleadoEnOficina(int idOficina,Empleado emp) {
		boolean success = false;
		boolean puedoAgregar = this.checkEmpleadoEnOtraOficina(emp);
		if(puedoAgregar) {
			Oficina of = this.buscarOficina(idOficina);
			if(of != null) {
				of.agregarEmpleado(emp);
				success = true;
			}
		}
		return success;
	}
	
	private Oficina buscarOficina(int idOf) {
		Oficina oficinaRef = null;
		int index = 0;
		while (oficinaRef == null && (this.oficinas.size()-1 != index)) {
			Oficina aux = this.oficinas.get(index);
			oficinaRef = aux.getIdOficina() == idOf ? aux : null;
		}
		return oficinaRef;
	}
	
	private boolean checkEmpleadoEnOtraOficina(Empleado emp ){
		boolean exiteEmpleado = false;
		int index = 0;
		while(!exiteEmpleado && index!= (oficinas.size() - 1)) {
			exiteEmpleado = this.oficinas.get(index).buscarEmpleado(emp) != null ;
		}
		if(!exiteEmpleado) {
			System.out.println("El empleado: " + emp.obtenerNombre()+ " ya existe \n" );
		}
		return exiteEmpleado;
	}
	
}
