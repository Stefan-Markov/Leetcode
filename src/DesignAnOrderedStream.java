import java.util.ArrayList;
import java.util.List;

public class DesignAnOrderedStream {
    public static void main(String[] args) {

    }

    class OrderedStream {
        int i = 0;
        String[] res;

        public OrderedStream(int n) {
            res = new String[n];
        }

        public List<String> insert(int idKey, String value) {
            res[idKey - 1] = value;
            List<String> list = new ArrayList<>();
            while (i < res.length && res[i] != null) {
                list.add(res[i]);
                i++;
            }
            return list;
        }
    }
}

