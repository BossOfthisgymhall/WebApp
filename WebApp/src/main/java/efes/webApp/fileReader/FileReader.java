package efes.webApp.fileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

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
            try (InputStream fis = new FileInputStream(filePath)) {
                
            } catch (IOException e) {
                System.err.println(e.getMessage());
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
