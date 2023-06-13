import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BossTest {

    @org.junit.jupiter.api.Test
    void canIgetPayraise() {
        var bs = Boss.getInstance();
        assertEquals(bs.canIgetPayraise("John"), "No payrise when I am the boss, John! DENIED.");

    }

    @Test
    void testCanIgetPayraise() {
    }
}