package efes.webApp.App;

import efes.webApp.fileReader.FileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ApplicationLaunching {
    FileReader fileReader;
    @Autowired
    public ApplicationLaunching(FileReader fileReader){
        this.fileReader = fileReader;

    }
    public boolean launchApp(){
        System.out.println(fileReader.getFilePath());
        return false;
    }
}
