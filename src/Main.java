import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Id do funcionário: ");
        int id = sc.nextInt();
        System.out.print("Número de horas trabalhadas: ");
        int quantityHours = sc.nextInt();
        System.out.print("Valor da hora trabalhada: ");
        double valueHour = sc.nextDouble();

        double salary = quantityHours * valueHour;

        System.out.println("NUMBER = " + id);
        System.out.printf("SALARY = U$ %.2f%n", salary);
        sc.close();
    }
}
