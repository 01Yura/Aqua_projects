package homework13_same_as_12.task1;

import no_bugs.homework13_same_as_12.task1.Entity;
import no_bugs.homework13_same_as_12.task1.EntityManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EntityManagerTest<T> {
    EntityManager entityManager;

    @BeforeEach
    void setUp() {
        entityManager = new EntityManager<>();

        Entity entity1 = new Entity("Yura", 39, true);
        Entity entity2 = new Entity("Anna", 27, false);
        Entity entity3 = new Entity("Noah", 45, true);
        Entity entity4 = new Entity("Sophie", 31, false);
        Entity entity5 = new Entity("Liam", 22, true);
        Entity entity6 = new Entity("Olivia", 36, false);
        Entity entity7 = new Entity("Noah", 29, true);
        Entity entity8 = new Entity("Emma", 41, false);
        Entity entity9 = new Entity("Lucas", 34, true);
        Entity entity10 = new Entity("Mia", 25, false);

        entityManager.addEntity(entity1);
        entityManager.addEntity(entity2);
        entityManager.addEntity(entity3);
        entityManager.addEntity(entity4);
        entityManager.addEntity(entity5);
        entityManager.addEntity(entity6);
        entityManager.addEntity(entity7);
        entityManager.addEntity(entity8);
        entityManager.addEntity(entity9);
        entityManager.addEntity(entity10);
    }

    @Test
    void userCanAddNewEntity() {
        assertTrue(entityManager.addEntity(new Entity("Kia", 25, false)));
    }

    @Test
    void userCanAddNewEntity2() {
        List<Entity> expected = new ArrayList<>(entityManager.getList());
        expected.add(new Entity("Kia", 25, false));

        entityManager.addEntity(new Entity("Kia", 25, false));
        assertEquals(expected, entityManager.getList());
    }

    @Test
    void userCanNotAddNewEntityIfItExists() {
        assertFalse(entityManager.addEntity(new Entity("Yura", 39, true)));
    }

    @Test
    void userCanNotAddNewEntityIfItExists2() {
        List<Entity> expected = new ArrayList<>(entityManager.getList());
        entityManager.addEntity(new Entity("Yura", 39, true));
        assertEquals(expected, entityManager.getList());

    }

    @Test
    void userCanDeleteEntity() {
        assertTrue(entityManager.deleteEntity(new Entity("Mia", 25, false)));
    }

    @Test
    void userCanDeleteEntity2() {
        List<Entity> expected = new ArrayList<>(entityManager.getList());
        expected.remove(new Entity("Mia", 25, false));

        entityManager.deleteEntity(new Entity("Mia", 25, false));
        assertEquals(expected, entityManager.getList());

    }

    @Test
    void filterByAge() {
        List<Entity> expected = List.of(
                new Entity("Yura", 39, true),
                new Entity("Noah", 45, true),
                new Entity("Emma", 41, false)
        );

        assertEquals(expected, entityManager.filterByAge(39, 45));


    }

    @Test
    void filterByStatus() {
        List<Entity> expected = List.of(
                new Entity("Yura", 39, true),
                new Entity("Noah", 45, true),
                new Entity("Liam", 22, true),
                new Entity("Noah", 29, true),
                new Entity("Lucas", 34, true)
        );

        assertEquals(expected, entityManager.filterByStatus(true));
    }

    @Test
    void filterByName() {
        List<Entity> expexted = List.of(
                new Entity("Liam", 22, true)
        );

        assertEquals(expexted, entityManager.filterByName("Liam"));
    }
}