package yazilimodevi;

public class Book implements IBook {

	protected int pages;
	private Publisher publisher;
	
	public Book (Publisher publisher) {
		
		this.publisher= publisher;
		
	}
	
	public Book (Publisher publisher, int pages) {
		
		this.publisher=publisher;
		this.pages=pages;
	}
	
	public Publisher getPublisher () {
		
		return publisher;
	}
	
	public void setPublisher (Publisher publisher) {
		
		this.publisher= publisher;
	}

	public int getPages() {
		
		return 50;
		
	}
	
	public void setPages(int pages) {
		this.pages=pages;
			
	}
}
