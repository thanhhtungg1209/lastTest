import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class _609 {

    public static List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> res = new LinkedList<>();
        Map<String, Integer> map = new HashMap<>();

        int index = 0;
        for (String str : paths) {
            String[] strs = str.split(" ");
            for (int i = 1; i < strs.length; i++) {

                String key = strs[i].substring(strs[i].indexOf("(") + 1,
                        strs[i].indexOf(")"));

                if (!map.containsKey(key)) {
                    map.put(key, index);
                    index++;
                    res.add(new LinkedList<String>());
                }

                res.get(map.get(key)).add(strs[0] + "/" + strs[i].substring(0, strs[i].indexOf("(")));
            }
        }

        for (int i = res.size() - 1; i >= 0; i--) {
            if (res.get(i).size() < 2) {
                res.remove(i);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String[] paths = { "root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)",
                "root 4.txt(efgh)" };
        System.out.println(findDuplicate(paths));
    }
}
