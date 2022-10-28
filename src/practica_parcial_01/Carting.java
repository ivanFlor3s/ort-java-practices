package practica_parcial_01;

import Test.HelloWord.MyHelper;

public class Carting {

	final int PRECIO_MAYORES = 100;
	final int PRECIO_MENORES = 70;
	
	private int idCarting;
	private Persona ultimoUsuario;
	private Persona usuarioActual;
	private boolean estaOperativo;
	private double recaudado;
	
	public Carting(int idCarting ) {
		this.idCarting = idCarting;
		this.ultimoUsuario = null;
		this.usuarioActual = null;
		this.estaOperativo = true;
		this.recaudado = 0;
	}

	public int getIdCarting() {
		return idCarting;
	}

	public void setIdCarting(int idCarting) {
		this.idCarting = idCarting;
	}

	public Persona getUltimoUsuario() {
		return ultimoUsuario;
	}

	public Persona getUsuarioActual() {
		return usuarioActual;
	}

	public boolean isEstaOperativo() {
		return estaOperativo;
	}

	public double getRecaudado() {
		return recaudado;
	}
	
	public void seSube(Persona alguien) {
		this.recaudado += alguien.esMenor() ? PRECIO_MENORES : PRECIO_MAYORES;
		this.ultimoUsuario = alguien;
		this.usuarioActual = alguien;
	}
	
	public void cambiarEstado() {
		this.estaOperativo = !this.isEstaOperativo();
		if(!this.estaOperativo) {
			this.usuarioActual = null;
		}
	}

	@Override
	public String toString() {
		return "Carting [idCarting=" + idCarting + ", ultimoUsuario=" + ultimoUsuario + ", usuarioActual="
				+ usuarioActual + ", estaOperativo=" + estaOperativo + ", recaudado=" + recaudado + "]";
	}
	
	public void mostrarCarting() {
		MyHelper h = new MyHelper();
		h.print(this.toString());
	}
	
	
	
	
	
	
}
