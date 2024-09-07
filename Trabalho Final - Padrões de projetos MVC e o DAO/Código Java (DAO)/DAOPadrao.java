public class DAOPadrao {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();

        // Listando todos os usuários
        for (User user : userDAO.getAllUsers()) {
            System.out.println("ID: " + user.getId() + ", Nome: " + user.getNome() + ", Email: " + user.getEmail());
        }

        // Adicionando novo usuário
        User novoUsuario = new User(3, "Carlos Pereira", "carlos@teixeira.com");
        userDAO.addUser(novoUsuario);

        // Atualizando usuário
        novoUsuario.setNome("Carlos Souza");
        userDAO.updateUser(novoUsuario);

        // Removendo usuário
        userDAO.deleteUser(2);

        // Listando usuários após operações
        System.out.println("\nApós operações de adição, atualização e remoção:");
        for (User user : userDAO.getAllUsers()) {
            System.out.println("ID: " + user.getId() + ", Nome: " + user.getNome() + ", Email: " + user.getEmail());
        }
    }
}