package String;

import javax.sql.rowset.spi.SyncResolver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetStringBySpliting {
    public static void main(String[] args) {
        String str = "visakg&varghese*welcome%homedjdhdd.hfhfh^gsgsv$hgdgdgd!dhdhdh~hdddg(dhdbdb)hbddh#hbdbdb@ndjdj+ggddg\\gg-ndnddb|dhdhdhdhhdhdh dhdhdhh/hsh shsh";
        String[] strings = findNames(str);
        System.out.println(Arrays.toString(strings));
    }

    private static String[] findNames(String str) {


//        List<String> result = new ArrayList<>();
        System.out.println(str);
        return str.split("[\\s\\t&*%.|+()^~!/#$@-\\\\]");

//        return str.split("\\\\\\\\");
    }


}
