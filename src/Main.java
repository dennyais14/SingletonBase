//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //istanzio due oggetti della classe Singleton
        BasicSingleton user1 = BasicSingleton.getInstance();
        BasicSingleton user2 = BasicSingleton.getInstance();
        //imposto il valore del primo oggetto user1 col setter
        user1.setNome("Giovanni");
        user1.setCognome("Rossi");

        //stampo il risultato dell'istanza user2 con i valori della prima istanza user1
        System.out.println(user2.getNome());
        System.out.println(user2.getCognome());
    }
}