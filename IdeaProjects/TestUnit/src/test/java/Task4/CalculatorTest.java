package Task4;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.*;


    class CalculatorTest {
        Calculator calculator;

        @BeforeEach
        void setUp() {
            calculator = new Calculator();
        }

        @BeforeAll
        public static void initAll() {
            System.out.printf("Hiii!!!!!");
        }

        @AfterAll
        public static void tearDownAll() {
            System.out.printf("END!");
        }

        @AfterEach
        public void tearDown() {
            calculator = null; // Очистка после каждого теста
        }

        @Test
        @DisplayName("Проверка равенства значений")
        void testAssertEquals() {
            assertEquals(4, calculator.add(2, 2));
        }

        @Test
        @DisplayName("Проверка неравенства значений")
        void testAssertNotEquals() {
            assertNotEquals(5, calculator.add(2, 2));
        }

        @Test
        @DisplayName("Проверка истинного условия")
        void testAssertTrue() {
            assertTrue(calculator.add(2, 2) == 4);
        }

        @Test
        @DisplayName("Проверка ложного условия")
        void testAssertFalse() {
            assertFalse(calculator.add(2, 2) == 5);
        }

        @Test
        @DisplayName("Проверка наличия объекта")
        void testAssertNotNull() {
            assertNotNull(calculator);
        }

        @Test
        @DisplayName("Проверка отсутствия объекта")
        void testAssertNull() {
            calculator = null;
            assertNull(calculator);
        }

        @Test
        @DisplayName("Проверка равенства массивов")
        void testAssertArrayEquals() {
            int[] expected = {1, 2, 3};
            int[] actual = {1, 2, 3};
            assertArrayEquals(expected, actual);
        }

        @Test
        @DisplayName("Проверка на генерацию исключений")
        void testAssertThrows() {
            assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
        }

        // Дополнительные ассерты
        @Test
        @DisplayName("Проверка с сообщением")
        void testAssertWithMessage() {
            assertEquals(4, calculator.add(2, 2), "2 + 2 должно быть равно 4");
        }

        @Test
        @DisplayName("Проверка с использованием лямбда-выражения для сообщения")
        void testAssertWithLambdaMessage() {
            assertEquals(4, calculator.add(2, 2), () -> "2 + 2 должно быть равно 4");
        }
//дз к Семинару 1

        @Test
        @DisplayName("Проверка метода calculateDiscount на корректность расчета скидки в процентах")
        void testCalculateDiscount() {
            double amount = 100.0;
            double discountPercent = 10.0;
            double expected = 90.0;
            assertThat(calculator.calculateDiscount(amount, discountPercent)).isEqualTo(expected);
        }

        @Test
        @DisplayName("Проверка метода calculateDiscount на корректность расчета без скидки")
        void testCalculateDiscountWithZeroDiscount() {
            double amount = 100.0;
            double discountPercent = 0.0;
            double expected = 100.0;
            assertThat(calculator.calculateDiscount(amount, discountPercent)).isEqualTo(expected);
        }

        @Test
        @DisplayName("Проверка метода calculateDiscount на корректность расчета максимальной скидки")
        void testCalculateDiscountWithMaximumDiscount() {
            double amount = 100.0;
            double discountPercent = 100.0;
            double expected = 0.0;
            assertThat(calculator.calculateDiscount(amount, discountPercent)).isEqualTo(expected);
        }

        @Test
        @DisplayName("Проверка метода calculateDiscount на обработку некорректного ввода (процент скидки больше 100%)")
        void testCalculateDiscountWithDiscountGreaterThan100() {
            double amount = 100.0;
            double discountPercent = 110.0;
            assertThatThrownBy(() -> calculator.calculateDiscount(amount, discountPercent))
                    .isInstanceOf(ArithmeticException.class).hasMessage("Invalid input");
        }

    }

