import java.util.*;

public class Flete {

	private Camion Camion;
	private Collection<Pack> Packs;

	private void agregarPacks(Pack pack){
		if (Packs.size()<5) {
			this.Packs.add(pack);
		}else{
			System.out.println("embarque lleno");
		}
	}


}