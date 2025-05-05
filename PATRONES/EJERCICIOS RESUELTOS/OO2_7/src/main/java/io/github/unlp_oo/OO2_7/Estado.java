package io.github.unlp_oo.OO2_7;

public interface Estado {

    public void setValor(double unValor, Calculadora c);

    public void mas(Calculadora c);
    
    public void menos(Calculadora c);
    
    public void por(Calculadora c);
    
    public void dividido(Calculadora c);
    
    public String getResultado(Calculadora c);
    
}
