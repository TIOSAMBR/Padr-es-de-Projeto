class LowercaseValidator extends Validator {
    @Override
    public boolean validate(String login, String password) {
        if (password.chars().anyMatch(Character::isLowerCase)) {
            if (nextValidator != null) {
                return nextValidator.validate(login, password);
            }
            return true;
        }
        System.out.println("A senha deve conter pelo menos um caractere minúsculo.");
        return false;
    }
}