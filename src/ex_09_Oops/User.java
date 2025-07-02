package ex_09_Oops;

import org.w3c.dom.ls.LSOutput;

public class User {

    void Login(){
        System.out.println("login user");
    }
}
class AdminUser extends User{
    void AccessAdminPanel(){
        System.out.println("Access the panel");
    }
}

class SuperAdmin extends AdminUser{

    void shutdownSystem(){
        System.out.println("Shut down the system");

    }
}
