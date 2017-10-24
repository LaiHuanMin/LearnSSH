package rm.rmrf.service;

public class BookService {
	private String[] books = {
			"Spring ",
			"清凉机",
			"Java和21天",
			"SSH"
	};
	public String[] getAllBooks() {
		return this.books;
	}
}
