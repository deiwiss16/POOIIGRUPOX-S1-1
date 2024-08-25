package actividad2;

import java.util.ArrayList;
import java.util.List;

public class SuperficiePlana {
	private List<FiguraGeometrica> figurasGeometricas;
	
	public SuperficiePlana() {
		this.figurasGeometricas = new ArrayList<>();
	}

	public List<FiguraGeometrica> getFigurasGeometricas() {
		return figurasGeometricas;
	}
	
	public void agregarFigura(FiguraGeometrica figura) {
        figurasGeometricas.add(figura);
    }
    public void eliminarFigura(FiguraGeometrica figura) {
        figurasGeometricas.remove(figura);
    }
    
    public List<Double> obtenerAreasFiguras() {
        List<Double> areas = new ArrayList<>();
        for (FiguraGeometrica figura : figurasGeometricas) {
            areas.add(figura.calcularAreaFigura());
        }
        return areas;
    }
}
