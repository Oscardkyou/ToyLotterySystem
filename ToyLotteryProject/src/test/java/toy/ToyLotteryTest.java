import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ToyLotteryTest {
    private ToyLottery lottery;

    @Before
    public void setUp() {
        lottery = new ToyLottery();
        // Инициализация с начальными данными для тестов
        lottery.put("1 конструктор 20");
        lottery.put("2 робот 20");
        lottery.put("3 кукла 60");
    }

    @Test
    public void testToyFrequency() {
        int constructorCount = 0;
        int robotCount = 0;
        int dollCount = 0;
        int iterations = 10000;

        for (int i = 0; i < iterations; i++) {
            int toyId = lottery.get();
            switch (toyId) {
                case 1: constructorCount++; break;
                case 2: robotCount++; break;
                case 3: dollCount++; break;
            }
        }

        // Проверка пропорций выпадения с некоторым допустимым отклонением
        Assert.assertTrue(Math.abs(constructorCount - 2000) < 500);
        Assert.assertTrue(Math.abs(robotCount - 2000) < 500);
        Assert.assertTrue(Math.abs(dollCount - 6000) < 500);
    }
}
