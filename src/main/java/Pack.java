import java.util.*;

public class Pack {

	private Flete Flete;
	Collection<Producto> Productos;
	public Pack(Flete flete){
		this.Flete = flete;
	}

	private void agregarProducto(Producto producto){
		if (Productos.size()<20 && !existProduc(producto)) {
			Productos.add(producto);
		}else if (Productos.size()==20){
			System.out.println("Pack lleno, intente en otro Pack");
		}else {
			System.out.println("El objeto ya existe");
		}

	}
	private void eliminarProducto(Producto producto){
		if (existProduc(producto)){
			Productos.remove(producto);
		}else{
			System.out.println("El producto no existe");
		}
	}
	private boolean existProduc(Producto producto){
		return Productos.contains(producto);
	}

}