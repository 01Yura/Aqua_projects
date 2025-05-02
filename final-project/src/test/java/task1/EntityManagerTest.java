package task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EntityManagerTest {
    EntityManager entityManager;
    Entity entity1;
    Entity entity2;
    Entity entity3;
    Entity entity4;


    @BeforeEach
    void setUp() {
        entityManager = new EntityManager<>();

        entity1 = new Entity("Yura", 39, true);
        entity2 = new Entity("Max", 25, false);
        entity3 = new Entity("Sveta", 30, true);
        entity4 = new Entity("Kolya", 20, false);

        entityManager.getList().add(entity1);
        entityManager.getList().add(entity2);
        entityManager.getList().add(entity3);
        entityManager.getList().add(entity4);
    }

    @Test
    void addEntity() {
        assertTrue(entityManager.addEntity(new Entity("Vova", 22, true)));
    }

    @Test
    void deleteEntityTrue() {
        assertTrue(entityManager.deleteEntity(entity1));
    }

    @Test
    void deleteEntityFalse() {
        assertFalse(entityManager.deleteEntity(new Entity("Vova", 22, true)));
    }

    @Test
    void returnCopyOfList() {
        List<Entity> expected = new ArrayList<>(entityManager.getList());
        List<Entity> actual = entityManager.returnCopyOfList();
        assertEquals(expected, actual);
    }

    @Test
    void filterByAge() {
        int min = 21;
        int max = 35;
        List<Entity> expected = List.of(new Entity("Max", 25, false), new Entity("Sveta", 30, true));
        List<Entity> actual = entityManager.filterByAge(min, max);
        assertEquals(expected, actual);
    }

    @Test
    void filterByName() {
        String name = "Sveta";
        List<Entity> expected = List.of(new Entity("Sveta", 30, true));
        List<Entity> actual = entityManager.filterByName(name);
        assertEquals(expected, actual);
    }

    @Test
    void filterByStatus() {
        boolean status = false;
        List<Entity> expected = List.of(new Entity("Max", 25, false), new Entity("Kolya", 20, false));
        List<Entity> actual = entityManager.filterByStatus(status);
        assertEquals(expected, actual);
    }
}