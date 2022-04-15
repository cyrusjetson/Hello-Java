package com.javapgm;

import java.util.*;

public class JavaPgm {
    public static void main(String[] args) {

       // 1. String dynamic memory allocation
       String color[] = new String[4];
       color[0] = "yellow";
       color[1] = "black";
       color[2] = "white";
       color[3] = "pink";
       System.out.println(Arrays.toString(color));

       // 2. for loop
       for (String colorSpecific : color) {
           System.out.println(colorSpecific);
       }
       System.out.println("bye");

       // 3. for each very imp ---
       Arrays.stream(color).forEach(System.out::println);

       // 4. 2D array
       char[][] board = new char[3][3];
       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
               board[i][j] = '-';
           }
        }

        // 5. 2D array another method
        char[][] boardTwo = new char[][] {
                new char[] {'-','-','-'},
                new char[] {'-','-','-'},
                new char[] {'-','-','-'}
        };

        // 6. 2D array display
        System.out.println(Arrays.deepToString(board));

        // 7. Lists // basically arrays
        List colors = new ArrayList();
        colors.add("blue");
        colors.add("yellow");
        colors.add(3);
        colors.add(new Object());

        // 8. List another method
        List<String> colors1 = new ArrayList();
        colors1.add("blue");
        colors1.add("yellow");
        // colors1.add(3);   ---- error
        // colors1.add(new Object());   ---- error
        System.out.println(colors1.contains("hai"));

////       both are possible
        for (String colorTemp : colors1)
        {
            System.out.println(colorTemp);
        }
        colors1.forEach(System.out::println);
    // 9. List another method -- immutable
         List<String> colorsUnmodified = List.of(
                 "blue",
                 "black",
                 "yellow"
         );

    }
    static record Person(String name, int age){}
}
