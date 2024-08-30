import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class SpecialCharacterValidator extends Validator {
    private static final Set<Character> SPECIAL_CHARACTERS = new HashSet<>(Arrays.asList('@', '#', '$', '%', '&', '*'));

    @Override
    public boolean validate(String login, String password) {
        if (password.chars().anyMatch(c -> SPECIAL_CHARACTERS.contains((char) c))) {
            if (nextValidator != null) {
                return nextValidator.validate(login, password);
            }
            return true;
        }
        System.out.println("A senha deve conter pelo menos um caractere especial (@, #, $, %, &, *).");
        return false;
    }
}