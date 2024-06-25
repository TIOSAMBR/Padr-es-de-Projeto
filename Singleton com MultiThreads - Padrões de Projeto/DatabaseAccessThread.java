public class DatabaseAccessThread extends Thread {
    private DatabaseConnectionManager connectionManager;

    public DatabaseAccessThread(DatabaseConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
    }

    @Override
    public void run() {
        // Acesso ao banco de dados usando o gerenciador de conexão
        connectionManager.connect();
        
        // Simulando algum processamento na thread
        try {
            Thread.sleep(1000); // Simula um processamento
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        connectionManager.disconnect();
    }
}
