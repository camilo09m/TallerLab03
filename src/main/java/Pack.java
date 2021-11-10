import java.util.*;

public class Pack {

	private Flete Flete;
	Collection<Producto> Productos;
	public Pack(){
		this.Flete = new Flete();
	}

	private void agregarProducto(String codigProd, String tipoProducto){
		if (Productos.size()<20 && !existProduc(codigProd,tipoProducto)) {
			Productos.add(new Producto(codigProd, tipoProducto));
		}else if (Productos.size()==20){
			System.out.println("Pack lleno, intente en otro Pack");
		}else {
			System.out.println("El objeto ya existe");
		}

	}
	private void eliminarProducto(String codigProd, String tipoProducto){
		if (existProduc(codigProd,tipoProducto)){
			Productos.remove(new Producto(codigProd,tipoProducto));
		}else{
			System.out.println("El producto no existe");
		}
	}
	private boolean existProduc(String codigProd, String tipoProducto){
		return Productos.contains(new Producto(codigProd,tipoProducto));
	}

}