package ArrayLinkList;

import java.util.ArrayList;

public class Rep183 {
    public static void main(String[] args) {
        /*Create an array list that will hold String Objects

Find out wether array list is empty or not.

Add String value "Syntax" to it

Find out wether array list is empty or not.

**Expected Output:**

```
true
false
```
  */

        ArrayList<String> A1=new ArrayList<>();


        System.out.println(A1.isEmpty());
        A1.add("Syntax");
        System.out.println(A1.isEmpty());


    }
}
