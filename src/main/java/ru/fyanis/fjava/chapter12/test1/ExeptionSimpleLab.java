package ru.fyanis.fjava.chapter12.test1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExeptionSimpleLab {
    public static void main(String[] args) {
        Object o = null;
        o.toString();
    }

//    public static void main(String[] args) {
//        System.out.println(0);
//        try {
//            System.out.println(1);
//            if (true) {
//                throw new NullPointerException();
//            }
//            System.out.println(2);
//        } catch (RuntimeException e) {
//            System.out.println(3);
//            if (true) {
//            }
//            System.out.println(4);
//        } finally {
//            System.out.println(5);
//            if (true) {
//                throw new Error();
//            }
//            System.out.println(6);
//        }
//    }

}

/*
 * 1)   0 1 2 5 6 (3)
 * 2)   0 1 3 4 5 6
 * 3)   0 1 2 5 (3)
 * 4)   0 1 3 5 6 (2)
 * 5)   0 1 3 5
 * 6)   0 1 2 5
 * 7)   0 1 5 6 (2)
 * 8)   0 1 2 5 (2)
 * 9)   0 1 5 (4)
 * 10)  0 1 3 5 (2)
 * 11)  0 1 3 4 5
 *
 *
 *
 *
 * throw new Error();
 * throw new NullPointerException();
 */
