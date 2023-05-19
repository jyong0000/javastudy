package library;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> booklist = new ArrayList<>();
	private ArrayList<User> userlist = new ArrayList<>();
	
	public ArrayList<Book> getBooklist() {
		return booklist;
	}
	public void setBooklist(ArrayList<Book> booklist) {
		this.booklist = booklist;
	}
	public ArrayList<User> getUserlist() {
		return userlist;
	}
	public void setUserlist(ArrayList<User> userlist) {
		this.userlist = userlist;
	}
	
	
}
 