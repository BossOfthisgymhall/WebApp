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
    @Value("${application.windowsFilePath}")
    private final String winPath = "";
    @Value("${application.unixFilePath}")
    private final String unixPath = "";

    public FileReader(){
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
