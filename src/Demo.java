import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        ArrayList<String> strList = new ArrayList<String>();
        strList.add("hello");
        strList.add("there");
        strList.add("well");

        for (String str : strList)
        {
            System.out.println(str);
        }

    }
}
