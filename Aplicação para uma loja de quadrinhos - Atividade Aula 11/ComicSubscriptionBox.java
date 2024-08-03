import java.util.*;

public class ComicSubscriptionBox {

    // Definindo os níveis de assinatura e os itens disponíveis
    private static final Map<String, Integer> LEVELS = Map.of(
            "Bronze", 3,
            "Prata", 5,
            "Ouro", 7,
            "Platina", 10
    );

    private static final Map<String, Integer> ITEMS = Map.of(
            "quadrinhos", 15,
            "chaveiros", 5,
            "bustos", 10,
            "adesivos", 1,
            "posters", 25,
            "camisetas", 25,
            "canetas", 3,
            "miniaturas", 20
    );
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Escolha o nível da assinatura: Bronze, Prata, Ouro, Platina");
        String level = scanner.nextLine().trim();
    
        if (!LEVELS.containsKey(level)) {
            System.out.println("Nível de assinatura inválido.");
            return;
        }
    
        List<String> box = generateBox(level);
        displayBox(box);
    }
    
    private static List<String> generateBox(String level) {
        int itemCount = LEVELS.get(level);
        List<String> itemsList = new ArrayList<>(ITEMS.keySet());
        List<String> box = new ArrayList<>();
    
        Random random = new Random();
        for (int i = 0; i < itemCount; i++) {
            String item = itemsList.get(random.nextInt(itemsList.size()));
            box.add(item);
        }
    
        return box;
    }
    
    private static void displayBox(List<String> box) {
        Map<String, Integer> itemCountMap = new HashMap<>();
        int totalValue = 0;
    
        for (String item : box) {
            itemCountMap.put(item, itemCountMap.getOrDefault(item, 0) + 1);
            totalValue += ITEMS.get(item);
        }
    
        System.out.println("Itens na caixa de assinatura:");
        for (Map.Entry<String, Integer> entry : itemCountMap.entrySet()) {
            System.out.println(entry.getValue() + " x " + entry.getKey());
        }
    
        System.out.println("Valor total da caixa: R$ " + totalValue);
    }
}
