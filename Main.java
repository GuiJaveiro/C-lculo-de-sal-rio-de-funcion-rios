import entities.Funcionario;
import entities.NivelCargo;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        Funcionario funcionario2 = new Funcionario();


        /*funcionario.setNome("Guido");
        funcionario.setCargo(NivelCargo.JUNIOR);
        funcionario.setSalario(2000);
        System.out.println(funcionario.exibeDados());*/

        //Segundo usuario
        funcionario2.setNome("Ken");
        funcionario2.setCargo(NivelCargo.PLENO);
        funcionario2.setSalario(4000);
        System.out.println(funcionario2.exibeDados());


        System.out.println("O salario apos aumento sera: " + funcionario2.aumentaSalario());


    }
}