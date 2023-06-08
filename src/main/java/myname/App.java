package myname;

import com.google.gson.Gson;

public class App {
    public static void main( String[] args ) {
        User myName = new User();
        myName.setName("Oleg");
        myName.setLastName("Odin");

        System.out.println(new Gson().toJson(myName));
    }
}
