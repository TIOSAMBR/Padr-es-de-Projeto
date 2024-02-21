public class Programmer implements Worker {
    @Override
    public void work() {
        System.out.println("O programador está trabalhando.");
    }

    @Override
    public void eat() {
        System.out.println("O programador está comendo.");
    }
}