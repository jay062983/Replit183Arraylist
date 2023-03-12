package ArrayLinkList;

import java.util.ArrayList;

public class Rep185 {
    public static void main(String[] args) {
        /*   # ArrayList Loop
Create an arrayList of type Integer.
add below values.
111
111
111
999
999
999
Print all the values of List 1 by 1:
**Expected Output:**
111
111
111
999
999
999
```*/

        ArrayList<Integer>digits=new ArrayList<>();
        digits.add(111);
        digits.add(111);
        digits.add(111);
        digits.add(999);
        digits.add(999);
        digits.add(999);
        System.out.println(digits);
        for(int digit:digits){
            System.out.println(digit);
        }



    }
}
