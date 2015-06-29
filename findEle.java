/*
Find Element in sorted matrix
Written by  Phuong H. Hoang on June 12, 2015
Given: MxN matrix in which each row and column 
is sorted.
Find location of a given element.
*/

//%%%%%%%%% PHUONG H. HOANG %%%%%%%%%%//
//%%%%%%%%% COPY RIGHT      %%%%%%%%%%//

import java.util.*;
import java.io.*;
import java.util.Random; 

public class findEle
{
    private static int[] findElement(int[][] sortedMatrix, int x, int row, int column)
        {
	    column = column -1;
	    row = row - 1;
	    // int currentPoint = sortedMatrix[0][0];
	    int m = 0;
	    int n = 0;
	    int[] location = new int[2];
	    boolean findOut = false;

	     if(sortedMatrix[m][n] == x)
			{
			    location[0] = m+1;
			    location[1] = n+1;
			    findOut = true;
			    return location;
			}

	    while ((findOut == false) && (m < row) && ( n < column))
		{		   
		    while ((sortedMatrix[m][n] < x) && (n<column))
			{
			    n +=1;
			    if(sortedMatrix[m][n] == x)
				{
				    location[0] = m+1;
				    location[1] = n+1;
				    findOut = true;
				    return location;
				}
			}

		    if (sortedMatrix[m][n] > x)
			{ 
			    n -=1;
			}

		    while ((sortedMatrix[m][n] < x) && (m<row))
			{
			    m +=1;
			    if(sortedMatrix[m][n] == x)
				{
				    location[0] = m+1;
				    location[1] = n+1;
				    findOut = true;
				    return location;
				}
			}

		    if (sortedMatrix[m][n] > x)
			{ 
			    m -=1;
			}
	        }
	    if (findOut == false)
		{
		    System.out.println("There is no needed element");
		}
	    return null;
        }
    
    public static void main (String[] args) throws java.lang.Exception
        {

	    int value ;
	    int replaceValue = 1;
	    int row = 26; // number of column
	    int column = 26; // number of column
	    int[][] sortedMatrix = new int[row][column];
	    for (int m = 0; m < row; m ++)
		{
		    value = replaceValue;// replace value to be sorted matrix
		    for(int n = 0; n < column; n ++)
		   {
		       //Random rand = new Random();
		       //int n = rand.nextInt(100) + 1;
		       sortedMatrix[m][n] = value;
		       value += 1;
		   }
		    replaceValue = value - 25;
		}
	    
	    Random rand = new Random();
	    int ele = rand.nextInt(100) + 1;
	    int[] location = new int[2];
	    location = findElement(sortedMatrix,ele,row,column);
	    if (location != null)
		{
		    System.out.println(Integer.toString(ele));
		    System.out.println("Row: "+ Integer.toString(location[0]) + " and " + "Column: " +Integer.toString(location[1]));
		}
	    
	    //System.out.println(Integer.toString(sortedMatrix[1][1]));
	}
}

//Phuong H. Hoang
