# TP12 OEUVRARD DILIEN

## Exercice 1 - Hôtels et Appartements

### 1  Création du record Hotel


Création du record avec un constructeur qui vérifie que le nombre de chambres est positif.

```java
	public Hotel {
		if (rooms < 0) {
			throw new IllegalArgumentException("rooms >= 0");
		}
		if (efficiency < 0 || efficiency > 1) {
			throw new IllegalArgumentException("0 < efficiency < 1");
		}
	}
```

### 2  Création du record Apartment

Création du record avec un constructeur qui vérifie que le nombre de m2 est positif.

```java
    public Apartment {
        Objects.requireNonNull(person);
        if (area < 0) {
            throw new IllegalArgumentException("area >= 0");
        }
    }
```

### 3 Copie défensive 

Ajout d'une méthode `copy` dans le constructeur de `Apartment` qui permet de créer une copie de l'objet.

```java
    person = List.copyOf(person);
```

### 4 Création de la classe `AssetManager`

Création de la classe `AssetManager` qui permet de gérer les hotels et les appartements.

```java
    private final List<Asset> assets;
```

Avec une liste de `Asset` qui est une interface qui permet de gérer les hotels et les appartements.

```java
    public interface Asset {
        double getEfficiency();
        int pricePerNight();
    }
```

### 5 Sealed Interface

```java
    public sealed interface Asset permits Hotel, Apartment {

	double getEfficiency();
	int pricePerNight();
    }
```

### 6 Affichage des informations

Gràca à une stream on peut afficher les informations de chaque asset.

```java
	@Override
	public String toString() {
		return assets.stream()
			.map(Asset::toString)
		    .collect(Collectors.joining("\n"));
	}
```

### 7 low efficiency

```java
	public List<String> lowestEfficiency(double min){
		return assets.stream()
								 .filter(asset -> asset.getEfficiency() < min)
								 .map(Asset::toString)
								 .collect(Collectors.toList());
	}
```

### 8 removeif

```java
	public void remove(double nb) {
		assets.removeIf(asset -> asset.getEfficiency() < nb);
	}
```