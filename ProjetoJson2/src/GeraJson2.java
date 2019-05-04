import java.io.FileWriter;
import com.google.gson.Gson;

public class GeraJson2 {

	public static void main(String[] args) {

		Cerveja skol = new Cerveja();
		skol.setAno("2019");
		skol.setMalte("Puro malte");
		skol.setMarca("Skol");
		skol.setNome("Skol Ice Blue Red");

		Gson g = new Gson();
		String json = g.toJson(skol);
		System.out.println(json);

		try {
			FileWriter fw = new FileWriter("C:/DiretorioJson/Cerveja.json");

			fw.write(json);
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println(json);
	}

}
