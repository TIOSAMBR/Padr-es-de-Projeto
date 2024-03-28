import java.util.HashMap;
import java.util.Map;

// Fábrica de violões
class ViolaoFactory {
    private Map<String, ViolaoPrototype> prototipos = new HashMap<>();

    public ViolaoFactory() {
        // Inicializa os protótipos disponíveis na fábrica
        prototipos.put("Clássico", new ViolaoClasico());
        prototipos.put("Folk", new ViolaoFolk());
        prototipos.put("Flet", new ViolaoFlet());
        prototipos.put("Jumbo", new ViolaoJumbo());
        prototipos.put("7 Cordas", new Violao7Cordas());
        prototipos.put("12 Cordas", new Violao12Cordas());
        prototipos.put("Zero", new ViolaoZero());
        prototipos.put("Duplo Zero", new ViolaoDuploZero());
        prototipos.put("Triplo Zero", new ViolaoTriploZero());
        // Adicione outros protótipos conforme necessário
    }

    // Método para criar um violão baseado em um protótipo
    public ViolaoPrototype criarViolao(String tipo) {
        try {
            return prototipos.get(tipo).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}