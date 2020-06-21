package classes;

import java.util.ArrayList;

public class Agenda {

ArrayList<Pessoa> listapessoas = new ArrayList<>();

public int totalPessoasCadastradas() {
    return listapessoas.size();
}

public void pessoaCadastrada(Pessoa pessoa){
    listapessoas.add(pessoa);
}

}


