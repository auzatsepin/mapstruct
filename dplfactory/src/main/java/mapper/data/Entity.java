package mapper.data;

public class Entity extends Persistable {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "message='" + message + '\'' +
                '}';
    }
}
