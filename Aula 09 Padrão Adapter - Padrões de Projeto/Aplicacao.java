public class Aplicacao {
    public static void main(String[] args) {
        // Escolha do usuário !!
        String perfilUsuario = "Ultimate"; // Exemplo

        DatabaseAdapter adaptador;

        // Determinar qual adaptador utilizar com base no perfil do usuário
        switch (perfilUsuario) {
            case "Gratuito":
                adaptador = new ParadoxAdapter();
                break;
            case "Básico":
                adaptador = new FirebirdAdapter();
                break;
            case "Ultimate":
                adaptador = new MySQLAdapter();
                break;
            default:
                throw new IllegalArgumentException("Perfil de usuário não reconhecido.");
        }

        // Utilização do adaptador
        adaptador.conectar();
        adaptador.realizarConsulta("SELECT * FROM tabela");
        adaptador.desconectar();
    }
}