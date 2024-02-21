import java.nio.file.Watchable;

public class Programmer implements Watchable, Eatable {
    @Override
    public void work() {
        System.out.println("O programador está trabalhando.");
    }

    @Override
    public void eat() {
        System.out.println("O programador está comendo.");
    }
}