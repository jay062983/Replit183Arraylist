package ArrayLinkList;

import java.util.ArrayList;
import java.util.Iterator;

public class Rep191 {
    public static void main(String[] args) {
        /*Create an ArrayList of type boolean called listA and add below values

(true, false, false)
Create another array list call listB and ad all values from List A into it
Using iterator print all values from ListB 1 by 1
**Expected Output:**
true
false
false
```
*/

        ArrayList<String> listA = new ArrayList<>();
        listA.add("true");
        listA.add("false");
        listA.add("false");

        ArrayList<String> listB = new ArrayList<>(listA);
        Iterator<String> iter = listB.iterator();
        while ((iter.hasNext())) {
            String list = iter.next();


            System.out.println(list);
        }
    }}
