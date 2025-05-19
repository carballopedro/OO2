package io.github.unlp_oo.OO2_14;

public abstract class Asset {
	
	public double getTotalValue() {
		return this.value() * this.liquidity();
	}

	public abstract double liquidity();
	public abstract double value();
}

