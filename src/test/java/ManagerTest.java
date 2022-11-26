import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    @Test
    public void test() {
        Ticket ticket2 = new Ticket("DKV468", "KRR", "KUF", 4000, 2);
        Ticket ticket3 = new Ticket("АРВ320", "GDZ", "KZN", 6000, 3);
        Ticket ticket1 = new Ticket("LFD459", "ROV", "KUF", 2000, 2);

        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);

        Ticket[] actual = manager.findAll();
        Ticket[] expected = {ticket1, ticket2, ticket3};

        Assertions.assertArrayEquals(expected, actual);
    }
}
