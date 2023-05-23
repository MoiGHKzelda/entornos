package recetasv3;

public class Gachamiguero {
    public static String catar(int i){
        if((isMult3(i))&&(isMult5(i))){
            return "Gachamiga";
        }else if(isMult3(i)){
            return "Gacha";
        }else if(isMult5(i)){
            return "Miga";
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
}

