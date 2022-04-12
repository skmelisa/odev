package yazilimodevi;

public class Dictionary extends Book {
	private int definitions;
		
	public Dictionary (Publisher publisher) {
		
		super(publisher);
	}
	
    public Dictionary (Publisher publisher, int pages) {
		
		super(publisher,pages);	
		
	}
    
    public Dictionary (Publisher publisher, int pages, int definitions) {
		
    	super(publisher,pages);
    	this.definitions = definitions;
		
	}
    
    public int getDefinitions()
    {
    	return definitions;
    }
    
    public void setDefinitions(int definitions)
    {
    	this.definitions = definitions;
    }

}

