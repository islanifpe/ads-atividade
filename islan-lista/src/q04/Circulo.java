package q04;

public class Circulo implements ObjetoGeometrico{
	
	private double raio;
	private double pi;
	
	public Circulo(double raio, double pi) {
		
		this.raio = raio;
		this.pi = pi;
		
	}
	
	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double CalcularArea() {
		return (this.getPi()*(this.getRaio()*this.getRaio()));
	}

	@Override
	public double CalcularPerimetro() {
		return 2*this.getPi()*this.getRaio();
	}

}
