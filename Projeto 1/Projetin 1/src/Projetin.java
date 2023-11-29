public class Projetin {
    public static void main(String[] args) {
       String numeroPrimeiro = "Carlos";
       String numeroSegundo = "Auberto";
       String mutiplicacao = mutiplicacao(numeroPrimeiro, numeroSegundo);
       System.out.print(mutiplicacao);

    }
    public static String mutiplicacao(String numeroPrimeiro, String numeroSegundo){
        return numeroPrimeiro.concat(" ").concat(numeroSegundo);
    }
}
