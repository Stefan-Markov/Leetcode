import java.util.*;

public class SortThePeople {
    public static void main(String[] args) {

        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};

        String[] strings = sortPeople(names, heights);

        System.out.println(Arrays.toString(strings));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        Queue<Data> dataQueue = new PriorityQueue<>((a, b) -> b.height - a.height);
        String[] data = new String[dataQueue.size()];

        for (int i = 0; i < heights.length; i++) {
            dataQueue.add(new Data(names[i], heights[i]));
        }

        for (int i = 0; i < data.length; i++) {
            data[i] = Objects.requireNonNull(dataQueue.poll()).name;
        }
        return data;
    }

    public static class Data {
        String name;
        Integer height;

        public Data(String name, Integer height) {
            this.name = name;
            this.height = height;
        }
    }
}
