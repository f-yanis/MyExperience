package ru.fyanis.lafore.chapter3;

// bubbleSort.java
// demonstrates bubble sort
// to run this program: C>java BubbleSortApp
////////////////////////////////////////////////////////////////
class ArrayBub
   {
   private long[] a;                 // ref to array a
   private int nElems;               // number of data items
//--------------------------------------------------------------
   public ArrayBub(int max)          // constructor
      {
      a = new long[max];                 // create the array
      nElems = 0;                        // no items yet
      }
//--------------------------------------------------------------
   public void insert(long value)    // put element into array
      {
      a[nElems] = value;             // insert it
      nElems++;                      // increment size
      }
//--------------------------------------------------------------
   public void display()             // displays array contents
      {
      for(int j=0; j<nElems; j++)       // for each element,
         System.out.print(a[j] + " ");  // display it
      System.out.println("");
      }
//--------------------------------------------------------------
   public void oddEvenSort(){
      int count = 0;
      long tmp;
      boolean bool = true;
      while (bool) {
         int t = count;
         for (int i = 1; i < a.length - 1; i += 2) {
            if (i % 2 != 0) {
               if (a[i] > a[i + 1]) {
                  tmp = a[i];
                  a[i] = a[i + 1];
                  a[i + 1] = tmp;
                  count++;
               }
            }
         }
         for (int i = 0; i < a.length - 1; i += 2) {
            if (i % 2 == 0) {
               if (a[i] > a[i + 1]) {
                  tmp = a[i];
                  a[i] = a[i + 1];
                  a[i + 1] = tmp;
                  count++;
               }
            }
         }
         if (t == count) {
            bool = false;
         }
      }
      System.out.println(count);
   }
//   public void bubbleSort() {
//         int outMax, outMin, in;
//
//         for (outMax = nElems - 1, outMin = 0; outMax > 1; outMax--, outMin++) {
//            for (in = 0; in < outMax; in++)
//               if (a[in] > a[in + 1])
//                  swap(in, in + 1);
//            for (int i = outMax; i > 0; i--) {
//               if (a[i] < a[i - 1])
//                  swap(i, in - 1);
//            }
//      }
//   }

//--------------------------------------------------------------
   private void swap(int one, int two)
      {
      long temp = a[one];
      a[one] = a[two];
      a[two] = temp;
      }
//--------------------------------------------------------------
   }  // end class ArrayBub
////////////////////////////////////////////////////////////////
class BubbleSortApp
   {
   public static void main(String[] args)
      {
      int maxSize = 100;            // array size
      ArrayBub arr;                 // reference to array
      arr = new ArrayBub(maxSize);  // create the array

         for (int i = maxSize; i > 0; i--) {
            arr.insert(i);
         }

      arr.display();                // display items
      long start = System.currentTimeMillis();
      arr.oddEvenSort();             // bubble sort them
      long finish = System.currentTimeMillis();
         System.out.println(finish - start);
      arr.display();                // display them again
      }  // end main()
   }  // end class BubbleSortApp
////////////////////////////////////////////////////////////////
