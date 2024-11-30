package app.user;

import java.util.*;

public class UserRepository {

    User user1 = new User(1, "Petro", "petro@gmail.com");
    User user2 = new User(2, "Pavlo", "pavlo@gmail.com");
    User user3 = new User(3, "Olexiy", "olexiy@gmail.com");
    User user4 = new User(4, "Vasyl", "vassyl@gmail.com");

    List<User> userList = Arrays.asList(user1, user2, user3, user4);
//    by name
    public void findUserById(int id){
        Optional<Integer> optionalId = Optional.of(id);
        for (User user : userList) {
            if (user.getId() == optionalId.get()){
                optionalId.ifPresent(val -> System.out.println("Значення ID = " + id + " присутнє в елементі : " + user.toString()));
            }
        }
    }
//    by name


}
