import java.util.Random;
import java.util.Scanner;

class LoginSystem {
    private static LoginSystem instance;
    private boolean isBotVerificationEnabled;

    private LoginSystem() {
        isBotVerificationEnabled = true;
    }

    //instância única da classe
    public static LoginSystem getInstance() {
        if (instance == null) {
            instance = new LoginSystem();
        }
        return instance;
    }

    //verificar o login
    public boolean login(String username, String password) {
        if (isBotVerificationEnabled) {
            String botCode = generateBotCode();
            System.out.println("Digite o código de verificação para provar que você não é um bot: " + botCode);
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            if (!userInput.equals(botCode)) {
                System.out.println("Código incorreto. Acesso negado.");
                return false;
            }
        }

        // Simulando verificação de usuário e senha
        System.out.println("Login bem-sucedido para o usuário: " + username);
        return true;
    }

    //gerar um código de bot aleatório
    private String generateBotCode() {
        Random random = new Random();
        StringBuilder botCode = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            char c = (char) (random.nextInt(94) + 33); 
            botCode.append(c);
        }
        return botCode.toString();
    }

    // habilitar ou desabilitar a verificação de bot
    public void setBotVerificationEnabled(boolean enabled) {
        this.isBotVerificationEnabled = enabled;
    }
}