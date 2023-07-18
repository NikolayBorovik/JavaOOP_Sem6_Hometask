package homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Persister implements Iterable{
    private final List <User> users;



    public Persister(){
        users = new ArrayList<>();
    }

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user){
        users.add(user);
    }

    public void saveUser (User user){
        System.out.println("User successfully saved: " + user.getName());
    }

    public List <User> deleteUser(User user){
        users.remove(user);
        return users;
    }

    @Override
    public Iterator<User> iterator() {
        Iterator<User> it = new Iterator<User>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < users.size();
            }

            @Override
            public User next() {
                return users.get(index++);
            }

        };
        return it;
    }
}
