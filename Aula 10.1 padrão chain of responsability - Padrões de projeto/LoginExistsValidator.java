import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class LoginExistsValidator extends Validator {
    private Set<String> registeredLogins = new HashSet<>(Arrays.asList("user1", "user2", "user3"));

    @Override
    public boolean validate(String login, String password) {
        if (registeredLogins.contains(login)) {
            if (nextValidator != null) {
                return nextValidator.validate(login, password);
            }
            return true;
        }
        System.out.println("Login não está cadastrado.");
        return false;
    }
}