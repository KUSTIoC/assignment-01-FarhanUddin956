public class Time{
	
	private int hours;
	private int minutes;
	private int seconds;

	Time(int hours,int minutes,int seconds)
	{
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public String toString()
	{
		return String.format("%02d:%02d:%02d",hours,minutes,seconds);
	}
}