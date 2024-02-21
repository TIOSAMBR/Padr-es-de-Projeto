public class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Robô está trabalhando.");
    }

    @Override
    public void eat() {
        System.out.println("Robô está comendo");
    }
}