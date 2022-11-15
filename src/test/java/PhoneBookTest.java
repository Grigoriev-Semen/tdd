import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.grigoriev.PhoneBook;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneBookTest {
    private static PhoneBook phoneBook;

    @BeforeEach
    public void init(){
        phoneBook = new PhoneBook();
    }

    @DisplayName("Проверка успешного добавления контакта.")
    @Test
    public void testAdd() {
        assertTrue(phoneBook.add("Bob", "969-456-55-65"));
    }
}
