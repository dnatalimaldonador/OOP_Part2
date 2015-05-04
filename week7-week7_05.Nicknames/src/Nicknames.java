
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations requested in the assignment here!
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("matti", "mage");
        map.put("mikael", "mixu");
        map.put("arto", "arppa");
        
        String nickName = map.get("mikael");
        System.out.println(nickName);
    }

}
