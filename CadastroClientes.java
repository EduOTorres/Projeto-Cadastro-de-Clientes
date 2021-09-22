import java.util.Objects;
import java.util.Scanner;

public class CadastroClientes {
    Scanner ler = new Scanner(System.in);

    private String nome;
    private double cpf;
    private String email;
    private double telefone;
    private boolean status_cadastro;


    public CadastroClientes() {
        this.status_cadastro = false;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nom) {
        this.nome = nom;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double c) {
        this.cpf = c;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String e) {
        this.email = e;
    }

    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(double tel) {
        this.telefone = tel;
    }

    public boolean isStatus_cadastro() {
        return status_cadastro;
    }

    public void setStatus_cadastro(boolean sc) {
        this.status_cadastro = sc;
    }

    public void Cadastrar() {
        this.setStatus_cadastro(true);

        //criação de variaveis dentro do método para comparação
        boolean ctz = true;
        String SoN;

        while (ctz == true) {
            System.out.println("______________Cadastro______________");
            System.out.println("Nome do cliente: ");
            this.setNome(ler.next());
            System.out.println("Cpf: ");
            this.setCpf(ler.nextDouble());
            System.out.println("E-mail: ");
            this.setEmail(ler.next());
            System.out.println("Telefone: ");
            this.setTelefone(ler.nextDouble());
            //tentativa de criar um if kkkk, deu ruim.
            System.out.println("Deseja cadastrar mais alguém?");
            SoN = ler.next();
            if (Objects.equals(SoN, "sim")) {
                ctz = true;
            } else {
                ctz = false;
            }
            System.out.println("_________________________");

        }


    }

    public void Mostrar_Todos() {

        if (isStatus_cadastro()) {
            System.out.println("Nome do cliente: " + getNome());
            System.out.println("Cpf: " + getCpf());
            System.out.println("E-mail: " + getEmail());
            System.out.println("Telefone: " + getTelefone());
        } else {
            System.out.println("Ainda nao existe nenhum cadastro!!");
        }

    }

    public void consultar() {

        double consult_cpf;
        boolean sair = false;
        String condi;

        while (sair == false) {
            System.out.println("Insira o Cpf do cliente desejado: ");
            consult_cpf = ler.nextDouble();
            if (consult_cpf == getCpf()) {
                System.out.println("\n" + getNome() + "\n" + getEmail() + "\n" + getTelefone() + "\n" + getCpf());

            } else {

                System.out.println("Não existem clientes com esse cpf: ");
                System.out.println("Deseja inserir outro?('s' para sim 'n' para não");
                condi = ler.next();
                if (Objects.equals(condi, "s")) {
                    sair = false;
                } else if (Objects.equals(condi, "n")) {
                    sair = true;
                }
            }
        }


    }

}



