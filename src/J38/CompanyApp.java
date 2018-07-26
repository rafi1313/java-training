package J38;

import java.io.IOException;

public class CompanyApp {
    public static void main(String[] args) throws IOException {
        try {
            CompanyController controller = new CompanyController();
            controller.start();
        }catch (IOException e){
            System.out.println("brak pliku");
        }


    }
}
