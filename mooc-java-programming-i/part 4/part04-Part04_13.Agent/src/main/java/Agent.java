

public class Agent {

    private String firstName;
    private String lastName;
    
    public Agent(String initFirstName, String initLastName) {
        this.firstName = initFirstName;
        this.lastName = initLastName;
    }
    // Method
    public String toString(){
        return "My name is " + this.lastName.concat(", ") + this.firstName.concat(" " + this.lastName); 
    }
    
}
