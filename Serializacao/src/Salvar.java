import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Salvar {
	private String nomeArquivo;

	public Salvar(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public void gravarObject(List<Pessoa> lista) throws IOException {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream(nomeArquivo));
			out.writeObject(lista);
		} catch (IOException e) {
			throw e;
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}

	public List<Pessoa> leObject() throws IOException, ClassNotFoundException {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream(nomeArquivo));
			return (List<Pessoa>) in.readObject();
		} catch (IOException | ClassNotFoundException e) {
			throw e;
		} finally {
			if (in != null) {
				in.close();
			}
		}
	}
}
