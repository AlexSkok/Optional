package app.user;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserRepository {

    User user1 = new User(1, "Petro", "petro@gmail.com");
    User user2 = new User(2, "Pavlo", "pavlo@gmail.com");
    User user3 = new User(3, "Olexiy", "olexiy@gmail.com");
    User user4 = new User(4, "Vasyl", "vasyl@gmail.com");

    List<User> userList = Arrays.asList(user1, user2, user3, user4);
//    by id
   public void findUserById(int id){
       Optional<Integer> optionalId = Optional.of(id);
       Stream<User> userStream = userList.stream()
               .filter(user -> user.getId() == optionalId.get());
       System.out.println("Optional за ID: " + id + " " + userStream.findAny());
   }
//    by email
    public void findUserByEmail(String email){
        Optional<String> optionalEmail = Optional.of(email);
        Stream<User> userStream = userList.stream()
                .filter(user -> user.getEmail().equals(optionalEmail.get()));
        System.out.println("Optional за email: " + email + " " + userStream.findAny());
    }
//    all users
    public void findAllUsers(){
       Optional<List<User>> listOptional = Optional.ofNullable(userList);
        System.out.println("All users: " + listOptional);
    }

}
