package efes.webApp.fileReader;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.*;

@Component
public class FileReader {

    private final String filePath;


    public FileReader(){
        if(osDetected().equals("Windows")){
            this.filePath = "src\\main\\resources\\VereficationDataBase.xlsx";
        }else{
            this.filePath = "src/main/resources/VereficationDataBase.xlsx";
        }
    }

    public void parseXlsxFile(){
        File file = new File(filePath);
        if(file.exists()) {
            try (InputStream fis = new FileInputStream(filePath);
                    Workbook workbook = new XSSFWorkbook(fis)) {
                Sheet sheet = workbook.getSheetAt(0);
                Row row = sheet.getRow(0);
                Cell cell = row.getCell(1);
                String value = cell.toString();
                System.out.println("Значение ячейки: " + value);
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    //сделать приватным после фикса
    public String osDetected(){
        String os = System.getProperty("os.name");
        String[] parts = os.split(" ");
        return parts[0];
    }

    public String getFilePath() {
        return filePath;
    }
}
