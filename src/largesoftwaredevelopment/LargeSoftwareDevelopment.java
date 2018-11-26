/*
 * Aedrianne Kaye Malawis
 * Large Software Development
 * Novenber 22, 2018
 */

package largesoftwaredevelopment;


/**
 *
 * @author aemal4075
 */
public class LargeSoftwareDevelopment {


public static int getMaxValue(int[] numbers){
  
  int maxValue = numbers[0];
  
  for(int i=1;i < numbers.length;i++)
  {
      if(numbers[i] > maxValue){
      maxValue = numbers[i];
  }
      
  }
  return maxValue;
  }

public static int getMinValue(int[] numbers){
  
    int minValue = numbers[0];
    
    for(int i=1;i<numbers.length;i++)
    {
        if(numbers[i] < minValue){
	minValue = numbers[i];
        } 
        
  }
  return minValue;
  }    
   
/**
* @param args the command line arguments
*/

    public static void main(String[] args) {
      
    int [ ] numbers = new int [10];
    int maximum = 0 ; 
    int minimum = 0 ;
    
    for(int i = 0; i < numbers.length; i = i + 1)
        {
            numbers[i] = (int)(Math.random()*100);
            System.out.println(numbers[i]);
            
            if (numbers [i] <= minimum)
            {
              minimum = numbers[i];
              System.out.println(numbers[i] + " Is the minimum value.");
            }  
            
            if (numbers [i] > maximum)
            {
                maximum = numbers[i];
                System.out.println(numbers[i] + " Is the maximum value.");
            }
        }
    }
}