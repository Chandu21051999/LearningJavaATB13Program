package ex_09_Oops;

public class UserMain {

    public static void main(String[] args) {

        SuperAdmin Sp= new SuperAdmin();

        Sp.Login();
        Sp.AccessAdminPanel();
        Sp.shutdownSystem();
    }
}
