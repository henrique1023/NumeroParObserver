package controller;

public class Inscrito implements IObersavador{

	@Override
	public void update(String postagem) {
		if(postagem.equals("postado")) {
			System.out.println("Seu criador fez um video novo!!");
		}
	}

}
