puclic class Carro extends Veiculo{
    int portaMalas;
}

    public Carro(String marca, String motor, int portaMalas){
        super(marca, motor);
        this.portaMalas = portaMalas;
    }

    public int getPortamalas(){
        return portaMalas;
    }

    public String imprimir(){
        return "Marca:" + this.marca(), ", Motor:" + this.motor(), ", Porta malas:" + this.portaMalas() + "litros";
    }
