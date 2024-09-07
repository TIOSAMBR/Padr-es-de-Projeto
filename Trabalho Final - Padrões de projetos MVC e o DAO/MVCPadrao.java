public class MVCPadrao {
    public static void main(String[] args) {
        // Criando o modelo, visão e controlador
        UserModel model = new UserModel();
        UserView view = new UserView();
        UserController controller = new UserController(model, view);

        // Atualizando o modelo através do controlador
        controller.atualizaNome("Samuel Costa");
        controller.atualizaEmail("samuel@costa.com");

        // Atualizando a visão para refletir os dados do modelo
        controller.atualizarView();
    }
}