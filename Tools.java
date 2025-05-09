package pck;

public interface Tools<T> {
    void add(T obj);
    void remove(T obj);
    // Use these tools to make life simpler for ArrayList
    // indexOf can find if a elements exists or not
    // size() checks how many items are in ArrayList. Updates before and after adding or removing. 
    // Finding an item by index using get().
    // Changing the value of an ArrayList item using set().
}