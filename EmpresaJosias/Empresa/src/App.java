public class App {
    public static void main(String[] args) throws Exception {
        Loja loja = new Loja();
        Console console = new Console(loja);
        console.menu();
    }
}
