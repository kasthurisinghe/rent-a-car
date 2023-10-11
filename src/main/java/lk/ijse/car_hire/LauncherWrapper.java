package lk.ijse.car_hire;

import lk.ijse.car_hire.util.SessionFactoryConfiguration;
import org.hibernate.Session;

public class LauncherWrapper {
    public static void main(String[] args) {
        Session s= SessionFactoryConfiguration.getInstance().getSession();
        Launcher.main(args);
    }
}
