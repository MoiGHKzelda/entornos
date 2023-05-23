import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import recetasV2.GachamigaV2;

public class Test2DepuradosV2 {
    @Test
    public void TestFor1() {
        Assertions.assertEquals("1", GachamigaV2.imprimirGachamiga(1));
    }
    @Test
    public void TestFor3(){
        Assertions.assertEquals("Gacha", GachamigaV2.imprimirGachamiga(3));
    }
    @Test
    public void TestFor5(){
        Assertions.assertEquals("Miga", GachamigaV2.imprimirGachamiga(5));
    }
    @Test
    public void TestFor15(){
        Assertions.assertEquals("Gachamiga", GachamigaV2.imprimirGachamiga(15));
    }
}