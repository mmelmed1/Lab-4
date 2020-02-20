/** 
*The purpose of this class is to model a television
*Matt Melmed
*2/19/20
*/
public class Television {
	
	//Manufacturer of the TV
	private final String MANUFACTURER;
	//Size of the screen
	private final int SCREEN_SIZE;
	//Whether the TV is on or off
	private boolean powerOn;
	//What channel number it is on
	private int channel;
	//What the volume number it is on
	private int volume;
	
	//Collects the  manufacturer and the screen size and initializes three fields
	public Television(String manufacturer, int screen_size)
	{
		this.MANUFACTURER = manufacturer;
		this.SCREEN_SIZE = screen_size;
		powerOn = false;
		channel = 2;
		volume = 20;
		
	}
	public int getVolume() 
	{
		return volume;
	}
	public int getChannel()
	{
		return channel;
	}
	public String getManufacturer() 
	{
		return MANUFACTURER;
	}
	public int getScreenSize()
	{
		return SCREEN_SIZE;
	}
	public void setChannel(int channel)
	{
		this.channel=channel;
	}
	public void power() 
	{
		powerOn = !powerOn;
	}
	public void increaseVolume()
	{
		volume = volume+1;
	}
	public void decreaseVolume()
	{
		volume = volume-1;
	}

}
