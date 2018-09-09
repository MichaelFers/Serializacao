import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(new Nome("Michael", "Fernandes"));
		Pessoa p2 = new Pessoa(new Nome("Maria", "Fernandes"));
		
		List<Pessoa> pessoas = new ArrayList<>();
		List<Pessoa> pessoasRec;
		
		pessoas.add(p1);
		pessoas.add(p2);
		
		Salvar s = new Salvar("pessoas.txt");
		try {
			s.gravarObject(pessoas);
			
			pessoasRec = s.leObject();
			
			for(Pessoa p: pessoasRec) {
				JOptionPane.showMessageDialog(null, p);
			}
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
