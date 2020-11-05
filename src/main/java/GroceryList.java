//jen obyrne code
import java.util.Arrays;
public class GroceryList {
    private String[] arr;

    public GroceryList(){ 
        this.arr = new String[10];
    }
    public void add(String item)
    {
        //String item = " ";
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == null) {
				arr[i] = item;
                break;
            }
        }
    }
    public void remove(String item)
    {
        //String item = " ";
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == item) {
				arr[i] = null;
                break;
            }
        }
    }
    public String toString()
    {
        String x = (Arrays.toString(arr));
        return x;
    }

}
