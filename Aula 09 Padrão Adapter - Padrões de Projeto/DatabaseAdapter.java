public interface DatabaseAdapter {
    void conectar();
    void desconectar();
    void realizarConsulta(String query);
}
