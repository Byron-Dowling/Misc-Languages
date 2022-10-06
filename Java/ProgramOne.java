/** 
    @author:    Byron Dowling
    Assignment: Programming Assignment #1
    Course:     CMPS 4143 Contemporary Programming Languages
    Date:       9/15/21

    Program Description:

        ***Original Assignment Instructions***

        1. Given an array with 20 elements, find the largest and smallest number. – 20 points

        2. Given an array X = {10, 100, 40, 28, 98, 37, 12, 63}. – 30 points
            a. Copy the array in a different variable Y.
            b. Sort the array in descending order and print the array.
            c. Calculate the AVG value of the elements and insert it to array Y on it’s correct position,
            print it.
            d. Perform comparison between Y and X. If not same, perform delete operation to make it
            same

        3. You are given a string S = "Before trying to do any of the steps below, you should read the article
        through at least once for basic understanding. Then go back and review, following these steps.
        He ran his machine up to the stone porch and ascending the steps rang the door bell. They
        directed their steps toward the sea, which was lit up by the rising moon. She breathed a sigh of
        relief, and her light steps fell gradually into the measure of his. This was fully four feet under
        water and the lower story of the place was two steps lower down."
        Find 5 high frequency words using several array operations. – 20 Points

        4. You are given a string S = "this is my first programming assignment". Print the words in a reverse
        order like "assignment programming first my is this" using array. –30 points

*/

import java.io.*;
import java.util.Arrays;

public class ProgramOne 
{       
        
    /*
  $$$$$$\            $$\           $$\                                      $$\     
 $$  __$$\           \__|          $$ |                                     $$ |    
 $$ /  $$ |$$\   $$\ $$\  $$$$$$$\ $$ |  $$\  $$$$$$$\  $$$$$$\   $$$$$$\ $$$$$$\   
 $$ |  $$ |$$ |  $$ |$$ |$$  _____|$$ | $$  |$$  _____|$$  __$$\ $$  __$$\\_$$  _|  
 $$ |  $$ |$$ |  $$ |$$ |$$ /      $$$$$$  / \$$$$$$\  $$ /  $$ |$$ |  \__| $$ |    
 $$ $$\$$ |$$ |  $$ |$$ |$$ |      $$  _$$<   \____$$\ $$ |  $$ |$$ |       $$ |$$\ 
 \$$$$$$ / \$$$$$$  |$$ |\$$$$$$$\ $$ | \$$\ $$$$$$$  |\$$$$$$  |$$ |       \$$$$  |
  \___$$$\  \______/ \__| \_______|\__|  \__|\_______/  \______/ \__|        \____/ 
      \___|                                                                                                                                                                                                                                         
*/
    
    static void swap_values(int[] nums, int i, int j)                       // Performing the swap of elements for quick sorting
    {
        int temp_var = nums[i];                                             // Temp holds the larger value
        nums[i] = nums[j];                                                  // The smaller array index takes the smaller value

        nums[j] = temp_var;                                                 // The larger index takes the larger value stored in temp
    }
    

    static int partition(int[] nums, int smallest, int largest)
    {
        int pivot_point = nums[largest];                                    // Declaring the pivot and setting to the last element in the array (random)
        
        int index_small = (smallest - 1);                                   // Index of the smaller element
    
        for(int j = smallest; j <= largest - 1; j++)
        {
            if (nums[j] < pivot_point)                                      // If our value is less than the pivot point, we swap
            {
                index_small++; 
                swap_values(nums, index_small, j);
            }
        }

        swap_values(nums, index_small + 1, largest);
        return (index_small + 1);
    }
    

    static void Sort(int[] nums, int smallest, int largest)
    {
        if (smallest < largest)                                             // While we arean't at the end of the array
        {
            int part_int = partition(nums, smallest, largest);
    
            Sort(nums, smallest, part_int - 1);                             // Quicksort-ing the left side of our partition point
            Sort(nums, part_int + 1, largest);                              // Quicksort-ing the right side of our partition point
        }
    }



    /*
  $$$$$$\                                  $$\     $$\                             $$\ $$\    $$\   
 $$  __$$\                                 $$ |    \__|                            $$ \$$ \ $$$$ |  
 $$ /  $$ |$$\   $$\  $$$$$$\   $$$$$$$\ $$$$$$\   $$\  $$$$$$\  $$$$$$$\        $$$$$$$$$$\\_$$ |  
 $$ |  $$ |$$ |  $$ |$$  __$$\ $$  _____|\_$$  _|  $$ |$$  __$$\ $$  __$$\       \_$$  $$   | $$ |  
 $$ |  $$ |$$ |  $$ |$$$$$$$$ |\$$$$$$\    $$ |    $$ |$$ /  $$ |$$ |  $$ |      $$$$$$$$$$\  $$ |  
 $$ $$\$$ |$$ |  $$ |$$   ____| \____$$\   $$ |$$\ $$ |$$ |  $$ |$$ |  $$ |      \_$$  $$  _| $$ |  
 \$$$$$$ / \$$$$$$  |\$$$$$$$\ $$$$$$$  |  \$$$$  |$$ |\$$$$$$  |$$ |  $$ |        $$ |$$ | $$$$$$\ 
  \___$$$\  \______/  \_______|\_______/    \____/ \__| \______/ \__|  \__|        \__|\__| \______|
      \___|                                                                                                                                                                                                                                                                                          
*/

    static void firstTest()
    {
        int[] Number_List1 = new int [20];               // Array Declaration of size 20

        int Length1 = Number_List1.length;               // Grabbing the length of our first array

        int min = 0;                                     // Min value used in random number generation
        int max = 100;                                   // Max value used in random number generation


        /*
            Random number generation to fill our array with random numbers between 0 and 100.
            The loop will loop through the size of the array, a temp int stores the random number
            generated and then that result is assignmed to the array with the current index.
        */

        for (int i = 0; i < Length1; i++)
        {
            // Generating a random number between 0 and 100
            int temp = (int)Math.floor(Math.random()*(max - min + 1) + min);

            // Assigning that variable to our first array
            Number_List1[i] = temp;
        }

                                                                    // Both initialized to the first value in the array
        int largest = Number_List1[0];                              // To keep track of smallest value in the array
        int smallest = Number_List1[0];                             // To keep track of largest value in the array


        for (int i = 1; i < Length1; i++)                 
        {
            if (Number_List1[i] < smallest)                         // If the current value is smaller than the current smallest
            {
                smallest = Number_List1[i];                         // Update smallest to the new smaller value
            }

            if (Number_List1[i] > largest)                          // If the current value is larger than the current one
            {
                largest = Number_List1[i];                          // Update largest to the new bigger value
            }
        }

        System.out.println("Smallest number is "+smallest);
        System.out.println("Largest number is "+largest);
    }



    /*
  $$$$$$\                                  $$\     $$\                             $$\ $$\    $$$$$$\  
 $$  __$$\                                 $$ |    \__|                            $$ \$$ \  $$  __$$\ 
 $$ /  $$ |$$\   $$\  $$$$$$\   $$$$$$$\ $$$$$$\   $$\  $$$$$$\  $$$$$$$\        $$$$$$$$$$\ \__/  $$ |
 $$ |  $$ |$$ |  $$ |$$  __$$\ $$  _____|\_$$  _|  $$ |$$  __$$\ $$  __$$\       \_$$  $$   | $$$$$$  |
 $$ |  $$ |$$ |  $$ |$$$$$$$$ |\$$$$$$\    $$ |    $$ |$$ /  $$ |$$ |  $$ |      $$$$$$$$$$\ $$  ____/ 
 $$ $$\$$ |$$ |  $$ |$$   ____| \____$$\   $$ |$$\ $$ |$$ |  $$ |$$ |  $$ |      \_$$  $$  _|$$ |      
 \$$$$$$ / \$$$$$$  |\$$$$$$$\ $$$$$$$  |  \$$$$  |$$ |\$$$$$$  |$$ |  $$ |        $$ |$$ |  $$$$$$$$\ 
  \___$$$\  \______/  \_______|\_______/    \____/ \__| \______/ \__|  \__|        \__|\__|  \________|
      \___|                                                                                                                                                                                                                                                                                                    
*/

    static void secondTest()
    {
        int[] X = {10, 100, 40, 28, 98, 37, 12, 63};
        int[] Y = new int[X.length];                         


        int size = X.length + 1;                                   // Making an array size of +1 to accomodate the avg case
        int[] Temp = new int[size];                          


        System.out.println("\nThe results of the Y array is");     // Sanity check to make sure the Y has the contents of X
        for (int i = 0; i < X.length; i++)
        {
            Y[i] = X[i];
            System.out.print(Y[i] + " ");
        }


        Sort(Y, 0, (Y.length - 1));                                 // Sort the results

        System.out.println("\n\nPrinting Y in descending order:");  // Printing in descending order
        for (int i = 0; i < Y.length; i++)
        {
            System.out.print(Y[Y.length - 1 - i] + " ");            // Index starts from back - 1 - i to print in reverse
        }
            

        int avg = 0;                                                // Metrics to calculate the average
        int running_total = 0;

        System.out.println("\n"); 
        for (int i = 0; i < X.length; i++)
        {
            running_total += X[i];                                  // Running total of X values
        }

        avg = (running_total / X.length);                           // Divide running total by length of x to get average

        System.out.println("The average of X is: " + avg);



        for (int i = 0; i < Y.length; i++)                          // Filling temp array with Y values
        {
            Temp[i] = Y[i];
        }
        

        Temp[Temp.length -1] = avg;                                 // Adding the average to the Temp array in the last index

        System.out.println("\nThe new results of Y is:");           // Printing the sorted results of Y
        for (int i = 0; i < Temp.length; i++)
        {
            System.out.print(Temp[i] + " ");
        }


        Sort(Temp, 0, Temp.length - 1);                             // Sort the joined array result
        Sort(X, 0, X.length - 1);                                   // Sorting X for better line for line comparison

        Y = new int[Temp.length];                                   // Redeclaring Y to have the new length as the Temp array that hold the avg
        Y = Temp;


        System.out.println("\n");                                   // Printing the results of the Joined array Y
        for (int i = 0; i < Y.length; i++)
        {
            System.out.print(Y[i] + " ");
        }


        int trim_by = 0;


        /*
            Looping through to see how much longer Y is than X so we know how much to trim it by. A boolean
            is used to determine if matching results are found and if the result is not found, the trim by
            matric is updated which will be used later to trim Y to the correct size.
        */

        for (int i = 0; i < Y.length; i++)
        {
            int var = Y[i];
            boolean found = false;

            for (int j = 0; j < X.length; j++)
            {
                if (var == X[j])                                    // If found in both arrays, break off early
                {
                    found = true;
                    break;
                }
            }

            if (!found)                                             // If the result is not in both arrays, increase trim by
            {
                trim_by++;
            }
        }


        Y = new int[Temp.length - trim_by];                         // Determining new length for Y
        Y = X;                                                      // Assigning the values of X back to Y now that the size is correct




        System.out.println("\n\nFinal result of Y:");               // Printing the final result Y after removing duplicates
        for (int i = 0; i < Y.length; i++)
        {
            System.out.print(Y[i] + " ");
        }
    }



    /*
  $$$$$$\                                  $$\     $$\                             $$\ $$\    $$$$$$\  
 $$  __$$\                                 $$ |    \__|                            $$ \$$ \  $$ ___$$\ 
 $$ /  $$ |$$\   $$\  $$$$$$\   $$$$$$$\ $$$$$$\   $$\  $$$$$$\  $$$$$$$\        $$$$$$$$$$\ \_/   $$ |
 $$ |  $$ |$$ |  $$ |$$  __$$\ $$  _____|\_$$  _|  $$ |$$  __$$\ $$  __$$\       \_$$  $$   |  $$$$$ / 
 $$ |  $$ |$$ |  $$ |$$$$$$$$ |\$$$$$$\    $$ |    $$ |$$ /  $$ |$$ |  $$ |      $$$$$$$$$$\   \___$$\ 
 $$ $$\$$ |$$ |  $$ |$$   ____| \____$$\   $$ |$$\ $$ |$$ |  $$ |$$ |  $$ |      \_$$  $$  _|$$\   $$ |
 \$$$$$$ / \$$$$$$  |\$$$$$$$\ $$$$$$$  |  \$$$$  |$$ |\$$$$$$  |$$ |  $$ |        $$ |$$ |  \$$$$$$  |
  \___$$$\  \______/  \_______|\_______/    \____/ \__| \______/ \__|  \__|        \__|\__|   \______/ 
      \___|                                                                                                                                                                                                                                                                                                 
*/

    static void thirdTest()
    {
        String S = "Before trying to do any of the steps below, you should read the article "
        + "through at least once for basic understanding. Then go back and review, following these steps. "
        + "He ran his machine up to the stone porch and ascending the steps rang the door bell. They "
        + "directed their steps toward the sea, which was lit up by the rising moon. She breathed a sigh of "
        + "relief, and her light steps fell gradually into the measure of his. This was fully four feet under "
        + "water and the lower story of the place was two steps lower down.";

        
        System.out.println("\n");
        System.out.println(S);

        /* 
            Splitting the string above into a string array which takes place by looking for the new
            string deliminator. Later below we will strip out unnecessary punction marks and spaces.
            Additionally we need two parallel arrays to keep track of the words and the occurances of
            said words. For ease of useability and incase of the odd chance that the sentence has no
            repeating words, both are declared with the length of the number of strings split from
            the original string. In other words if there are 93 words in our string array, our two 
            parallel arrays will also be of length 93 just in case the sentence had 93 unique words.
        */

        String[] words = S.split("\\s");

        String[] Top_Words = new String[words.length];                                      // Parallel String array to keep track of top words

        int[] occurances = new int[words.length];                                           // Parallel Int array to keep track of occurances

        int Count = 0;                                                                      // Count variable for occurances


        for (int i = 0; i < words.length; i++)
        {            

            boolean found = false;

            for (int j = 0; j < Count; j++)
            {         
                if (words[i].replaceAll("[.,;]", "").equalsIgnoreCase(Top_Words[j]))        // Stripping out unnecessary punctuation
                {                                                    
                    occurances[j] += 1;                                                     // Running total of matches
                    found = true;
                }                                                    
            }

            if (!found)                                                                     // If no matches
            {                                                       
                Top_Words[Count] = words[i].replaceAll("[.,;]", "");
                occurances[Count] = 1;
                Count += 1;
            }
        }

        /*
            Swapping or bubbling up the top results for occurances and top words so
            that the we have parallel indexes that correspond to the word and its 
            number of occurances. Similar to the sorting algorithm above, we use
            a dummy temp variable for both to switch around indexes that are judged
            to be less occuring than results further down the array.
        */

        for (int i = 0; i < Count; i++)
        {                                                            
            for (int j = 0; j < Count - i - 1; j++)
            {                                        
            
                if (occurances[j] < occurances[j + 1])                 
                {                                   
                    int temp = occurances[j];
                    occurances[j] = occurances[j + 1]; 

                    occurances[j + 1] = temp;
                    String temporary = Top_Words[j];

                    Top_Words[j] = Top_Words[j + 1];
                    Top_Words[j + 1] = temporary;
                }                                                    
            }
        } 

        System.out.println("\n\nThe 5 Most Frequent words are: ");

        for (int i = 0; i < 5; i++)
        {
            System.out.println(i + 1 + ". " + Top_Words[i] + " (which occured " + occurances[i] + " times.)");
        }  




    }



    /*
  $$$$$$\                                  $$\     $$\                             $$\ $$\   $$\   $$\ 
 $$  __$$\                                 $$ |    \__|                            $$ \$$ \  $$ |  $$ |
 $$ /  $$ |$$\   $$\  $$$$$$\   $$$$$$$\ $$$$$$\   $$\  $$$$$$\  $$$$$$$\        $$$$$$$$$$\ $$ |  $$ |
 $$ |  $$ |$$ |  $$ |$$  __$$\ $$  _____|\_$$  _|  $$ |$$  __$$\ $$  __$$\       \_$$  $$   |$$$$$$$$ |
 $$ |  $$ |$$ |  $$ |$$$$$$$$ |\$$$$$$\    $$ |    $$ |$$ /  $$ |$$ |  $$ |      $$$$$$$$$$\ \_____$$ |
 $$ $$\$$ |$$ |  $$ |$$   ____| \____$$\   $$ |$$\ $$ |$$ |  $$ |$$ |  $$ |      \_$$  $$  _|      $$ |
 \$$$$$$ / \$$$$$$  |\$$$$$$$\ $$$$$$$  |  \$$$$  |$$ |\$$$$$$  |$$ |  $$ |        $$ |$$ |        $$ |
  \___$$$\  \______/  \_______|\_______/    \____/ \__| \______/ \__|  \__|        \__|\__|        \__|
      \___|                                                                                                                                                                                                                                                                                                
*/

    static void fourthTest()
    {
        String S = "this is my first programming assignment";               // Grab the message

        String[] words = S.split("\\s");                                    // Split the message into a string array

        /*
            Very similar to how I sorted my array's and then to print them in descending order
            I started from the back and printed while looping to the front. Here we are looping
            through the length of words and the index we are printing is the length of words - 1
            - i. So when i first starts as 0, then starting index is length of words - 1, and then
            as i increases, the index to print decreases and moves us closer to the front.
        */

        for (int i = 0; i < words.length; i++)                              
        {
            System.out.print(words[words.length-1-i] + " ");
        }
    }



/*
 $$\      $$\           $$\           
 $$$\    $$$ |          \__|          
 $$$$\  $$$$ | $$$$$$\  $$\ $$$$$$$\  
 $$\$$\$$ $$ | \____$$\ $$ |$$  __$$\ 
 $$ \$$$  $$ | $$$$$$$ |$$ |$$ |  $$ |
 $$ |\$  /$$ |$$  __$$ |$$ |$$ |  $$ |
 $$ | \_/ $$ |\$$$$$$$ |$$ |$$ |  $$ |
 \__|     \__| \_______|\__|\__|  \__|                                                     
*/


    public static void main(String[] args)                                  // Main Function
    {
        System.out.println("\n\nQuestion #1");
        firstTest();                                                        // Calling the first function for Question #1

        System.out.println("\n\nQuestion #2");
        secondTest();                                                       // Calling the second function for Question #2

        System.out.println("\n\nQuestion #3");
        thirdTest();                                                        // Calling the third function for Question #3

        System.out.println("\n\nQuestion #4");
        fourthTest();                                                       // Calling the fourth function for Question #4
    }
    
}
