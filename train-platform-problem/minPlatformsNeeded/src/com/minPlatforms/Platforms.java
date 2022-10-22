package com.minPlatforms;

/// Done by Jetson Cyrus J
/// dated 03-06-2022

/// If you have any optimal solution then you can share

/// This is used to find minimum number of platforms needed for Trains using
/// arrival and departure times

import java.util.Arrays;
import java.util.Scanner;

public class Platforms {
    public static void main(String[] args) {
        int n, m;
        Scanner s = new Scanner(System.in);
        System.out.println("\n ---- Train Problem -----\n");

        // getting arrival times
        System.out.print("\nEnter number of arrival times: ");
        n = s.nextInt();
        float[] arr = new float[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextFloat();

        // getting departure times
        System.out.print("\nEnter number of departure times: ");
        m = s.nextInt();
        float[] dArr = new float[m];
        for (int i = 0; i < m; i++)
            dArr[i] = s.nextFloat();

        // sorting arrays
        Arrays.sort(arr);
        Arrays.sort(dArr);

        // code
        int i = 0, j = 0, platforms = 0, available = 0, minPlatformsNeeded = -1;
        while(true){
            if (i >= n || j >= m)
                break;
            if (arr[i] < dArr[j])
            {
                if (available == 0){
                    platforms++;
                }
                else {
                    available--;
                }
                System.out.println("\n Train arrived at " + arr[i] + " on platform " + (platforms - available));
                i++;
            }
            else {
                System.out.println("\n Train departed at " + dArr[j] + " on platform " + (platforms - available));
                j++;
                available++;
            }
            if (minPlatformsNeeded < platforms)
                minPlatformsNeeded = platforms;
        }
        System.out.println("\n Minimum platforms: " + minPlatformsNeeded);
    }
}
