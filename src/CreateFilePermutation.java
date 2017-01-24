import util.RandomPermutation;
import util.ReadTextFile;
import util.WriteTextFile;
import util.Keyboard;
import java.util.ArrayList;


public class CreateFilePermutation
{
	public static void main(String[] args)
	{
		//DO THIS
		//use the Keyboard class to obtain the upper integer value
		upper=readInt("Enter an upper value: ");
		
		//DO THIS
		//obtain the random permutation using the upper integer value
		//write out the values to a text file (close the file)
		
		WriteTextFile file=new WriteTextFile("resources/brass_deck_shuffle.txt");
		
		RandomPermutation perm=new util.RandomPermutation(upper,upper);
		
		//walk through and write to file
		while(perm.hasNext())
		{
			file.writeLine(perm.next());
		}
		
		close();
		
		//DO THIS
		//read the values in from the text file and store them in an integer array
		//it is easiest to read the first line outside of a while loop that tests for EOF
		int cards;
		
		ReadTextFile file=new ReadTextFile("resources/brass_deck_shuffle.txt");
		
		int i=0;
		cards[i]=Integer.parseInt(readLine())
		while(!EOF())
		{
			i++;
			cards[i]=Integer.parseInt(readLine());
		}
		
		close();
		
		
		//DO THIS
		//sort the integers (use java.util.Arrays.sort)
		//print them out to make sure they are all there once
		java.util.Arrays.sort(cards);
		for(int i=0;i<upper;i++)
		{
			System.out.println(cards[i])
		}
		
		
	}
}