public class Pilha {

    private int head;
    private NoURL item[];


    public Pilha(int tamanho){
        this.item = new NoURL[tamanho];
        this.head = 0;
    }

    public void empilha(NoURL x) throws Exception {
        if(this.head == this.item.length)
            throw new Exception ("Erro: pilha cheia");
        else this.item[this.head++]=x;
    }

    public int getHead() {
        return head;
    }


    public NoURL[] getItem() {
        return item;
    }

}
