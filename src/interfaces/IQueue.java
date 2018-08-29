package interfaces;

public interface IQueue<Q> {
	
	public void enqueue(Q newElement);
	
	public Q dequeue();
	
	public Q front();
	
	public boolean isEmptyQ();
	
	public int sizeQ();

}
