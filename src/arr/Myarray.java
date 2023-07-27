package arr;
import java.util.*;
import java.util.Arrays;

public class Myarray {

    public static void main(String[]args){
        String[]names={"dorah","eddna","adee"};
        int[]ages={2,3,4};
        Arrays.sort(ages);
        Arrays.sort(names);
        System.out.println(Arrays.toString(ages));
        System.out.println(Arrays.toString(names));
//        sum of an array
        int sum= 0;
        for(int a:ages)
            sum+=a;
            System.out.println(sum);
//        AVERAGE VALUE OF ARRAY ELEMENTS
        int avg=sum/ages.length;
        System.out.println(avg);

        //AN ARRAYLIST
//        ADD COLORS
//        REMOVE COLORS
        ArrayList<String>colors=new ArrayList<>();
        colors.add("blue");
        colors.add("red");
        colors.add("green");
        colors.add("orange");
        System.out.println(colors);
//        looping through the list

        for (String i:colors){

            System.out.println(i);
        }
//        Remove the colors
        colors.remove(0);
//        updating
        colors.set(0,"pink");
//  searching for an element in an arraylist
        System.out.println(colors.contains("red"));
        System.out.println(colors.contains("blue"));
        System.out.println(colors);
//  sort with collections
        Collections.sort(colors);
        System.out.println(colors);

// copying an arraylist into another
        ArrayList<String>colorCopy=new ArrayList<>();
        colorCopy.add("a");
        colorCopy.add("b");
        colorCopy.add("c");
        System.out.println(colorCopy);
        Collections.copy(colors,colorCopy);
        Collections.shuffle(colors);
        System.out.println(colors);
        ArrayList<Integer>nums=new ArrayList<>();
        nums.add(2);

    }

}
