abstract class Validator {
    protected Validator nextValidator;

    public Validator setNext(Validator nextValidator) {
        this.nextValidator = nextValidator;
        return nextValidator;
    }

    public abstract boolean validate(String login, String password);
}