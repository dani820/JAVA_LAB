package bookshelf;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		shelf.add(title);		//arraylist 의 맨 뒤로 들어감 
	}

	@Override
	public String deQueue() {		//책의 제목 반환.
		return shelf.remove(0);		//처음 들어간 것부터 나올 것임.
	}

	@Override
	public int getSize() {
		return getCount();
	}

}
