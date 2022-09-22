public class Mensagem {

    // Visibilidade - Modificador - Retorno nao tem retorno pq eh void - Nome do
    // Metódo - Parametros
    public static void obterMensagem(int hora) {

        // Switch case eh uma estrutura para testar condicoes de uma forma simples e intuitiva

        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagemBomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                mensagemBoaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                mensagemBoaNoite();
                break;
            default:
                System.out.println("Hora inválida");
                break;
        }
    }

    public static void mensagemBomDia() {
        System.out.println("Bom dia!");
    }

    public static void mensagemBoaTarde() {
        System.out.println("Bom Tarde!");
    }

    public static void mensagemBoaNoite() {
        System.out.println("Bom Noite!");
    }

}
