public class Moto extends Veiculo{
    int cilindradas;
}

    public Moto(String marca, String motor, int cilindradas)(
        super(marca, motor);
        this.cilindradas = cilindradas;
    )

    
    public int getCilindradas(){
        return cilindradas;
    }

    public String imprimir(){
        return "Marca:" + marca() ", Motor:" + motor() + "de"  + cilindradas() + "Cilindradas";
    }