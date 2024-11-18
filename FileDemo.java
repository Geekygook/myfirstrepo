import java.io.File;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class FileDemo
{
	public static void main(String args[])
	{
		Scanner br=new Scanner(System.in);
		DateFormat sdf=new SimpleDateFormat("MMMM dd, YYYY hh:mma");
		System.out.println("Enter the file name:");
		String FileName=br.nextLine();
		File f=new File(FileName);
		String extension=null;
		if(f.isDirectory())
		{
			System.out.println(f.getName()+" is a directory");
			System.out.println("Directory size: "+f.length()+" bytes");
			System.out.println("File last Modified: "+sdf.format(f.lastModified()));
			System.out.println("List of Files");
			String []dir=f.list();
			for(int i=0;i<dir.length;i++)
			{
				System.out.println(dir[i]);
			}
		}
			else if (f.isFile())
			{
				int i=FileName.lastIndexOf(".");
				if(i>0)
				{
					extension=FileName.substring(i+1);
				}
				System.out.println("File Type: "+extension);
				System.out.println(f.getName()+" :is a File");
				if(f.canRead())
				{
					System.out.println(FileName+" :file is readable");
				}
				else
				{
					System.out.println(FileName+" :file i not readable");
				}
				if(f.canWrite())
				{
					System.out.println(FileName+" :file is writable");
				}
				System.out.println("Filesize: "+f.length()+" bytes");
				System.out.println("Last Modified: "+sdf.format(f.lastModified()));
			}
			else
			{
				System.out.println(f.getName()+" file doesn't exist");
			}
		}
	}



			
