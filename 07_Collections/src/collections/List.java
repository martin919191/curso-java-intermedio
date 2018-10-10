package collections;

public interface List<E> extends Collection<E> {
	public boolean add(int idex, E e);

	public E remove(int index);

	public E get(int index);

	public E set(int index, E e);

	public int index(Object o);

}
