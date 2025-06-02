package efes.webApp.App;

public class ApplicationLaunching {
    private String filePath;
    public ApplicationLaunching(){
        String os = osDetected();
        if(os.equals("Windows")) {
            this.filePath = "src\\main\\resources\\VereficationDataBase.xlsx";
        }else{
            this.filePath = "src/main/resources/VereficationDataBase.xlsx";
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
