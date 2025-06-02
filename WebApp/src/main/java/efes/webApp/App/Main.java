package efes.webApp.App;

import efes.webApp.Config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        ApplicationLaunching applicationLaunching = context.getBean(ApplicationLaunching.class);
        applicationLaunching.launchApp();
    }
}