// Sri.java
package Sri;

public class Sri {
    
    public static void main(String[] args) {
        User user = new User("John Doe", 25, "john.doe@example.com");
        
        UserManager userManager = new UserManager();
        System.out.println("Initial User Info:");
        System.out.println("Name: " + userManager.getName(user));
        System.out.println("Age: " + userManager.getAge(user));
        System.out.println("Email: " + userManager.getEmail(user));
        userManager.setName(user, "Alice Smith");
        userManager.setAge(user, 30);
        userManager.setEmail(user, "alice.smith@example.com");
        System.out.println("\nUpdated User Info:");
        System.out.println("Name: " + userManager.getName(user));
        System.out.println("Age: " + userManager.getAge(user));
        System.out.println("Email: " + userManager.getEmail(user));
    }
}
