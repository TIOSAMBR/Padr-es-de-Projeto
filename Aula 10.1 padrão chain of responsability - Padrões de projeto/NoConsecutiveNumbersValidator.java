class NoConsecutiveNumbersValidator extends Validator {
    @Override
    public boolean validate(String login, String password) {
        for (int i = 0; i < password.length() - 2; i++) {
            if (Character.isDigit(password.charAt(i)) && 
                Character.isDigit(password.charAt(i + 1)) && 
                Character.isDigit(password.charAt(i + 2))) {
                System.out.println("A senha não pode conter três números consecutivos.");
                return false;
            }
        }
        if (nextValidator != null) {
            return nextValidator.validate(login, password);
        }
        return true;
    }
}