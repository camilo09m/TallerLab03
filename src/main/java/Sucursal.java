import java.util.*;

public class Sucursal {

	private EmpresaTranspor EmpresaTranspor;
	private ArrayList<Camion> camiones = new ArrayList<>();;
	private String codigSucursal;
	private String region;

	public Sucursal(EmpresaTranspor empresaTranspor, String codigoSucursal, String region) {
		EmpresaTranspor = empresaTranspor;
		this.codigSucursal = codigoSucursal;
		this.region = region;

	}
	public Camion agregarCamion(){
		Camion camion = new Camion(this);
		this.camiones.add(camion);
		return camion;
	}

	public List<Camion> getCamiones() {
		return this.camiones;
	}

	public EmpresaTranspor getEmpresaTranspor() {
		return EmpresaTranspor;
	}

	public String getCodigSucursal() {
		return codigSucursal;
	}

	public String getRegion() {
		return region;
	}
}