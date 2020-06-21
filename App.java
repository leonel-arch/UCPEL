package app;

import classes.*;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
    
        PessoaFisica leonel = new PessoaFisica();
        PessoaFisica ivan = new PessoaFisica();
        PessoaJuridica vivo = new PessoaJuridica();
        PessoaJuridica tim = new PessoaJuridica();
        Agenda lista = new Agenda();

        System.out.println("Total pessoas cadastradas:"+ lista.totalPessoasCadastradas());

        leonel.nome= "Leonel Silva";
        leonel.cpf= "03710011190";
        leonel.email= "leonel.silva@edu.ucpel.com";
        leonel.telefone= "(41)999817928";

        System.out.println("Pessoa cadastrada:");
        System.out.println("-Nome: " + leonel.nome);
        System.out.println("-CPF: " + leonel.cpf);
        System.out.println("-Email: " + leonel.email);
        System.out.println("-Telefone: " + leonel.telefone);

        lista.pessoaCadastrada(leonel);

        System.out.println("Total pessoas cadastradas:"+ lista.totalPessoasCadastradas());

        ivan.nome= "Ivan Luis";
        ivan.cpf= "06667778888";
        ivan.email= "ivan.luis@gmail.com";
        ivan.telefone= "(53)998229988";

        System.out.println("Pessoa cadastrada:");
        System.out.println("-Nome: " + ivan.nome);
        System.out.println("-CPF: " + ivan.cpf);
        System.out.println("-Email: " + ivan.email);
        System.out.println("-Telefone: " + ivan.telefone);

        lista.pessoaCadastrada(ivan);

        System.out.println("Total pessoas cadastradas:"+ lista.totalPessoasCadastradas());
        
        vivo.nome= "VIVO Telecom.";
        vivo.cnpj= "02302/00001-99";
        vivo.email= "ouvidoria@telefonica.com";
        vivo.telefone= "0800 7714 141";

        System.out.println("Pessoa cadastrada:");
        System.out.println("-Nome: " + vivo.nome);
        System.out.println("-CPF: " + vivo.cnpj);
        System.out.println("-Email: " + vivo.email);
        System.out.println("-Telefone: " + vivo.telefone);

        lista.pessoaCadastrada(vivo);

        System.out.println("Total pessoas cadastradas:"+ lista.totalPessoasCadastradas());

        tim.nome= "TIM SA";
        tim.cnpj= "06552/00001-89";
        tim.email= "ouvidoria@timcelular.com";
        tim.telefone= "0800 114 999";

        System.out.println("Pessoa cadastrada:");
        System.out.println("-Nome: " + tim.nome);
        System.out.println("-CPF: " + tim.cnpj);
        System.out.println("-Email: " + tim.email);
        System.out.println("-Telefone: " + tim.telefone);

        lista.pessoaCadastrada(tim);

        System.out.println("Total pessoas cadastradas:"+ lista.totalPessoasCadastradas());

    
    }
}
