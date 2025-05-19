package io.github.unlp_oo.OO2_14;

import java.util.ArrayList;
import java.util.List;

public class CombinedAsset extends Asset {
	
	private List<Asset> assets;
	
	public CombinedAsset() {
		super();
		this.assets = new ArrayList<Asset>();
	}
	
	public void addAsset(Asset asset) {
		this.assets.add(asset);
	}

	public double liquidity() {
		return 0.5;
	}
	public double value() {
		return this.assets.stream().mapToDouble(Asset::value).sum();
	}
}
