package efes.webApp.App;

import efes.webApp.fileReader.FileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class ApplicationLaunching {
    private FileReader fileReader;
    @Autowired
    public ApplicationLaunching(){


    }
    public boolean launchApp(){
        System.out.println(fileReader.getFilePath());
        return false;
    }
}
