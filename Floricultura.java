public class Floricultura {
    public static void main(String[] args) {

        Clientes compraFlores = new Clientes("ana", "são paulo", "302.258.456.10");

        compraFlores.floricultura.nomeFlor();
        compraFlores.floricultura.especieTam();
        compraFlores.floricultura.corFlor();

        System.out.println(compraFlores.cliente);
        System.out.println(compraFlores.cpf);
        System.out.println(compraFlores.endereco);
        System.out.println(compraFlores.idade);



    }
}
