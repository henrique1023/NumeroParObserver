package view;

import controller.MandaNumero;

public class Principal {
	public static void main(String[] args) {
		MandaNumero ma = new MandaNumero();
		for (int i = 0; i < 10; i++) {
			ma.geraNumero();
		}
	}
}
