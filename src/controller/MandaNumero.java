package controller;

import java.util.Random;

public class MandaNumero implements IObservavel{
	
	int num = 0;
	Verificador ver = new Verificador();
	@Override
	public void notificaMudanca(int num) {
		ver.verifica(num);
	}
	
	public void geraNumero() {
		Random gerador = new Random();
		
		num = gerador.nextInt(1000);
		notificaMudanca(num);
		System.out.println("Numero gerado: "+num);
	}
	
	

}
