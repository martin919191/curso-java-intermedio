package collections;

public interface Collection<E> {
	
	public boolean add(E e);
	
	public boolean remove(Object o);
	
	public int size();
	
	public boolean esEmpty();
	
	public boolean contains(Object o);

}
