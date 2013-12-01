package pl.edu.uj.tcs.memoizer.plugins;

import java.net.*;
import java.nio.file.Path;
import java.awt.Image;

import org.apache.commons.io.FilenameUtils;

/*
 * Describes Meme
 * @author pmikos (sokar92) 
 */
public class Meme {
	//links
	private URL _imageLink;
	private URL _pageLink;
	
	//description
	private String _title;
	private String _desc;
	
	//meme size
	private int _width;
	private int _heigth;
	
	//image
	private Image _image;
	
	//owner
	//private IPlugin _owner;
	private IPluginFactory _pluginFactory;
	
	//viewType
	private EViewType _viewType;
	
	//Meme identification
	private Integer _id;
	
	
	
	/**
	 * Instantiates new Meme linked to given owner
	 */
	public Meme(IPluginFactory pluginFactory, Meme meme){
		this(meme.getImageLink(), meme.getPageLink(),
				meme.getTitle(), meme.getDescription(),
				meme.getWidth(), meme.getHeight(),
				meme.getImage(), meme.getViewType(), meme.getPluginFactory());
		_pluginFactory = pluginFactory;
	}
	
	/**
	 * Instantiates new Meme linked to specific URL
	 * with given title, description and size
	 */
	public Meme(URL imageUrl, URL pageUrl, 
			String title, String description, 
			int width, int heigth,
			Image image, EViewType viewType, IPluginFactory pluginFactory)
	{
		_imageLink = imageUrl;
		_pageLink = pageUrl;
		_title = title == null ? "" : title;
		_desc = description == null ? "" : description;
		_width = width;
		_heigth = heigth;
		_image = image;
		_viewType = viewType;
		_pluginFactory = pluginFactory;
	}
	
	@Override
	public boolean equals(Object obj){
		if(_imageLink == null && obj == null) return true;
		if(_imageLink == null || obj == null) return false;
		return _imageLink.equals(obj);
	}
	
	@Override
	public int hashCode(){
		if(_imageLink == null) return 0;
		return _imageLink.hashCode();
	}

	/*
	 * Returns URL to image linked with Meme
	 */
	public URL getImageLink(){
		return _imageLink;
	}
	
	/*
	 * Returns URL to Meme base page
	 * may be null if not defined!
	 */
	public URL getPageLink(){
		return _pageLink;
	}
	
	/*
	 * Returns Meme title if defined,
	 * otherwise empty string
	 */
	public String getTitle(){
		return _title;
	}
	
	/*
	 * Returns Meme description if defined,
	 * otherwise empty string
	 */
	public String getDescription(){
		return _desc;
	}
	
	/*
	 * Returns meme image width
	 */
	public int getWidth(){
		return _width;
	}
	
	/*
	 * Returns meme image heigth
	 */
	public int getHeight(){
		return _heigth;
	}
	
	/*
	 * Returns downloaded image
	 */
	public Image getImage(){
		return _image;
	}
	
	/*
	 * Sets downloaded image
	 */
	public void setImage(Image img){
		_image = img;
	}
	
	/**
	 * Setter for pluginFactory field. This method take effects only once!!!
	 * @param pluginFactory
	 */
	public void setPluginFactory(IPluginFactory pluginFactory) {
		if(_pluginFactory==null)
		_pluginFactory = pluginFactory;
	}
	
	/*
	 * Returns type of view 
	 */
	public EViewType getViewType() {
		return _viewType;
	}
	
	public IPluginFactory getPluginFactory(){
		return this._pluginFactory;
	}
	
	/**
	 * Return suggested file name when meme is saving on disk.
	 * @return
	 * @author pkubiak
	 */
	public String getSuggestedFileName(){
		String fileName = "";
		if(this._pluginFactory!=null)//append service name
			fileName += this._pluginFactory.getServiceName().toLowerCase();
		
		if(this._id!=null)//append id
			fileName += (fileName.length()>0?"-":"")+this._id.toString();
		
		if(this._title!=null)
			fileName += (fileName.length()>0?"-":"")+this._title.replaceAll("[^ a-zA-Z0-9]+","-")+"-";
		
		fileName += '.'+FilenameUtils.getExtension(this._imageLink.toString());
		
		return fileName;
	}

	/**
	 * 
	 */
	public int getId(){
		return this._id;
	}
}

