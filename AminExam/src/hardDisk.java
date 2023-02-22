
public class hardDisk {
	
	double space_available;
	String brand_name;
	
	hardDisk(double size)
	{
		this.space_available = size;
	}

	public static void main(String[] args) 
	{
		hardDisk hd = new hardDisk(500);
		hd.save_file(100);
	}

}
