class UppercaseValidator extends Validator {
    @Override
    public boolean validate(String login, String password) {
        if (password.chars().anyMatch(Character::isUpperCase)) {
            if (nextValidator != null) {
                return nextValidator.validate(login, password);
            }
            return true;
        }
        System.out.println("A senha deve conter pelo menos um caractere maiúsculo.");
        return false;
    }
}