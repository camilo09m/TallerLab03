public class Producto {

	Pack Pack;
	private String codigProd;
	private String tipoProducto;

	public String getCodigProd() {
		return codigProd;
	}

	public void setCodigProd(String codigProd) {
		this.codigProd = codigProd;
	}

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public Producto(String codigProd, String tipoProducto){
		this.codigProd = codigProd;
		this.tipoProducto = tipoProducto;

	}
}