public class IfElse {
    public static void main(String[] args) {
        int idade = 14;
        if (idade >= 18){
            System.out.println("Pessoa maior de idade, pode entrar na festa");
        }
        else {
            System.out.println("Pessoa menor de idade, ja deveria estar dormindo");
        }

        if (idade >= 18){
            System.out.println("Pessoa maior de idade, pode entrar na festa");
        }
        else if (idade >= 15){
            System.out.println("Pessoa menor de idade, mas pode entrar acompanhada na festa");
        }
        else {
            System.out.println("Não pode entrar na festa");
        }

        boolean festaDoMeuAmigo = true;
        if (idade >= 18 || festaDoMeuAmigo){
            System.out.println("Pode entrar na festa");
        }
        else if (idade >= 15){
            System.out.println("Pessoa menor de idade, mas pode entrar acompanhada na festa");
        }
        else {
            System.out.println("Não pode entrar na festa");
        }
    }
}
