package pl.edu.uj.tcs.memoizer.plugins;

import java.util.List;

/*
 * Interface implemented by download plugin
 * @author pmikos (sokar92)
 */
public interface IDownloadPlugin extends IPlugin {
	
	/*
	 * Gets view as plugin work mode
	 */
	public EViewType getView();
	
	/*
	 * Check if there is next meme to return
	 * in current view
	 */
	public boolean hasNext();
	
	/*
	 * Returns next meme from waiting queue
	 */
	public Meme getNext();
	
	/*
	 * Returns next n memes from waiting queue
	 */
	public Iterable<Meme> getNext(int n);
}