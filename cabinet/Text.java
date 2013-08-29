package cabinet;

public class Text
		extends Item
{
	/* Variable Members */
	private		String		publisher, publisherCity;
	private		Integer		year;
	// TODO Add other members for citation data
	
	/* Constructors */
	Text()
	{
		super();
		publisher = "";
		publisherCity = "";
		year = 0;
	}
	
	Text(String tit, String mkr, String pbc, Integer yr, String ... tgs)
	{
		super(tit, tgs);
		publisher = mkr;
		publisherCity = pbc;
		year = yr;
	}
	
	//TODO Add constructor for existing filepath
	
	/* General Methods */
	
	// Implementation of the Comparable interface is required to sort
	// items correctly, based on title, year, and then publisher
//	@Override
//	public int compareTo(Text other)
//	{
//		int title  = this.getTitle().compareTo(other.getTitle());
//		if (title==0)
//		{
//			int yr = this.getYear().compareTo(other.getYear());
//			if (yr==0)
//			{
//				return this.getPublisher().compareTo(other.getPublisher());
//				
//			}
//			else return yr;
//		}
//		else return title;
//	}
	
	@Override
	public String toString()
	{
		//TODO the toString
		return null;
	}

	/* Publisher Methods */
	public String getPublisher()
	{
		return publisher;
	}
	
	public String getPubCity()
	{
		return publisherCity;
	}

	public void setPublisher(String publisher, String publisherCity)
	{
		this.publisher = publisher;
		this.publisherCity = publisherCity;
	}
	
	/* Year Methods */
	public Integer getYear() {
		return year;
	}
	
	public void setYear(Integer year)
	{
		this.year = year;
	}

}
