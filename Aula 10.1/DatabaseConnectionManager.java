// Classe para representar o gerenciador de conexão com o banco de dados
class DatabaseConnectionManager {
    private static DatabaseConnectionManager instance;
    
    // Método para obter a única instância do gerenciador de conexão
    public static synchronized DatabaseConnectionManager getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionManager();
        }
        return instance;
    }
    
    // Método para simular a conexão com o banco de dados
    public void connect() {
        System.out.println(Thread.currentThread().getName() + " conectou ao banco de dados.");
    }
    
    // Método para simular a desconexão do banco de dados
    public void disconnect() {
        System.out.println(Thread.currentThread().getName() + " desconectou do banco de dados.");
    }
}