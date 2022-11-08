package br.vrb.busca;

public abstract class Buscar {

    protected Busca busca;

    public int[] fazBusca(int[] arr){return busca.fazBusca(arr);}

    public Busca getBusca() {
        return busca;
    }

    public void setBusca(Busca busca) {
        this.busca = busca;
    }
}
