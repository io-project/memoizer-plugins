package pl.edu.uj.tcs.memoizer.plugins;

public enum EViewType {

	CHRONOLOGICAL("Chronological"),
	FAVOURITE("Favourite"),
	
	/**
	 *  Meta view, setting this view will enable saving on disk viewed memes, set this view, should return list of memes which will be filtered, ex. CHRONO view 
	 */
	UNSEEN("Unseen"),
	
	QUEUE("Queue"),
	RANDOM("Random"),
	SEARCH("Search"),
	LIKED("Liked");/** Meta view, should not be implemented */
	
	
	private String typeName;
	
	private EViewType(String typeName) {
		this.typeName = typeName;
	}
	
	public String getName() {
		return typeName;
	}
	
}
