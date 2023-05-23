package recetasv3;

import recetasV2.GachamigaV2;

public class Principal {
    public static void main(String[] args) {
        Principal programa = new Principal();
        programa.start();
    }
    public void start(){
        for(int i=1;i<101;i++){
            if(Gachamiguero.catar(i)=="Gachamiga") {
                System.out.print(Gachamiguero.catar(i) + "\n");
            }else if(Gachamiguero.catar(i)=="Gacha"){
                System.out.print(GachamigaV2.imprimirGachamiga(i) + "\t\t");
            }else if(Gachamiguero.catar(i)=="Miga"){
                System.out.print(Gachamiguero.catar(i) + "\t\t");
            }else{
                System.out.print(Gachamiguero.catar(i) + "\t\t");
            }
        }
    }
}
