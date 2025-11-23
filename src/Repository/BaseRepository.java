package Repository;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseRepository<T> {
    protected List<T> items = new ArrayList<>();
    
    public void add(T item) { 
        items.add(item); 
    }
    
    public List<T> list() { 
        return items; 
    }
    
    public abstract T findById(int id);
}