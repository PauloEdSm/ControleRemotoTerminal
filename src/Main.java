//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ControleRemoto c1 = new ControleRemoto();
        c1.ligarControle();
        c1.playControle();
        c1.muteControle();
        c1.desmuteControle();
        System.out.println("-------------------------------");
        c1.status();
    }
}