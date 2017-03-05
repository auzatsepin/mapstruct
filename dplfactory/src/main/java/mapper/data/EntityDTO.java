package mapper.data;

public class EntityDTO {

    private Long id;
    private String message;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "EntityDTO{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
