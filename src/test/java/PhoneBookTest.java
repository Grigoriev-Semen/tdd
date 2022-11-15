import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.grigoriev.PhoneBook;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    private static PhoneBook phoneBook;

    @BeforeEach
    public void init() {
        phoneBook = new PhoneBook();
    }

    @DisplayName("Проверка успешного добавления контакта.")
    @Test
    public void testAdd() {
        assertEquals(phoneBook.add("Bob", "969-456-55-65"), 1);
    }

    @DisplayName("Найти имя по номеру.")
    @Test
    public void testFindByNumber() {
        phoneBook.add("Bob", "969-456-55-65");
        assertEquals(phoneBook.findByNumber("969-456-55-65"), "Bob");
    }

    @DisplayName("Найти номер по имени.")
    @Test
    public void testFindByName() {
        phoneBook.add("Bob", "969-456-55-65");
        assertEquals(phoneBook.findByName("Bob"), "969-456-55-65");
    }

    @DisplayName("Вывести все имена в алфавитном порядке.")
    @Test
    public void printAllNames() {
        phoneBook.add("Bob", "969-456-55-65");
        phoneBook.add("Anna", "969-456-55-30");
        phoneBook.add("Fedor", "969-456-55-20");
        String actual = "Anna\nBob\nFedor\n";
        assertEquals(phoneBook.printAllNames(), actual);
    }
}
