public class Main {
    public static void main(String[] args) throws Exception {

        Url primeira = new Url("google");
        Url segunda = new Url("insta");
        Url terceira = new Url("face");

        NoURL no1 = new NoURL();
        NoURL no2 = new NoURL();
        NoURL no3 = new NoURL();

        no1.url = primeira;
        no1.no_proximo=no2;

        no2.url=segunda;
        no2.no_proximo=no3;

        no3.url = terceira;

        Pilha historico = new Pilha(3);

        historico.empilha(no1);

        int head = historico.getHead();

        System.out.print((historico.getItem())[head-1].url);



    }
}