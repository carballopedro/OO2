package ar.info.unlp.arboles;

public class ArbolBinario implements InterfazArbolBinario {
    private int valor;
    private InterfazArbolBinario hijoIzquierdo;
    private InterfazArbolBinario hijoDerecho;

    public ArbolBinario(int valor) {
        this.valor = valor;
        this.hijoIzquierdo = new ArbolBinarioNull();
        this.hijoDerecho = new ArbolBinarioNull();
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public InterfazArbolBinario getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(InterfazArbolBinario hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public InterfazArbolBinario getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(InterfazArbolBinario hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

   public String recorrerPreorden() {
        return valor + " - " + (this.getHijoIzquierdo().recorrerPreorden()) + (this.getHijoDerecho().recorrerPreorden());
    }

   public String recorrerInorden() {
        return "" + (this.getHijoIzquierdo().recorrerInorden()) + valor + " - " + (this.getHijoDerecho().recorrerInorden());
    }

   public String recorrerPostorden() {
        return "" + (this.getHijoIzquierdo().recorrerPostorden()) + (this.getHijoDerecho().recorrerPostorden()) + valor + " - ";
    }

}

