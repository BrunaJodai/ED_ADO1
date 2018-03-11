package ADO01;

/**
 *
 * @author Bruna Sayuri
 */
public class No {
    private Carro c;
    private No prox;
    
    public No (Carro car){
        this.c = car;
        this.prox = null;
    }

    public Carro getC() {
        return c;
    }

    public void setC(Carro c) {
        this.c = c;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
}
