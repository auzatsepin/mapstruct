package mapper.data;

public abstract class Persistable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Persistable{" +
                "id=" + id +
                '}';
    }
}
