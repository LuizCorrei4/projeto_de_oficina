public class Teste {
    public static void main(String[] args) {
        Oficina o = new Oficina();
        Veiculo v1 = new Automovel("JOW-1986", 2004, "Palio", "Automóvel");
        Veiculo v2 = new Automovel("QPR-1876", 2003, "Uno", "Automóvel");

        o.adicionarVeiculo(v1);
        o.adicionarVeiculo(v2);

        for(int i = 0; i < 2; i++){
            Veiculo temp;
            temp = o.proximo();
            if(temp != null){
                o.manutencao(temp);
            }
        }
    }
}
