package ru.fyanis.lafore.chapter2;

import java.util.Arrays;

// highArray.java
// demonstrates array class with high-level interface
// to run this program: C>java HighArrayApp
////////////////////////////////////////////////////////////////
class HighArray
   {
   private long[] a;                 // ref to array a
   private int nElems;               // number of data items
   //-----------------------------------------------------------
   public HighArray(int max)         // constructor
      {
      a = new long[max];                 // create the array
      nElems = 0;                        // no items yet
      }
   //-----------------------------------------------------------
   public boolean find(long searchKey)
      {                              // find specified value
      int j;
      for(j=0; j<nElems; j++)            // for each element,
         if(a[j] == searchKey)           // found item?
            break;                       // exit loop before end
      if(j == nElems)                    // gone to end?
         return false;                   // yes, can't find it
      else
         return true;                    // no, found it
      }  // end find()
   // -----------------------------------------------------------
   public long removeMax() {
      long result = 0;
      int key = 0;
      if (a.length == 0) {
         result = -1;
      } else {
         for (int i = 0; i < a.length; i++) {
            if (a[i] > result) {
               result = a[i];
               key = i;
            }
         }
         for (int i = key; i < a.length - 1; i++) {
            a[i] = a[i + 1];
         }
         nElems--;
      }
      return result;
   }
   //-----------------------------------------------------------
   public void insert(long value)    // put element into array
      {
      a[nElems] = value;             // insert it
      nElems++;                      // increment size
      }
   //-----------------------------------------------------------
   public boolean delete(long value)
      {
      int j;
      for(j=0; j<nElems; j++)        // look for it
         if( value == a[j] )
            break;
      if(j==nElems)                  // can't find it
         return false;
      else                           // found it
         {
         for(int k=j; k<nElems; k++) // move higher ones down
            a[k] = a[k+1];
         nElems--;                   // decrement size
         return true;
         }
      }  // end delete()
   //-----------------------------------------------------------
   public void display()             // displays array contents
      {
      for(int j=0; j<nElems; j++)       // for each element,
         System.out.print(a[j] + " ");  // display it
      System.out.println("");
      }

      public void noDups() {
         int index1 = 0;
         int index2 = 1;
         while (index1 != a.length - 2) {
            if (index2 == a.length) {
               index1++;
               index2 = index1 + 1;
            }
            if (a[index1] == a[index2]) {
               a[index2] = 0;
            }
            index2++;
         }
         for (int i = 0; i < a.length-1; i++) {
            if (a[i] == 0) {
               delete(0);
            }
         }
      }
      //-----------------------------------------------------------
   }  // end class HighArray
////////////////////////////////////////////////////////////////
class HighArrayApp
   {
   public static void main(String[] args)
      {
      int maxSize = 10;            // array size
      HighArray arr;                // reference to array
      arr = new HighArray(maxSize); // create the array

      arr.insert(44);               // insert 10 items
      arr.insert(99);
      arr.insert(44);
      arr.insert(99);
      arr.insert(44);
      arr.insert(99);
      arr.insert(71);


      arr.display();                // display items

      int searchKey = 35;           // search for item
      if( arr.find(searchKey) )
         System.out.println("Found " + searchKey);
      else
         System.out.println("Can't find " + searchKey);

      arr.delete(00);               // delete 3 items
      arr.delete(55);
//      arr.delete(99);

      arr.display();                // display items again

         arr.noDups();
         arr.display();

//         long[] sortArray = new long[10];
//         for (int i = sortArray.length - 1; i > 0; i--) {
//            sortArray[i] = arr.removeMax();
//         }
//         System.out.println(Arrays.toString(sortArray));
//
//

      }  // end main()
   }  // end class HighArrayApp
