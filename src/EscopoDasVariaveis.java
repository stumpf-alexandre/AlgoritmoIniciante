public class EscopoDasVariaveis {
    public static void main(String[] args) {
        boolean condicao = true;
        int i;
        if (condicao){
            i = 5;
        }
        else {
            i = 10;
        }
        System.out.println("i: " + i);

        int j = 0;
        for (; j < 10; j++){
            System.out.println("j: " + j);
        }
        System.out.println(j);
    }
}
