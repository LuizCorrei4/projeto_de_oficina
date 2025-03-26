import java.util.LinkedList;
import java.util.Queue;
/*
 Queue é uma interface da LinkedList, sendo uma forma de implementar uma lista encadeada com comportamento FIFO.
 */

public class Oficina {
    private Queue<Veiculo> filaVeiculos;
    private int capacidadeMaxima; // capacidade máxima da oficina

    public Oficina() {
        this.capacidadeMaxima = Constantes.maximoVeiculos;
        filaVeiculos = new LinkedList<>(); // aqui instanciamos a lista encadeada
    }

    public boolean adicionarVeiculo(Veiculo veiculo) {
        if(filaVeiculos.size() >= capacidadeMaxima){
            System.out.println("Oficina está cheia de veículos");
            return false; // oficina está cheia
        }else{
            filaVeiculos.offer(veiculo);
            System.out.println("Veículo adicionado a fila da oficina com sucesso!");
            return true;
        }
    }

    public Veiculo proximo(){
        if(filaVeiculos.isEmpty()){
            System.out.println("Não há veículos na oficina");
            return null;
        }else{
            return filaVeiculos.peek(); // retorna o primeiro da fila
        }
    }

    public boolean manutencao(Veiculo veiculo) {
        if(veiculo == null){
            return false;
        }else{
            veiculo.listarVerificacoes();
            veiculo.ajustar();
            veiculo.limpar();
            if(veiculo instanceof Automovel){
                ((Automovel) veiculo).trocarOleo(); // faz o casting do objeto veiculo para automovel
            }

            // retirada do veículo da fila da Oficina
            filaVeiculos.poll();
            System.out.println("A manutenção do veículo foi completada.");
            return true;
        }
    }
}
