package dev.tnordquist;

public class FizzBuzz {

  public static String[] fizzBuzz(int start, int end) {

    int n = end-start;
    String[] arr = new String[n];

    for(int i = 0; i < n; ++i) {

      if(start%15 == 0){
        arr[i] = "FizzBuzz";
        start++;
      } else if (start%3==0){
        arr[i] = "Fizz";
        start++;
      } else if (start%5==0){
        arr[i] = "Buzz";
        start++;
      } else {
        arr[i] = String.valueOf(start++);

      }

    }
    return arr;
  }

}
