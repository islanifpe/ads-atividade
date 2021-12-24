package q04;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner imput = new Scanner(System.in);
		Retangulo r = null;
		Circulo c = null;
		ArrayList<ObjetoGeometrico> Lista = new ArrayList<ObjetoGeometrico>();
		while(true) {
			
			System.out.println("1. Adicionar um Círculo;\r\n" + 
					"2. Adicionar um Retângulo;\r\n" + 
					"3. Calcular média das áreas;\r\n" + 
					"4. Calcular média dos perímetros;\r\n" + 
					"0. Sair");
			
			int op = imput.nextInt();
			
			switch (op) {
			
			case 1:
				
				System.out.println("Informe o valor de p (Pi):");
				double pi  = imput.nextDouble();
				System.out.println("Informe o valor do raio:");
				double raio = imput.nextDouble();
				c = new Circulo(raio, pi);
				Lista.add(c);
				
				break;
			case 2:
				
				System.out.println("Informe o valor da base:");
				double base  = imput.nextDouble();
				System.out.println("Informe o valor da altura:");
				double altura = imput.nextDouble();
				r = new Retangulo(base, altura);
				Lista.add(r);
				
				break;
			case 3:
				
				System.out.println("Media: "+CalcularMedia(Lista));
				
				break;
			case 4:
				
				System.out.println("Media dos perimetros: "+CalcularPerimetro(Lista));
				
				break;
			case 0:
				
				System.out.println("Saiu.");
				System.exit(0);
				
				break;
			}
		}
		

	}


            public static double CalcularMedia(ArrayList<ObjetoGeometrico> lista) {
            	double media=0;
            	for(int i =0; i<lista.size(); i++) {
					   media+=lista.get(i).CalcularArea();
            	}
            	return media/2;
            }

            public static double CalcularPerimetro(ArrayList<ObjetoGeometrico> lista) {
            	double media=0;
            	for(int i =0; i<lista.size(); i++) {
					   media+=lista.get(i).CalcularPerimetro();
				}
            	return media/2;
            }
}
