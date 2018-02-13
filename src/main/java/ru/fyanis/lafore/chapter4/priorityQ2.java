package ru.fyanis.lafore.chapter4;


class PriorityQ2 {
   private int maxSize;
   private long[] queArray;
   private int nItems;

   public PriorityQ2(int s) {
      maxSize = s;
      queArray = new long[maxSize];
      nItems = 0;
   }

   public void insert(long item) {
      queArray[nItems++] = item;
   }

   public long remove() {
      long max = 0;
      int index = 0;
      for (int i = 0; i < nItems; i++) {
         if (queArray[i] > max) {
            max = queArray[i];
            index = i;
         }
      }
      for (int i = index; i < nItems; i++) {
         queArray[i] = queArray[i + 1];
      }
      nItems--;
      return max;
   }

   public long peekMin() { return queArray[nItems-1]; }

   public boolean isEmpty()  { return (nItems==0); }

   public boolean isFull()
      { return (nItems == maxSize); }

   }


class PriorityQApp2 {
   public static void main(String[] args) {
      PriorityQ2 thePQ = new PriorityQ2(10);
      thePQ.insert(30);
      thePQ.insert(50);
      thePQ.insert(10);
      thePQ.insert(40);
      thePQ.insert(20);

      while( !thePQ.isEmpty()) {
         long item = thePQ.remove();
         System.out.print(item + " ");
      }
      System.out.println("");
   }

}

