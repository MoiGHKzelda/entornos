package recetasV2;

public class GachamigaV2 {
    static String gachamiga="Gachamiga";
    static String gacha="Gacha";
    static String miga="Miga";


    public static String imprimirGachamiga(int i){
        if(isMult15(i)){
            return gachamiga;
        }else if(isMult3(i)){
            return gacha;
        }else if(isMult5(i)){
            return miga;
        }else{
            return i+"";
        }
    }
    static boolean isMult3(int i){
        return i%3==0;
    }
    static boolean isMult5(int i){
        return i%5==0;
    }
    static boolean isMult15(int i){
        return i%15==0;
    }
}
