// Classe que representa threads que buscam acessar o banco de dados
class DatabaseAccessThread extends Thread {
    private DatabaseConnectionManager connectionManager;
    
    public DatabaseAccessThread(DatabaseConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
    }
    
    @Override
    public void run() {
        // Solicitar a conexão com o banco de dados através do gerenciador de conexão
        connectionManager.connect();
        
        // Simular alguma operação no banco de dados
        try {
            Thread.sleep(1000); // Simula uma operação no banco de dados
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Desconectar do banco de dados
        connectionManager.disconnect();
    }
}