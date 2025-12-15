import java.io.File;
//Objective: To find the size of the given file.
class FileSizeEaxmple{
	public static void main(String arg[])
	{
	String filePath="file.txt";
	File file=new File(filePath);
	long fileSize=file.length();
	System.out.println(fileSize);
	}
}
