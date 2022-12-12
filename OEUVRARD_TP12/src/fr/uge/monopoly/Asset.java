package fr.uge.monopoly;

public sealed interface Asset permits Hotel, Apartment {

	double getEfficiency();
	int pricePerNight();
	
}
