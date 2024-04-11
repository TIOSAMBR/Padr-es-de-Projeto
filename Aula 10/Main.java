public class Main {
    public static void main(String[] args) {
        LoginSystem loginSystem = LoginSystem.getInstance();

        //cenário em que a verificação de bot está desabilitada
        loginSystem.setBotVerificationEnabled(false);

        //login sem verificação de bot
        loginSystem.login("Samuel", "123");

        //cenário em que a verificação de bot está habilitada
        loginSystem.setBotVerificationEnabled(true);

        //login com verificação de bot
        loginSystem.login("Samuel", "123");
    }
}