package io.github.unlp_oo.OO2_13;

public class SandwichScript {
	
	public static void main(String[] args) {
        SubteWay subteWay = new SubteWay();

        // Classic Sandwich
        subteWay.setBuilder(new ClassicSandwich());
        Sandwich clasico = subteWay.makeSandwich();
        System.out.println("Sándwich Clásico - Precio: " + clasico.calculatePrice() + " pesos");

        // Vegetarian Sandwich
        subteWay.setBuilder(new VegetarianSandwich());
        Sandwich vegetariano = subteWay.makeSandwich();
        System.out.println("Sándwich Vegetariano - Precio: " + vegetariano.calculatePrice() + " pesos");

        // Vegan Sandwich
        subteWay.setBuilder(new VeganSandwich());
        Sandwich vegano = subteWay.makeSandwich();
        System.out.println("Sándwich Vegano - Precio: " + vegano.calculatePrice() + " pesos");

        // TACC Free Sandwich
        subteWay.setBuilder(new TACCFreeSandwich());
        Sandwich sinTACC = subteWay.makeSandwich();
        System.out.println("Sándwich Sin TACC - Precio: " + sinTACC.calculatePrice() + " pesos");
	}
}
