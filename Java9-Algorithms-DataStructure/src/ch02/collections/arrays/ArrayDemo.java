/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02.collections.arrays;

/**
 *
 * @author barcvilla
 */
public class ArrayDemo 
{
    // Recorrido de todos los elementos de un Array
    public static void printAllElements(int[] anIntArray)
    {
        for(int i = 0; i < anIntArray.length; i++)
        {
            System.out.print(anIntArray[i] + " ");
        }
        System.out.println();
    }
    
    public static void insertElementAtIndex(int[] array, int startIndex, int targetIndex)
    {
        int value = array[startIndex];
        if(startIndex == targetIndex)
        {
            return;
        }
        else if(startIndex < targetIndex)
        {
            for(int i = startIndex + 1; i <= targetIndex; i++)
            {
                array[i - 1] = array[i];
            }
            array[targetIndex] = value;
        }
        else
        {
            for(int i = startIndex - 1; i >= targetIndex; i--)
            {
                array[i + 1] = array[i];
            }
            array[targetIndex] = value; 
        }
    }
    
    public static void main(String[] args) {
        int[] elements = {1,3,65,2,3,2,6,2,4,65,2,256,6,7,2,4};
        printAllElements(elements);
        insertElementAtIndex(elements,5,13);
        printAllElements(elements);
    }
}
