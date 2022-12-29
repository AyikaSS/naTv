public class WrongLoginException extends RuntimeException {
    private String description;

    public WrongLoginException (){
    }

    public WrongLoginException(String description) {
        super(description);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
