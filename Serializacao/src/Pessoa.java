import java.io.Serializable;

public class Pessoa implements Serializable{

	private Nome nome;
	
	public Pessoa(Nome nome) {
		this.nome = nome;

	}
	public Nome getNome() {
		return nome;
	}
}
