import java.io.Serializable;

public class Nome implements Serializable{
	
	private String nome;
	private String sobrenome;
	
	public Nome(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

}
