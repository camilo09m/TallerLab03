import java.util.*;

public class Camion {

	private Sucursal Sucursal;
	private Collection<Flete> fletes;
	private String codigCamion;
	private String patente;
	private boolean estado;


	public Camion(Sucursal sucursal) {
		Sucursal = sucursal;
		añadirPatente(leerPatente());
		generarCodigoCamion(this.patente);


	}

	public String leerPatente() {
		var scanner = new Scanner(System.in);
		System.out.println("Ingrese la patente del camion: ");
		return scanner.nextLine();
	}

	public boolean validarPatente(String patente){
		return patente.length() == 6;
	}

	public void añadirPatente(String patente){
		if (validarPatente(patente)){
			this.patente = patente;
		}
	}

	public void generarCodigoCamion(String patente) {

		this.codigCamion = "Cam" + patente + "ion" + (Math.random()*50);

	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
}