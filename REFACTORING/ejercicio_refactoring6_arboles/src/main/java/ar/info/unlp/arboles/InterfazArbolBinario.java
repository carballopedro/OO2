package ar.info.unlp.arboles;

public interface InterfazArbolBinario {
	
	public int getValor();
	
    public void setValor(int valor);
    
    public InterfazArbolBinario getHijoIzquierdo();
    
    public void setHijoIzquierdo(InterfazArbolBinario hijoIzquierdo);
    
    public InterfazArbolBinario getHijoDerecho();
    
    public void setHijoDerecho(InterfazArbolBinario hijoDerecho);
    
    public String recorrerPreorden();
    
    public String recorrerInorden();
    
    public String recorrerPostorden();
    
}
