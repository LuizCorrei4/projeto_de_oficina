public class Veiculo {
    protected String placa; // classe protected, pois será usada em subclasses
    protected int ano_fabricacao;

    public Veiculo(String placa, int ano_fabricacao) {
        this.placa = placa;
        this.ano_fabricacao = ano_fabricacao;
    }

    public void listarVerificacoes(){
        System.out.println("Placa: " + placa);
        System.out.println("Ano de fabricação: " + ano_fabricacao);
    }

    public void ajustar(){
        System.out.println("O veículo de placa " + placa + " foi ajustado.");
    }

    public void limpar(){
        System.out.println("O veículo de placa " + placa + " foi limpo.");
    }


    // gets e sets
    public int getAno_fabricacao() {
        return ano_fabricacao;
    }

    public void setAno_fabricacao(int ano_fabricacao) {
        this.ano_fabricacao = ano_fabricacao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
