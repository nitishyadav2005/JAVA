package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iteratingDemo {
    static void main(String[] args) {
        List<String> users = new ArrayList();
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");
        users.add("John");

        // for each
        System.out.println("Using for each");
        for (String user : users){
            System.out.println(user);
        }

        // using for loop
        System.out.println("Using for loop");
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }

        // using iterator
        System.out.println("Using iterator");
        Iterator<String> it = users.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
