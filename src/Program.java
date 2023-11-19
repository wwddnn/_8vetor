import java.util.Locale;
import java.util.Scanner;

        public class Program {
            public static void main(String[] args) {
                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);
                System.out.println("Quantos numetos voce vai digitar ");
                int n = sc.nextInt();
                //vetor para armazenar os n numeros a serem percorridos
                double[] vetor = new double[n];
                for (int i = 0; i < vetor.length; i++) {
                    System.out.println("Digite um numero ");
                    vetor[i] = sc.nextInt();
                }
                //numeros negativos
                for (int i = 0; i < vetor.length ; i++) {
                    if (vetor[i] < 0) {
                        System.out.println(vetor[i]);
                    }
                }
                sc.close();
            }

        }
