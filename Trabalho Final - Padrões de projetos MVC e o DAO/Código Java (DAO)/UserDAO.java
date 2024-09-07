import java.util.ArrayList;
import java.util.List;

class UserDAO {
    private List<User> usuarios;

    public UserDAO() {
        usuarios = new ArrayList<>();
        // Adicionando alguns usuários iniciais
        usuarios.add(new User(1, "Samuel Costa", "samuel@costa.com"));
        usuarios.add(new User(2, "Ana Silva", "ana@castelo.com"));
    }

    public List<User> getAllUsers() {
        return usuarios;
    }

    public User getUserById(int id) {
        return usuarios.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
    }

    public void addUser(User user) {
        usuarios.add(user);
    }

    public void updateUser(User user) {
        User u = getUserById(user.getId());
        if (u != null) {
            u.setNome(user.getNome());
            u.setEmail(user.getEmail());
        }
    }

    public void deleteUser(int id) {
        usuarios.removeIf(u -> u.getId() == id);
    }
}
