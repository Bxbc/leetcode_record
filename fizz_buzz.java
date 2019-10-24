package leetcode;

import java.util.ArrayList;
import java.util.List;

public class fizz_buzz {
    public List<String> fizzBuzz(int n) {
        List<String> w  = new ArrayList<>();
        for(int i=1;i<n+1;i++){
            if(i%3==0 && i%5!=0) w.add("Fizz");
            if(i%3!=0 && i%5==0) w.add("Buzz");
            if(i%3==0 && i%5==0) w.add("FizzBuzz");
            if(i%3!=0 && i%5!=0) w.add(String.valueOf(i));
        }
        return w;
    }
}
