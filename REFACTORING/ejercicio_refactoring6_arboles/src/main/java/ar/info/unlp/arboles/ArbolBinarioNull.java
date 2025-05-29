package ar.info.unlp.arboles;

public class ArbolBinarioNull implements InterfazArbolBinario{



	public int getValor() {
        return 0;
    }

    public void setValor(int valor) {
    	
    }
    
    public InterfazArbolBinario getHijoIzquierdo() {
        return null;
    }

    public void setHijoIzquierdo(InterfazArbolBinario hijoIzquierdo) {
    	
    }

    public InterfazArbolBinario getHijoDerecho() {
    	return null;
    }

    public void setHijoDerecho(InterfazArbolBinario hijoDerecho) {
    	
    }

    public String recorrerPreorden() {
    	return "";
    }

    public String recorrerInorden() {
    	return "";
    }
    
    public String recorrerPostorden() {
    	return "";
    }
}
