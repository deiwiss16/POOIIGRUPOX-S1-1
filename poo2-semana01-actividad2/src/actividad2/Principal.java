package actividad2;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperficiePlana superficie = new SuperficiePlana();
        
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(0, 3);
        Punto p3 = new Punto(4, 0);
        
        FiguraGeometrica triangulo = new Triangulo("Triángulo", p1, p2, p3);
        
        superficie.agregarFigura(triangulo);
        
        List<Double> areas = superficie.obtenerAreasFiguras();
        for (double area : areas) {
            System.out.println("Área de la figura: " + area);
        }
	}

}
