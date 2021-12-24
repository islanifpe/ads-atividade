package q04;

public class Retangulo implements ObjetoGeometrico {

	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double CalcularArea() {
		return this.getBase()*this.getAltura();
	}

	@Override
	public double CalcularPerimetro() {
		return (this.getBase()*2)+(this.getAltura()*2);
	}
	
	
	
}
