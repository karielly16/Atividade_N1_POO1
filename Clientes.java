public class Clientes {
    String cliente = "Ana";
    String cpf = "123.456.789-10";
    int idade = 36;
    String endereco = "São Paulo";
    Flores floricultura = new Flores();

    Clientes(String cliente) {
        this.cliente = cliente;
    }

    Clientes(String cliente, String endereco) {
        this.cliente = cliente;
        this.endereco = endereco;
    }

    Clientes(String cliente, String endereco, String cpf) {
        this.cliente = cliente;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    String nome() {
        String nomeProprietario = "Cliente: " + cliente + " com cpf " + cpf;
        return nomeProprietario;
    }

    String idadeCliente() {
        String idadepropietario = "Idade: " + idade;
        return idadepropietario;
    }

    String endereco() {
        String unicafilha = "Endereço: " + endereco;
        return unicafilha;
    }

}
