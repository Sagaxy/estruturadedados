package br.com.icev.estruturadedados.appActions;

import java.util.Scanner;

import br.com.icev.estruturadedados.stack.StackGeneric;

public class StackUndo<T> {

	Scanner input = new Scanner(System.in);
	StackGeneric<T> stackdoing = new StackGeneric<>();
	StackGeneric<T> stackUndoing = new StackGeneric<>();

	public void remove() throws Exception {
		stackUndoing.push(stackdoing.top());
		stackdoing.pop();
		return;
	}

	public void back() throws Exception {
		stackdoing.push(stackUndoing.top());
		stackUndoing.pop();
		return;

	}

	public void largeBack() {
		System.out.println("type how many times do you want to back(the limit is 16): ");

		int numBack = input.nextInt();
		if (numBack > 16) {
			largeBack();
		}
		try {
			int i = 0;
			while (i < numBack) {
				back();
				i++;
			}
		} catch (Exception e) {
			System.out.println("do not have any operation to undo!");
		}
	}

}
