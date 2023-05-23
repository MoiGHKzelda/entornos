package recetasV1;

import recetasV2.GachamigaV2;

public class GachamigaV1 {
    public static void main(String[] args) {
        GachamigaV1 programa = new GachamigaV1();
        programa.start();
    }

    private void start() {
        for(int i=1;i<101;i++){
            if(i%5==0 && i%3==0){
                System.out.print("Gachamiga \n");
            }else if(i%3==0){
                System.out.print("Gacha\t\t");
            }else if(i%5==0){
                System.out.print("Miga\t\t");
            }else{
                System.out.print(i+"\t\t");
            }
        }
    }
}
