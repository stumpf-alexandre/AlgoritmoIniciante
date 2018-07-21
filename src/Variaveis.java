public class Variaveis {
    public static void main(String[] args) {
        int idade;
        idade = 15;
        System.out.println("Idade: " + idade);

        int maisVelho;
        maisVelho = idade + 3;
        System.out.println("Mais velho: " + maisVelho);

        int maisNovo;
        maisNovo = idade - 10;
        System.out.println("Mais novo: " + maisNovo);

        int soma = 2 + 8;
        System.out.println("Soma 2 + 8: " + soma);

        int subtracao = 4 - 9;
        System.out.println("Subtração 4 - 9: " + subtracao);

        int resto = 100 % 30;
        System.out.println("resto = 100 % 30: " + resto);

        double divisao = 4.0 / 3.0;
        System.out.println("divisao = 4 / 3: " + divisao);

        double salario = 1000.50;
        double salario2 = 1000.0;

        boolean verdadeiroFalso = false;
        boolean salarioMaior = salario > salario2;
        System.out.println("Salario > Salario2: " + salarioMaior);
    }
}
