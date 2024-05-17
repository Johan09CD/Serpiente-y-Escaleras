package utils;

public class Lista2DBL<T> {

    private Lista2DBL<T> Ant;
    public T Info;
    private Lista2DBL<T> Sig;

    public Lista2DBL(T D) {
        Info = D;
        Sig = null;
        Ant = null;
    }

    public Lista2DBL<T> getSig() {
        return Sig;
    }

    public void setSig(Lista2DBL<T> Ap) {
        Sig = Ap;
    }

    public Lista2DBL<T> getAnt() {
        return Ant;
    }

    public void setAnt(Lista2DBL<T> Ap) {
        Ant = Ap;
    }
}
