package Repository;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import Exception.FileOperationException;

public abstract class BaseRepository<T> {
    protected List<T> items = new ArrayList<>();
    protected String fileName;
    
    public BaseRepository(String fileName) {
        this.fileName = fileName;
        loadFromFile();
    }
    
    public void add(T item) { 
        items.add(item);
        saveToFile();
    }
    
    public List<T> list() { 
        return items; 
    }
    
    public abstract T findById(int id);
    
    protected void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(items);
        } catch (IOException e) {
            System.err.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    protected void loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            items = (List<T>) ois.readObject();
        } catch (FileNotFoundException e) {
            items = new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao carregar arquivo: " + e.getMessage());
            items = new ArrayList<>();
        }
    }
}