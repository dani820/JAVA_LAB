package bookshelf;

public interface Queue {

	void enQueue(String titile);
	String deQueue();		//선입선
	int getSize();
}
