import java.util.ArrayList;

public class EshopData {
    private static ArrayList<User> users = new ArrayList<User>();
    
    public static void setUsers(User x){
        users.add(x);
    }
    public static ArrayList getUsers(){
        return users;
        
    }
    
}
