package br.com.icev.estruturadedados.stack;

import java.util.ArrayList;
import java.util.List;

public class StackGeneric<T> {

	private List<T> stack;

	public StackGeneric() {
		stack = new ArrayList<>();
	}

	/* generic stack methods */
	public void push(T t) {
		stack.add(t);
	}

	public int size() {
		return stack.size();
	}

	public T pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("stack is empty!");
		}
		return stack.remove(size() - 1);
	}

	public boolean isEmpty() {

		if (size() == 0) {
			return true;
		}
		return false;
	}

	public T top() throws Exception {

		if (isEmpty()) {
			throw new Exception("stack is empty!");
		}
		return stack.get(size() - 1);
	}

	public void clear() {

		while (size() != 0) {
			try {
				pop();
			} catch (Exception e) {
				System.out.println("stack is empty!");
			}
		}

	}

	public T get(int i) {
		
		return stack.get(i);
	}
}