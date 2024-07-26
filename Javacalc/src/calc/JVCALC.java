package calc;
import java.util.Scanner;

public class JVCALC {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int nmr1, nmr2;
        char operador;
        boolean operacaoValida = true;
        String resultado = "";

        System.out.print("Insira o primeiro número: ");
        nmr1 = ler.nextInt();
        ler.nextLine();

        System.out.print("Insira o segundo número: ");
        nmr2 = ler.nextInt();
        ler.nextLine();

        System.out.print("Insira um caractere de calculo (+, -, *, /, mod, >, >=, <, <=, ==, !=): ");
        operador = ler.next().charAt(0);

        switch (operador) {
            case '+':
                resultado = String.valueOf(nmr1 + nmr2);
                break;
            case '-':
                resultado = String.valueOf(nmr1 - nmr2);
                break;
            case '*':
                resultado = String.valueOf(nmr1 * nmr2);
                break;
            case '/':
                if (nmr2 != 0) {
                    resultado = String.valueOf(nmr1 / nmr2);
                } else {
                    resultado = "Erro: Divisão por zero.";
                    operacaoValida = false;
                }
                break;
            case '%':
                if (nmr2 != 0) {
                    resultado = String.valueOf(nmr1 % nmr2);
                } else {
                    resultado = "Erro: Divisão por zero.";
                    operacaoValida = false;
                }
                break;
            case '>':
                resultado = String.valueOf(nmr1 > nmr2);
                break;
            case '<':
                resultado = String.valueOf(nmr1 < nmr2);
                break;
            case '=':
                resultado = String.valueOf(nmr1 == nmr2);
                break;
            case '!':
                resultado = String.valueOf(nmr1 != nmr2);
                break;
            case '&':
                resultado = String.valueOf(nmr1 >= nmr2);
                break;
            case '|':
                resultado = String.valueOf(nmr1 <= nmr2);
                break;
            default:
                resultado = "Operador desconhecido.";
                operacaoValida = false;
        }

        if (operacaoValida) {
            System.out.println("O resultado é: " + resultado);
        } else {
            System.out.println(resultado);
        }

        ler.close();
    }
}
