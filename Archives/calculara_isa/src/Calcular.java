import java.util.Scanner;

public class Calcular
{
    Scanner scan = new Scanner(System.in);
    float peso, dose, concentracao;

    public Calcular()
    {
        this.peso = peso;
        this.dose = dose;
        this.concentracao = concentracao;
    }

    public void calcular()
    {
        System.out.println("Digite o peso do paciente: ");
        peso = scan.nextFloat();

        System.out.println("Digite a dose: ");
        dose = scan.nextFloat();

        System.out.println("Digite a concentração: ");
        concentracao = scan.nextFloat();

        System.out.println((peso * dose) / (concentracao * 10));
    }
}
