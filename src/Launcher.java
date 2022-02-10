import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Hello " + (args.length > 0 ? args[0] : "World"));
        while (true) {
            Scanner test = new Scanner(System.in);
            String commande = test.nextLine();
            if ("quit".equals(commande)) {
                break;
            }
            else if ("fibo".equals(commande)) {
                System.out.println("Entrez un nombre n");
                Scanner n = new Scanner(System.in);
                int fib = n.nextInt();
                if (fib == 0) {
                    System.out.println(fib);
                } else if (fib == 1) {
                    System.out.println(fib);
                } else {
                    int cnt = 2;
                    int n0 = 0;
                    int n1 = 1;
                    int tmp;
                    while (cnt <= fib) {
                        tmp = n1;
                        n1 = n0 + n1;
                        n0 = tmp;
                        cnt += 1;
                    }
                    System.out.println(n1);
                }
            }
            else {
                break;
            }
        }
    }
}

