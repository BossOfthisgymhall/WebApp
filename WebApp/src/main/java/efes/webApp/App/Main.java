package efes.webApp.App;

import efes.webApp.Config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        ApplicationLaunching applicationLaunching = context.getBean(ApplicationLaunching.class);
        File file = new File(applicationLaunching.getFilePath());
        if(file.exists()){
            System.out.println("Такой путь есть: " + applicationLaunching.getFilePath());
        }else{
            System.out.println("Путь не найдет: " + applicationLaunching.getFilePath());
        }
    }
}