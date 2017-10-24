package rm.rmrf.action;

import rm.rmrf.service.BookService;

public class GetBookAction {
	private String[] books;

	public String[] getBooks() {
		return books;
	}

	public void setBooks(String[] books) {
		this.books = books;
	}

	public String execute() throws Exception {
		BookService bookService = new BookService();
		setBooks(bookService.getAllBooks());
		return "success"; 
	}
}
