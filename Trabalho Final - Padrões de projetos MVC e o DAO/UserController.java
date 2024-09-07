class UserController {
    private UserModel model;
    private UserView view;

    public UserController(UserModel model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void atualizaNome(String nome) {
        model.setNome(nome);
    }

    public void atualizaEmail(String email) {
        model.setEmail(email);
    }

    public String getNome() {
        return model.getNome();
    }

    public String getEmail() {
        return model.getEmail();
    }

    public void atualizarView() {
        view.exibirDetalhesUsuario(model.getNome(), model.getEmail());
    }
}