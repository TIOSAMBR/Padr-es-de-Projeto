import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // Criar uma única instância do gerenciador de conexão com o banco de dados
        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getInstance();
        
        // Criar e iniciar múltiplas threads de acesso ao banco de dados
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            executorService.execute(new DatabaseAccessThread(connectionManager));
        }
        
        // Encerrar o pool de threads após a conclusão das tarefas
        executorService.shutdown();
    }
}