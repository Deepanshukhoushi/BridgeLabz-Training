package com.browserbuddy;

public class Tab {
	private Page head;
	private Page current;
	
	public void visit(String url) {
		Page newPage = new Page(url);
		
		if (head == null) {
			head = newPage;
			current = newPage;
		} else {
			current.next = newPage;
			newPage.prev = current;
			current = newPage;
		}
		System.out.println("Visited: " + url);
	}
	
	public void back() {
		if (current != null && current.prev != null) {
			current = current.prev;
			System.out.println("Back to: " + current.url);
		} else {
			System.out.println("No previous page");
		}
	}
	
	public void forward() {
		if (current != null && current.next != null) {
			current = current.next;
			System.out.println("Forward to: " + current.url);
		} else {
			System.out.println("No next page");
		}
	}

	public String getCurrentPage() {
		return "Home Page";
	}
}

