package spinnaker.spike.model;

public class TurnUp {

    private String message;

    public TurnUp(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {

        return "Turn up "+ message;
    }
}
