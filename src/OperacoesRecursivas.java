public class OperacoesRecursivas
{
    public static void main(String[] args) {
        System.out.println("saoDiferentes (verdadeiro) = " + saoDiferentes(-3, 7));
        System.out.println("saoDiferentes (falso) = " + saoDiferentes(7, 7));

        System.out.println("\nehNegativo (verdadeiro) = " + ehNegativo(-3));
        System.out.println("ehNegativo (falso) = " + ehNegativo(3));

        System.out.println("\nmenor, positivos (verdadeiro) = " + menor(3, 10));
        System.out.println("menor, negativos (verdadeiro) = " + menor(-5, -3));
        System.out.println("menor, negativo e positivo (verdadeiro) = " + menor(-3, 3));
        System.out.println("menor, iguais (falso) = " + menor(3, 3));
        System.out.println("menor, a maior que b (falso) = " + menor(10, 4));

        System.out.println("\nmenorIgual, positivos (verdadeiro) = " + menorIgual(3, 10));
        System.out.println("menorIgual, negativos (verdadeiro) = " + menorIgual(-5, -3));
        System.out.println("menorIgual, negativo e positivo (verdadeiro) = " + menorIgual(-3, 3));
        System.out.println("menorIgual, iguais (verdadeiro) = " + menorIgual(3, 3));
        System.out.println("menorIgual, a maior que b (falso) = " + menorIgual(10, 4));

        System.out.println("\nmaior, positivos (verdadeiro) = " + maior(10, 3));
        System.out.println("maior, negativos (verdadeiro) = " + maior(-3, -5));
        System.out.println("maior, positivo e negativo (verdadeiro) = " + maior(3, -3));
        System.out.println("maior, iguais (falso) = " + maior(3, 3));
        System.out.println("maior, a menor que b (falso) = " + maior(4, 10));

        System.out.println("\nmaiorIgual, positivos (verdadeiro) = " + maiorIgual(10, 3));
        System.out.println("maiorIgual, negativos (verdadeiro) = " + maiorIgual(-3, -5));
        System.out.println("maiorIgual, negativo e positivo (verdadeiro) = " + maiorIgual(3, -3));
        System.out.println("maiorIgual, iguais (verdadeiro) = " + maiorIgual(3, 3));
        System.out.println("maiorIgual, a menor que b (falso) = " + maiorIgual(3, 6));

        System.out.println("\nsoma (positivos) 10 + 3 = " + soma(10, 3));
        System.out.println("soma (negativos) -3 + -5 = " + soma(-3, -5));
        System.out.println("soma (positivo e negativo) 9 + -3 = " + soma(9, -3));
        System.out.println("soma (iguais) 3 + 3 = " + soma(3, 3));
        System.out.println("soma (zero e positivo) 0 + 10 = " + soma(0, 10));

        System.out.println("\nsubtracao (positivos) 10 - 3 = " + subtracao(10, 3));
        System.out.println("subtracao (negativos) -10 - -5 = " + subtracao(-10, -5));
        System.out.println("subtracao (positivo e negativo) 9 - -3 = " + subtracao(9, -3));
        System.out.println("subtracao (iguais) 3 - 3 = " + subtracao(3, 3));
        System.out.println("subtracao (zero e positivo) 10 - 0 = " + subtracao(10, 0));

        System.out.println("\nmodulo (positivo) |13| = " + modulo(13));
        System.out.println("modulo (negativo) |-33| = " + modulo(-33));
        System.out.println("modulo (zero) |0| = " + modulo(0));

        System.out.println("\nmultiplicacao (positivos) 4 x 7 = " + multiplicacao(4, 7));
        System.out.println("multiplicacao (negativos) -2 x -7 = " + multiplicacao(-2, -7));
        System.out.println("multiplicacao (positivo e negativo) 5 x -6 = " + multiplicacao(5, -6));
        System.out.println("multiplicacao (por 1) 8 x 1 = " + multiplicacao(8, 1));
        System.out.println("multiplicacao (por 0) 9 x 0 = " + multiplicacao(9, 0));
    }

    /*Faça uma função de nome saoDiferentes que, recebendo como parâmetro dois números
    inteiros, resulta true, caso o primeiro deles seja diferente do segundo, ou false, caso
    contrário. Esta função não será recursiva, porém pode ser útil para os exercícios abaixo.*/
    public static boolean saoDiferentes(int a, int b){
        if (a == b) return false;
        return true;
    }

    /*Faça uma função de nome ehNegativo que, recebendo como parâmetro um único número
    inteiro, resulta true, caso o mesmo seja negativo, ou false, caso contrário.*/
    public static boolean ehNegativo(int n){
        if (n == 0) return false;
        return neg(n, n);
    }

    private static boolean neg(int a, int b){
        if (a == 0) return true;
        if (b == 0) return false;

        return neg(++a,--b);
    }

    /*Faça uma função de nome menor que, recebendo como parâmetro dois números inteiros,
    resulta true, caso o primeiro deles seja menor que o segundo, ou false, caso contrário.*/
    public static boolean menor(int a, int b){
        if(ehNegativo(a)){
            if(ehNegativo(b)){
                return menorNegativo(++a, ++b);
            }
            return true;
        }
        if (ehNegativo(b)){
            return false;
        }
        return menorPositivo(--a, --b);
    }

    private static boolean menorPositivo(int a, int b){
        if(b==0) return false;
        if(a==0) return true;
        return menorPositivo(--a, --b);
    }

    private static boolean menorNegativo(int a, int b){
        if(a==0) return false;
        if(b==0) return true;
        return menorNegativo(++a, ++b);
    }

    /*Faça uma função de nome menorIgual que, recebendo como parâmetro dois números
    inteiros, resulta true, caso o primeiro deles seja menor ou igual o segundo, ou false, caso
    contrário.*/
    public static boolean menorIgual(int a, int b){
        if(a==b)return true;
        return menor(a, b);
    }

    /*Faça uma função de nome maior que, recebendo como parâmetro dois números inteiros,
    resulta true, caso o primeiro deles seja maior que o segundo, ou false, caso contrário.*/
    public static boolean maior(int a, int b){
        if(a==b)
            return false;

        if(ehNegativo(a))
            if(ehNegativo(b))
                return maiorNegativo(a, b);

        if(menor(a, b))
            return false;
        return true;
    }

    private static boolean maiorNegativo(int a, int b) {
        if (a == 0) return true;
        if (b == 0) return false;
        return maiorNegativo(++a, ++b);
    }

    /*Faça uma função de nome maiorIgual que, recebendo como parâmetro dois números
    inteiros, resulta true, caso o primeiro deles seja maior ou igual o segundo, ou false, caso
    contrário.*/

    public static boolean maiorIgual(int a, int b){
        if (a == b) return true;
        return maior(a, b);
    }

    /*Faça uma função de nome soma que, recebendo como parâmetro dois números inteiros,
    resulta a soma deles.*/
    public static int soma(int a, int b){
        if(b == 0) return a;
        if(a == 0) return b;

        return somaNegativo(a, b);

    }

    private static int somaNegativo(int a, int b){
        if(b == 0)
            return a;

        if(ehNegativo(b))
            return somaNegativo(--a, ++b);

        return somaNegativo(++a, --b);
    }

    /*Faça uma função de nome subtracao que, recebendo como parâmetro dois números
    inteiros, resulta a subtração deles (o primeiro menos o segundo).*/
    public static int subtracao(int a, int b){
        if(b == 0) return a;

        return subtracaoNegativo(a, b);
    }

    private static int subtracaoNegativo(int a, int b){
        if(b==0)
            return a;

        if(ehNegativo(b))
            return subtracaoNegativo(++a, ++b);

        return subtracaoNegativo(--a, --b);
    }

    /*Faça uma função de nome modulo que, recebendo como parâmetro um único número
    inteiro, resulta o módulo (valor absoluto) do mesmo.*/
    public static int modulo(int a){
        return mod(a, 0);
    }

    private static int mod(int a, int b){
        if(a==0)
            return b;

        if(ehNegativo(a))
            return mod(++a, ++b);

        return a;
    }

    public static int multiplicacao(int x, int y)
    {
        if (y == 0)
            return y;

        if (y == 1)
            return x;

        return (soma(x, multiplicacao(x, subtracao(y, 1))));
    }
}
