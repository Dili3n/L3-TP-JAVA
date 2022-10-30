package fr.uge.blockbuster;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Objects;

public class Catalog {
	
	private final HashMap<String ,Film> cat;
	
	public Catalog() {
	  cat = new HashMap<>();
	}
	
	public void add(Film film) {
		Objects.requireNonNull(film);
		Objects.requireNonNull(film.name());
		var result = cat.putIfAbsent(film.name(), film);
		if (result != null) {
			throw new IllegalArgumentException("Movie already in the Map.");
		}
	}
	
	public Film lookup(String name) {
		Objects.requireNonNull(name);
		return cat.get(name);
	}
	
	public String toText() {
		var str = new StringBuilder();
		for (var elem : cat.values()) {
			str.append(elem);
	  }
		return str.toString();	
	}
	
	public void save(Path of) throws IOException {
		Objects.requireNonNull(of);
		try (var writer = Files.newBufferedWriter(of)){
			for (var elem : cat.keySet()) {
			   writer.write(cat.get(elem).toText());
			   writer.newLine();
			 }
			writer.close();
		} catch(IOException e) {
			System.err.println(e.getMessage());
			System.exit(1);
			return;
			} 
	}
	
	public void load(Path of) throws IOException {
		Objects.requireNonNull(of);
		try (var reader = Files.newBufferedReader(of)){
				String line;
				while ((line = reader.readLine()) != null) {
					add(Film.fromText(line));
				}
				reader.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
			System.exit(1); 
			return;
		}
	}
	
	public void save(Path of, Charset charset) throws IOException {
		Objects.requireNonNull(of);
		Objects.requireNonNull(charset);
		try (var writer = Files.newBufferedWriter(of, charset)){
			for (var elem : cat.keySet()) {
			   writer.write(cat.get(elem).toText());
			   writer.newLine();
			 }
			writer.close();
		} catch(IOException e) {
			System.err.println(e.getMessage());
			System.exit(1);
			return;
			} 
	}
	
	public void load(Path of, Charset charset) throws IOException {
		Objects.requireNonNull(of);
		Objects.requireNonNull(charset);
		try (var reader = Files.newBufferedReader(of, charset)){
				String line;
				while ((line = reader.readLine()) != null) {
					add(Film.fromText(line));
				}
				reader.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
			System.exit(1); 
			return;
		}
	}

	
	
}
