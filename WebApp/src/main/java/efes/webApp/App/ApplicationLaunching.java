package efes.webApp.App;

public class ApplicationLaunching {
    private String filePath;
    public ApplicationLaunching(){
        String os = osDetected();
        if(os.equals("Windows")) {
            this.filePath = "..\\..\\..\\..\\resources\\VereficationDataBase.xlsx";
        }else{
            this.filePath = "resources/VereficationDataBase.xlsx";
        }
    }
    public boolean launchApp(){
        return false;
    }
    public String osDetected(){
        String os = System.getProperty("os.name");
        String[] parts = os.split(" ");
        return parts[0];
    }

    public String getFilePath() {
        return filePath;
    }
}
