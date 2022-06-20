package view;

import controller.CriadorConteudo;
import controller.Inscrito;

public class Principal {
	public static void main(String[] args) {
		Inscrito ins = new Inscrito();
		CriadorConteudo cri = new CriadorConteudo(ins);
		cri.postar();
	}
}
