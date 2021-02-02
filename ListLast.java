//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ryan Paik
//Date - 2/2/21

import java.util.List;
import java.util.ArrayList;

public class ListLast
{
	public static boolean go( List<Integer> ray)
	{
    //create an int variable that stores the last element of an arraylist
    int lastInt = ray.get(ray.size()-1);
    //use a for loop to iterate through every element except the last one
    for(int i = 0; i < ray.size() - 1; i++)
    {
      //use an if statement to check if current element is equal to last element
      if (ray.get(i) == lastInt)
      {
        //if true, return true
        return true;
      }
    }
    //if there are no duplicates after search, return false
    return false;
	}
}