package Collection_Framework;

import java.util.HashMap;
import java.util.Map;

public class mapDemo {
    static void main() {
        Map<Integer, String> userMap = new HashMap<>();
        userMap.put(1, "Alice");
        userMap.put(2, "Bob");
        userMap.put(3, "Charlie");

        System.out.println("User with id 2: "+userMap.get(2));

        System.out.println("All users:");
        for(Map.Entry<Integer,String> entry : userMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
