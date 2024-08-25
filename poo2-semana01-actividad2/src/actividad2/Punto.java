package actividad2;

public class Punto {
	private int coordenada_x;
	private int coordenada_y;
	
	public Punto() {
		
	}
	public Punto(int coordenada_x, int coordenada_y) {
		this.coordenada_x = coordenada_x;
		this.coordenada_y = coordenada_y;
	}
	
	public int getCoordenada_x() {
		return coordenada_x;
	}
	public void setCoordenada_x(int coordenada_x) {
		this.coordenada_x = coordenada_x;
	}
	public int getCoordenada_y() {
		return coordenada_y;
	}
	public void setCoordenada_y(int coordenada_y) {
		this.coordenada_y = coordenada_y;
	}
	
	public double getDistancia() {
		return getDistancia(new Punto(0,0));
	}
	
	public String toString() {
		return "El punto tiene las siguientes coordenadas: " + coordenada_x + ", " + coordenada_y;
	}
	
	public double getDistancia(Punto otroPunto) {
		//formula para calcular la distancia entre dos puntos
		return Math.sqrt(Math.pow((this.coordenada_x + otroPunto.getCoordenada_x()), 2) + Math.pow(this.coordenada_y + otroPunto.getCoordenada_y(), 2));
	}

}
