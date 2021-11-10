import java.util.*;

public class EmpresaTranspor {

	private ArrayList<Sucursal> sucursales = new ArrayList<>();
	private String nombre;
	private String direccion;

	public EmpresaTranspor(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public List<Sucursal> getSucursales() {
		return this.sucursales;
	}

	public Sucursal agregarSucursal(){
		Sucursal sucursal1 = new Sucursal(this, "ÑancoPincheiraCentro1", "Metropolitana" );
		this.sucursales.add(sucursal1);
		return sucursal1;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}
}