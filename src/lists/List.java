package lists;
import interfaces.*;

public class List<Q, S> implements IStack<S>, IQueue<Q>{

	private NodeList head;
	private NodeList last;
	private NodeList top;
	private int size;
	
	public List() {
		
		head = null;
		last = null;
		top = null;
		
	}
	
	public void enqueue(Q newElement) {
		
		NodeList element = new NodeList(newElement);
		
		if(head == null) {
			
			setHead(element);
			setLast(element);
			size++;
			
		} else {
			
			last.setNext(element);
			setLast(element);
			size++;
			
		}
		
	}

	public NodeList getLast() {
		return last;
	}

	public void setLast(NodeList last) {
		this.last = last;
	}

	public NodeList getHead() {
		return head;
	}

	public void setHead(NodeList head) {
		this.head = head;
	}

	@Override
	public Q dequeue() {
		
		if(head != null) {
			
			NodeList delete = head;
			head = head.getNext();
			size--;
		
			return (Q) delete.getInfo();
		
		}
		
		else {
			
			return null;
			
		}
	}

	@Override
	public Q front() {
		
		if(head == null) {
			
			return null;
			
		} else {
			
			return (Q) head.getInfo();
			
		}
		
	}
	
	@Override
	public boolean isEmptyQ() {
		
		if(head == null) {
			
			return true;
			
		} else {
			
			return false;	
			
		}
		
		
	}
	
	@Override
	public int sizeQ() {
		return size;
	}

	@Override
	public void push(S newElement) {
		
		NodeList element = new NodeList(newElement);
		element.setNext(top);
		setTop(element);
		size++;
		
	}

	public NodeList getTop() {
		return top;
	}

	public void setTop(NodeList top) {
		this.top = top;
	}

	@Override
	public S pop() throws Exception {
		
		if(isEmptyS()) {
			
			throw new Exception("the stack is empty");
			
		}
		
		if(top != null) {
			
			NodeList delete = top;
			top = top.getNext();
			size--;
			
			return (S) delete.getInfo();
			
		}
		
		return null;
	}

	@Override
	public S top() throws Exception {
		
		if(top == null) {
			
			return null;
			
		}
		
		else if(isEmptyS()) {
			
			throw new Exception("the stack is empty");
			
		}else {
			
			return (S) top.getInfo();
			
		}

	}

	@Override
	public int sizeS() {
		
		return size;
	}

	@Override
	public boolean isEmptyS() {
		if(size == 0) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}

}
