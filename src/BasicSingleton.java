public class BasicSingleton {
    //creo una sola istanza della classe in modo private
    private static BasicSingleton instance;

    //costruttore privato vuoto
    private BasicSingleton(){}

//creo l'istanza nel caso in cui fosse stata dichiarata con valore null e creo getter e setter dell'istanza
    public static BasicSingleton getInstance(){
        if (instance == null) {
            instance = new BasicSingleton();
        } return instance;
    }

    //dichiaro le variabili della classe in modo privato
    //oltre ai getter e setter
    private String nome;
    private String cognome;

    public static void setInstance(BasicSingleton instance) {
        BasicSingleton.instance = instance;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return "BasicSingleton{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                '}';
    }
}
