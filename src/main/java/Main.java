public class Main {
    public static void main(String[] args) {
        /*
        4 tipos de metodos
        1.metodo sem retorno e sem parametro
        2.metodo sem retorno e com parametro
        3.metodo com retorno e sem parametro
        4.metodo com retorno e com parametro
        */
        apresentar();
        apresentar("Meu texto é esse");
        String texto = getApresentar();
        System.out.println(texto);
        //System.out.println(getApresentar(1));
        //principal.apresentarDados("000", 2);

    }

    //metodo sem retorno e sem parametro
    public static void apresentar() {
        System.out.println("Dados a serem apresentados");
    }

    //metodo sem retorno e com parametro
    public static void apresentar(String texto) {
        System.out.println("texto");
    }

    //metodo com retorno e sem parametro
    public static String getApresentar() {
        return "texto a ser retornado";

        //metodo com retorno e com parametro
        /*static String getApresentar ( int codigo){
            if (codigo == 1) {
                return "1";
            } else if (codigo == 2) {
                return "2";
            } else {
                return "";
            }
        }*/
        /*public void apresentarDados (String cpf,int cod)
        if (cpf.equals("000")) {
            if (cod == 0)
                System.out.println(cod);
            else
                System.out.println(cod);
            System.out.println("Erro");
        } else if (cpf.equals("111")) {
            System.out.println(cod);
        }
    }*/


    }
}
