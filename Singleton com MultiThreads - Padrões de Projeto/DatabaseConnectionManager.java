public class DatabaseConnectionManager {
    private static DatabaseConnectionManager instance;
    private static Object lock = new Object();

    private DatabaseConnectionManager() {
        //conexão com o banco de dados
        System.out.println("Conexão com o banco de dados estabelecida.");
    }

    public static DatabaseConnectionManager getInstance() {
        // Uso do padrão Singleton para garantir uma única instância
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new DatabaseConnectionManager();
                }
            }
        }
        return instance;
    }

    //manipular a conexão com o banco de dados
    public void connect() {
        //Simula a conexão com o banco de dados
        System.out.println("Conectado ao banco de dados.");
    }

    public void disconnect() {
        //desconexão do banco de dados
        System.out.println("Desconectado do banco de dados.");
    }
}