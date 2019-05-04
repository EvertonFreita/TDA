import java.io.BufferedReader;
import java.io.FileReader;

import com.google.gson.Gson;

public class LerJson2 {

	public static void main(String[] args) {
		Gson gson = new Gson();
		try {

			BufferedReader arquivoBebo = new BufferedReader(new FileReader("C:/DiretorioJson/Cerveja.json"));

			Cerveja cerveja = (Cerveja) gson.fromJson(arquivoBebo, Cerveja.class);
			System.out.println(cerveja);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
