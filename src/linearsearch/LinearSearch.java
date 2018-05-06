/*
 * This is a program used to show how a linear search would work and how a 
 * sorted search would work.
 */

package linearsearch;

/**
 *
 * @author wilheld
 */
public class LinearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String [] myArray = {"red", "green", "yellow", "purple", "orange", "brown"};
       String [] mySortedArray = {"blue", "brown", "green", "orange", "purple", "red", "yellow"};

       //Search the unsorted array in order for a specific String.
       System.out.println("Sequential search: green " + linearSearch(myArray, "green"));
       System.out.println("Sequential search: orange " + linearSearch(myArray, "orange"));
       System.out.println("Sequential search: pink "+ linearSearch(myArray, "pink"));

       //Search through the sorted array ufor a specific String.
       System.out.println("Sorted sequential search: green " + sortedLinearSearch(mySortedArray, "green"));
       System.out.println("Sorted sequential search: orange " + sortedLinearSearch(mySortedArray, "orange"));
       System.out.println("Sorted sequential search: pink " + sortedLinearSearch(mySortedArray, "pink"));

    }
    
    /* This method searches through an array, in order, until a specific item is
     * found.  If it is found, true is returned, otherwise, false is returned.
    */
    static public Boolean linearSearch(String [] A, String B) {
        for (int k=0; k<A.length; k++) {  //Go through the entire array until it's end.
            if (A[k].equals(B)) {  //Check if item has been found.
                return true;
           }
        }
        return false; //Item was not found.
    }

    /* This method searches through an array, in order, until a specific item is
     * found.  If at any point, the item is greater than the currently checked item, 
     * since it cannot be any lower in the array.
    */
    static public Boolean sortedLinearSearch (String [] A, String B) {
        for (int k=0; k<A.length; k++) {  //Begin to go through the array.
            int compare = A[k].compareTo(B); //Compare the current string to what we are looking for.
            if (compare == 0) { //compareTo returns 0 if the items match
                return true;
            }
            if (compare > 0) { //compareTo returns a value larger than 0 if the item is too big.
                return false;  //The item searched for can no longer be in this array.
            }
        }
        return false;
    }
}
