package efes.webApp.App;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        ApplicationLaunching applicationLaunching = new ApplicationLaunching();
        File file = new File(applicationLaunching.getFilePath());
        if(file.exists()){
            System.out.println("Такой путь есть: " + applicationLaunching.getFilePath());
        }else{
            System.out.println("Путь не найдет: " + applicationLaunching.getFilePath());
        }
    }
}