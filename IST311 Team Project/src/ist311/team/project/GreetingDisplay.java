package ist311.team.project;

/**
 *
 * @author Adrian This class will display a greeting message to the user
 */
public class GreetingDisplay {

    private String userName;

    public GreetingDisplay() {
        this.userName = userName;
    }

    public void setName(String name) {
        this.userName = name;
    }

    public String getName() {
        return userName;
    }

    public void display(String name) {
        System.out.println("==Arithmetic Test==");
        System.out.println("Welcome " + name + " are you ready to begin?");
    }

}
