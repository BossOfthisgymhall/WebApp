package efes.webApp.fileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Component
public class FileReader {

    private final String filePath;

    @Autowired
    public FileReader(@Value("${application.windowsFilePath}") String winPath,
                      @Value("${application.unixFilePath}") String unixPath){
        if(osDetected().equals("Windows")){
            this.filePath = winPath;
        }else{
            this.filePath = unixPath;
        }
    }

    public void parseXlsxFile(){
        try (InputStream fis = new FileInputStream(filePath)){

        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
    private String osDetected(){
        String os = System.getProperty("os.name");
        String[] parts = os.split(" ");
        return parts[0];
    }

    public String getFilePath() {
        return filePath;
    }
}
