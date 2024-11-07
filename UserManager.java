package Sri;

public class UserManager {
    
    public void setName(User user, String name) {
        user.setName(name);  
    }
    public String getName(User user) {
        return user.getName();  
    }

    public void setAge(User user, int age) {
        user.setAge(age); 
    }
    public int getAge(User user) {
        return user.getAge();  
    }

    public void setEmail(User user, String email) {
        user.setEmail(email);  
    }

    public String getEmail(User user) {
        return user.getEmail();  
    }
}
