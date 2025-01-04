import com.amoelcodigo.top.interview.RemoveDuplicatesArray;
import com.amoelcodigo.top.interview.RemoveElement;

public class Main {
    public static void main(String[] args) {

//        int[] array = new int[]{0,1,2,2,3,0,4,2};
//        int val = 2;
//        RemoveElement removeElement = new RemoveElement();
//        System.out.println(removeElement.removeElement(array, val));

        int[] array = new int[]{1,1,2};
        RemoveDuplicatesArray removeDuplicatesArray = new RemoveDuplicatesArray();
        System.out.println(removeDuplicatesArray.removeDuplicates(array));


    }
}