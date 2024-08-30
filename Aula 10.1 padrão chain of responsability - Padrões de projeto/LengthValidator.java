class LengthValidator extends Validator {
    @Override
    public boolean validate(String login, String password) {
        if (password.length() >= 8 && password.length() <= 16) {
            if (nextValidator != null) {
                return nextValidator.validate(login, password);
            }
            return true;
        }
        System.out.println("A senha deve ter entre 8 e 16 caracteres.");
        return false;
    }
}