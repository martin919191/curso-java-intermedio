package collections;

public class ArrayList<E> implements List<E> {

	private Object[] array;

	public boolean add(Object e) {
		boolean added = false;
		Object[] newArray;
		if (array == null) {
			newArray = new Object[1];
			newArray[0] = e;
		} else {
			newArray = new Object[array.length + 1];
			int i;
			for (i = 0; i < array.length; i++) {
				newArray[i] = array[i];
			}
			newArray[i] = e;
		}
		array = newArray;
		added = true;
		return added;
	}

	public boolean remove(Object o) {
			
		
		
		return false;
	}

	public int size() {
		if (array == null) {
			return 0;

		} else {
			return array.length;

		}

	}

	public boolean esEmpty() {
		if (array == null || array.length== 0){
			return true;
		} 
		return false;
		
		
	}

	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean add(int idex, Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	public E remove(int index) {
		// TODO MATÃ�AS
		return null;
	}

	public E get(int index) {
		// TODO MATÃ�AS
		return null;
	}

	public Object set(int index, Object e) {
		// TODO Auto-generated method stub
		return null;
	}

	public int index(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		String s ="";
		for(Object e: array)
			s+=e+",";
		return s;
	}

}
