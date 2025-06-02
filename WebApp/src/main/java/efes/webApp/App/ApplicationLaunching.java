package efes.webApp.App;

import efes.webApp.fileReader.FileReader;

public class ApplicationLaunching {
    private String filePath;
    FileReader fileReader;
    public ApplicationLaunching(){
        String os = osDetected();
        if(os.equals("Windows")) {
            this.filePath = "src\\main\\resources\\VereficationDataBase.xlsx";
        }else{
            this.filePath = "src/main/resources/VereficationDataBase.xlsx";
        }
        fileReader = new FileReader(this.filePath);
    }
    /*
    Класс полностью переписать под спринг
    */

    public boolean launchApp(){
        fileReader.parseXlsxFile();
        return false;
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
