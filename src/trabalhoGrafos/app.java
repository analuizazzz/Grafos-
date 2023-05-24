package trabalhoGrafos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

 class CSVReader {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\ana22\\eclipse-workspace\\trabalhoGrafos\\src\\trabalhoGrafos\\br.csv";
        String line;
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                // Processar os dados da linha
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


public class app {

	public static void main(String[] args) {
		String csvFile = "C:\\Users\\ana22\\eclipse-workspace\\trabalhoGrafos\\src\\trabalhoGrafos\\br.csv";
        String line;
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                // Processar os dados da linha
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	

		
	}

}
