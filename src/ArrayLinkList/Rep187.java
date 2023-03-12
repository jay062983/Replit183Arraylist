package ArrayLinkList;

import java.util.ArrayList;

public class Rep187 {

    public static void main(String[] args) {
        /* Create an array list to type String.
Add these values below to your arraylist
hi
yo
sup
yolo
boop
Remove 1, 3, 5 element from an array
print remained values one by one in one line
**Expected Output:**
yo yolo
``` */

        ArrayList<String>slang=new ArrayList<>();
        slang.add("hi");
        slang.add("yo");
        slang.add("sup");
        slang.add("yolo");
        slang.add("boop");
        System.out.println(slang.remove("hi"));
        System.out.println(slang.remove("sup"));
        System.out.println(slang.remove("boop"));
        System.out.println(slang);

    }
}
