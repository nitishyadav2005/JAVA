package Collection_Framework;

import java.util.HashSet;
import java.util.Set;

public class setDemo {
    static void main() {
        Set <String> roles = new HashSet<>();
        roles.add("ADMIN");
        roles.add("USER");
        roles.add("MANAGER");
        roles.add("USER");

        for(String role : roles){
            System.out.println(role);
        }

    }
}
