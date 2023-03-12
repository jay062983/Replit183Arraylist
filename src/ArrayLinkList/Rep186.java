package ArrayLinkList;

import java.util.ArrayList;

public class Rep186 {

    public static void main(String[] args) {
        /* # ArrayList Remove

Create an Arraylist of type Integer.
Add below elements to it.
111
222
333
444
555
666
Print the ArrayList.
remove all the elements.
Print the Arraylist.
**Expected Output:**
[111, 222, 333, 444, 555, 666]
[]
``` */

        ArrayList<Integer> num=new ArrayList<>();
        num.add(111);
        num.add(111);
        num.add(111);
        num.add(111);
        num.add(111);
        num.add(111);
        System.out.println(num);
        num.clear();
        System.out.println(num);


    }
}
