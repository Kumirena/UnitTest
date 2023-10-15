package Task1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class task1Test {
    @Test
    public void testMethod(){
        assertEquals(5,2+3);
    }
    @BeforeEach
    public void setup() {
        // Инициализация ресурсов - перед каждым тестом
    }

    @AfterEach
    public void teardown() {
        // Очистка ресурсов - после каждого теста
    }

    @BeforeAll
    public static void globalSetup() {
        // Инициализация - один раз перед всеми тестами
    }

    @AfterAll
    public static void globalTeardown() {
        // Очистка - один раз после всех тестов
    }
    @Test
    @DisplayName("Тест суммирования") // для человекочитаемых имен тестов
    public void testSum() {
        assertEquals(5, 2 + 3);
    }
    //    @Test
//    @Disabled
//    public void testMethod() {
//        // этот тест не будет запущен
//    }

//    @ParameterizedTest
//    @ValueSource(ints = {1,2,3})
//    public void testMethod(int argument){
 //       assertTrue(argument > 0);
 //   }
}
