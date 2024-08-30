class NumberValidator extends Validator {
    @Override
    public boolean validate(String login, String password) {
        if (password.chars().anyMatch(Character::isDigit)) {
            if (nextValidator != null) {
                return nextValidator.validate(login, password);
            }
            return true;
        }
        System.out.println("A senha deve conter pelo menos um número.");
        return false;
    }
}