package efes.webApp.fileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Component
public class FileReader {

    private String filePath;

    @Autowired
    public FileReader(String filePath){
        this.filePath = filePath;
    }

    public void parseXlsxFile(){
        try (InputStream fis = new FileInputStream(filePath)){

        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
