package controller;

public class CriadorConteudo implements ICriador, IObservavel{
	
	private Inscrito inscrito;
	private String postagem;
	
	
	public CriadorConteudo(Inscrito inscrito) {
		super();
		this.inscrito = inscrito;
	}

	@Override
	public void notificaMudanca(String postagem) {
		inscrito.update(postagem);
		
	}

	@Override
	public void postar() {
		postagem = "postado";
		System.out.println("Conteudo postado");
		notificaMudanca(postagem);
	}

}
