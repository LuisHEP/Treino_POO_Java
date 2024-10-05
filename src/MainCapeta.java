import br.com.objeto.OrientadoObjeto;

public class MainCapeta {

    public static void main(String[] args) {
        OrientadoObjeto pessoaA = new OrientadoObjeto();
        OrientadoObjeto pessoaB = new OrientadoObjeto();

        pessoaA.setName("Ana");
        pessoaA.setSex("Feminino");
        pessoaA.setAge("22");

        System.out.println(pessoaA.getName());
        System.out.println(pessoaA.getSex());
        System.out.println(pessoaA.getAge());

        System.out.println();

        pessoaB.setName("Lucas");
        pessoaB.setSex("Masculino");
        pessoaB.setAge("25");

        System.out.println(pessoaB.getName());
        System.out.println(pessoaB.getSex());
        System.out.println(pessoaB.getAge());
    }

}
