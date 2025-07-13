package ex_0014_OOps_Polymorphism;

public class WebAutomation {

    public static void main(String[] args) {

        browser b= new browser();
        b.Startbrowser("Chrome");
        b.Startbrowser("Edge browser");
    }
}

class browser{
    void Startbrowser(){
        System.out.println("Start a default browser");
    }

    String Startbrowser(String browser){

        System.out.println("Starting browser:"+ browser);
        return browser;
    }
}