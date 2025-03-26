public class Motocicleta extends Veiculo {

    private String tipoVeiculo;
    private String modelo;

    public Motocicleta(String placa, int ano_fabricacao, String modelo, String tipoVeiculo) {
        super(placa, ano_fabricacao);
        this.modelo = modelo;
        this.tipoVeiculo = tipoVeiculo;
    }

    @Override
    public void listarVerificacoes(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Ano de fabricação: " + ano_fabricacao);
        System.out.println("Tipo do veículo: " + tipoVeiculo);
    }

    @Override
    public void ajustar(){
        System.out.println("A motocicleta de placa " + placa + ", modelo" + modelo + " foi ajustada.");
    }
    @Override
    public void limpar(){
        System.out.println("A motocicleta de placa " + placa + ", modelo" + modelo + " foi limpa.");
    }

    // gets e sets
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
}
