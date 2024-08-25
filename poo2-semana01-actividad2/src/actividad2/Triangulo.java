package actividad2;

public class Triangulo extends FiguraGeometrica {
	private Punto punto1;
	private Punto punto2;
	private Punto punto3;
	
	public Triangulo() {
		super();
	}
	public Triangulo(String nombre, Punto punto1, Punto punto2, Punto punto3) {
		super(nombre);
		this.punto1 = punto1;
		this.punto2 = punto2;
		this.punto3 = punto3;
	}
	
	public Punto getPunto1() {
		return punto1;
	}
	public void setPunto1(Punto punto1) {
		this.punto1 = punto1;
	}
	public Punto getPunto2() {
		return punto2;
	}
	public void setPunto2(Punto punto2) {
		this.punto2 = punto2;
	}
	public Punto getPunto3() {
		return punto3;
	}
	public void setPunto3(Punto punto3) {
		this.punto3 = punto3;
	}
	
	
	@Override
	public String toString() {
		return "Triangulo: "+ getNombre() +" tiene 3 Puntos: "+ getPunto1().toString() +","+ getPunto2().toString() +"," + getPunto3().toString();
	}
	@Override
	public double calcularAreaFigura() {
		double lado1 = punto1.getDistancia(punto2);
		double lado2 = punto2.getDistancia(punto3);
		double lado3 = punto3.getDistancia(punto1);
		//formula de heron
		double s = (lado1 + lado2 + lado3)/2;  
		return Math.sqrt(s * (s-lado1) * (s-lado2) *(s-lado3));
	}
	@Override
	public boolean esRegular() {
		double lado1 = punto1.getDistancia(punto2);
		double lado2 = punto2.getDistancia(punto3);
		double lado3 = punto3.getDistancia(punto1);
		//Una figura geometrica es regular si todos sus lados son iguales
		return lado1 == lado2 && lado2==lado3;
	}
	
	
}
