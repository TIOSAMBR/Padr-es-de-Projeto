public class Main {
    public static void main(String[] args) {
        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getInstance();
        
        //Criando pelo menos 5 threads para acessar o banco de dados
        for (int i = 0; i < 5; i++) {
            DatabaseAccessThread thread = new DatabaseAccessThread(connectionManager);
            thread.start();
        }
    }
}
