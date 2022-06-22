package controller;

public class Verificador implements IObersavador{

	@Override
	public void verifica(int num) {
		if(num % 2 == 0) {
			System.out.println("Numero Par:" + num);
		}else {
			System.out.println("Numero Impar: " + num);
		}
		
	}

}
