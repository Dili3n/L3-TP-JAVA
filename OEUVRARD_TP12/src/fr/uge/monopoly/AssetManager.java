package fr.uge.monopoly;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AssetManager {

	private final List<Asset> assets;
	
	
	public AssetManager() {
		assets = new ArrayList<>();
	}
	
	public void add(Asset asset) {
		assets.add(asset);
	}

	public void remove(double nb) {
		assets.removeIf(asset -> asset.getEfficiency() < nb);
	}
	
	public int profitPerNight() {
		return assets.stream()
								 .mapToInt(Asset::pricePerNight)
								 .sum();
	}
	
	public List<String> lowestEfficiency(double min){
		return assets.stream()
								 .filter(asset -> asset.getEfficiency() < min)
								 .map(Asset::toString)
								 .collect(Collectors.toList());
	}

	@Override
	public String toString() {
		return assets.stream()
								 .map(Asset::toString)
								 .collect(Collectors.joining("\n"));
	}
}
