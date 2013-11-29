package pl.edu.uj.tcs.memoizer.plugins.impl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import pl.edu.uj.tcs.memoizer.plugins.Meme;
import pl.edu.uj.tcs.memoizer.serialization.IStateObject;

public abstract class MemeBuffer implements IMemeBuffer {
	
	private Queue<Meme> _queue = new LinkedList<Meme>();
	protected IStateObject _state = null;
	
	public MemeBuffer(IStateObject state){
		_state = state;
	}
	
	@Override
	public final boolean hasNext(){
		return !_queue.isEmpty() || updateWaitingQueue();
	}
	
	@Override
	public final Meme getNext(){
		if(!_queue.isEmpty() || updateWaitingQueue())
			return _queue.remove();
		return null;
	}
	
	@Override
	public final Iterable<Meme> getNext(int n){
		List<Meme> lst = new ArrayList<Meme>();
		for(int i=0;i<n && hasNext();i++)
			lst.add(getNext());
		return lst;
	}
	
	/*
	 * Returns true if after update queue is NOT empty
	 */
	private final boolean updateWaitingQueue(){
		Iterable<Meme> it = downloadMemes();
		for(Meme m : it) 
			_queue.add(m);
		
		return !_queue.isEmpty();
	}
	
	/*
	 * Specialied buffer should implement this
	 */
	protected Iterable<Meme> downloadMemes(){
		return null;
	}
}