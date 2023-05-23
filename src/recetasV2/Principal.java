package recetasV2;

public class Principal {
    public static void main(String[] args) {
        Principal programa = new Principal();
        programa.start();
    }
    public void start(){
        for(int i=1;i<101;i++){
            if(GachamigaV2.imprimirGachamiga(i)=="Gachamiga") {
                System.out.print(GachamigaV2.imprimirGachamiga(i) + "\n");
            }else if(GachamigaV2.imprimirGachamiga(i)=="Gacha"){
                System.out.print(GachamigaV2.imprimirGachamiga(i) + "\t\t");
            }else if(GachamigaV2.imprimirGachamiga(i)=="Miga"){
                System.out.print(GachamigaV2.imprimirGachamiga(i) + "\t\t");
            }else{
                System.out.print(GachamigaV2.imprimirGachamiga(i) + "\t\t");
            }
        }
    }
}
