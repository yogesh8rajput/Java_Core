import java.io.File;

class FileSizeEaxmple{
	public static void main(String arg[])
	{
	String filePath="file.txt";
	File file=new File(filePath);
	long fileSize=file.length();
	System.out.println(fileSize);
	}
}