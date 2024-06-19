public class Onibus extends Veiculo{
    private int passageiros;
    private boolean articulado;

    public Onibus(String marca,String motor, int passageiros, boolean articulado);
        super(marca, motor);
        this.passageiros = passageiros;
        this.articulado = articulado;

        public int getPassageiros(){
            return this.passageiros;
        }
        public boolean IsArticulado(){
            return this.articulado
        }

        public String imprimir() {
        return "Marca: " + getMarca() + ", Motor: " + getMotor() +
                " Passageiros: " + getPassageiros() +
                " Articulado: " + (isArticulado() ? "sim" : "não");
    }
}
