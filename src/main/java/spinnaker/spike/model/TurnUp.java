package spinnaker.spike.model;

public class TurnUp {

    private String firstName;

    private String lastName;

    public TurnUp(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setMessage(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getMessage() {
        return "Turn up the fuck up"+ firstName + " " + lastName;
    }
}
