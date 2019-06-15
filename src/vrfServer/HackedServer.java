package vrfServer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HackedServer {
	public static void main(String[] args) {
		String senha = "5365677265646f";
		StringBuilder saida = new StringBuilder("");

		for (int i = 0; i < senha.length(); i += 2) {
			String str = senha.substring(i, i + 2);
			saida.append((char) Integer.parseInt(str, 16));
		}
		senha = saida.toString();
		try {
			FileWriter fw = new FileWriter("password.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(senha);
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
