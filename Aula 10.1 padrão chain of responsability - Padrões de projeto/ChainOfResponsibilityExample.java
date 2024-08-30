public class ChainOfResponsibilityExample {
    public static void main(String[] args) {
        Validator loginExists = new LoginExistsValidator();
        Validator uppercase = new UppercaseValidator();
        Validator lowercase = new LowercaseValidator();
        Validator specialCharacter = new SpecialCharacterValidator();
        Validator number = new NumberValidator();
        Validator noConsecutiveNumbers = new NoConsecutiveNumbersValidator();
        Validator lengthValidator = new LengthValidator();

        // Building the chain
        loginExists.setNext(uppercase)
                   .setNext(lowercase)
                   .setNext(specialCharacter)
                   .setNext(number)
                   .setNext(noConsecutiveNumbers)
                   .setNext(lengthValidator);

        // Test cases
        System.out.println("Test 1: " + loginExists.validate("user1", "Abc12345#"));
        System.out.println("Test 2: " + loginExists.validate("user1", "Abc123"));
        System.out.println("Test 3: " + loginExists.validate("user2", "Password123!"));
    }
}