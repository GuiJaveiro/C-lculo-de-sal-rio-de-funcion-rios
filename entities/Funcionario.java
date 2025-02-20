package entities;

public class Funcionario {
    private String nome;
    private double salario;
    private NivelCargo cargo;
    private Departamento departamento;

    public Funcionario() {
    }

    public Funcionario(String nome, double salario, NivelCargo cargo, Departamento departamento) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public String exibeDados(){
        return "Nome: " + " "
                + nome + " " +
                "  Salario : " + " "
                + salario + " " +
                "  Cargo: "
                + cargo;
    }

    public double aumentaSalario(){
        if (cargo == NivelCargo.JUNIOR){
            salario += salario * 0.05;
        } else if (cargo == NivelCargo.PLENO) {
            salario += salario * 0.10;
        } else {
            salario += salario * 0.15;
        }
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public NivelCargo getCargo() {
        return cargo;
    }

    public void setCargo(NivelCargo cargo) {
        this.cargo = cargo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
