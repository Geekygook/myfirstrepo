import java.util.Random;
class RandomGen extends Thread 
{
	String threadname;
	RandomGen(String str)
	{
		threadname=str;
	}
	public void run()
	{
		Random r=new Random();
		int num=r.nextInt();
		for(int i=0;i<23;i++)
		{
			System.out.println(r);
		}
	}
}
class AlphabetsAZ extends Thread
{
	String threadname;
	AlphabetsAZ(String str)
	{
		threadname=str;
	}
	public void run()
	{
		char ch;
		for(ch='A';ch<'Z';ch++)
		{
			System.out.println(ch);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
				System.out.println("Interrupted");
			}
		}
		}
	}

class Alphabetsaz extends Thread
{
	String threadname;
	Alphabetsaz(String str)
	{
		threadname=str;
	}
	public void run()
	{
		char ch;
		for(ch='a';ch<'z';ch++)
		{
			System.out.println(ch);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
				System.out.println("Interrupted");
			}
		}
	}

}
class ThreeThreadsDemo
{
	public static void main(String args[])
	{
	RandomGen t1=new RandomGen("Thread-Integer");
	AlphabetsAZ t2=new AlphabetsAZ("Thread-AZ");
	Alphabetsaz t3=new Alphabetsaz("Thread-az");
	t1.start();
	t2.start();
	t3.start();
}
}
