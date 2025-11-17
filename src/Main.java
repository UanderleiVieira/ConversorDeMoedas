import modelos.ApiBuscaCotacao;
import modelos.TelaInicial;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //TelaInicial menu = new TelaInicial();
        //menu.exibeTela();
        ApiBuscaCotacao busca = new ApiBuscaCotacao();
        busca.buscaCotacao("usd");
    }
}