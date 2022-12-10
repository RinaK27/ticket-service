import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void test() {
        Ticket ticket1 = new Ticket("LFD459", "ROV", "KUF", 2000, 2);
        Ticket ticket2 = new Ticket("DKV468", "KRR", "KUF", 4000, 2);
        Ticket ticket3 = new Ticket("АРВ320", "GDZ", "KZN", 6000, 3);

        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);

        Ticket[] actual = manager.searchBy("GDZ", "KZN");
        Ticket[] expected = {ticket3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        Ticket ticket1 = new Ticket("LFD459", "ROV", "KUF", 2000, 2);
        Ticket ticket2 = new Ticket("DKV468", "KRR", "KUF", 4000, 2);
        Ticket ticket3 = new Ticket("АРВ320", "GDZ", "KZN", 6000, 3);

        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);

        Ticket[] actual = manager.searchBy("VKT", "IJK");
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

}
