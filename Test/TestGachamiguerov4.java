import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import recetasv3.Gachamiguero;

public class TestGachamiguerov4 {
    @Test
    public void TestFor1() {
        Assertions.assertEquals("1", Gachamiguero.catar(1));
    }
    @Test
    public void TestFor3(){
        Assertions.assertEquals("Gacha", Gachamiguero.catar(3));
    }
    @Test
    public void TestFor5(){
        Assertions.assertEquals("Miga", Gachamiguero.catar(5));
    }
    @Test
    public void TestFor15(){
        Assertions.assertEquals("Gachamiga", Gachamiguero.catar(15));
    }
}