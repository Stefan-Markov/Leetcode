import java.util.ArrayList;
import java.util.List;

public class CellsInARangeOnAnExcelSheet {
    public static void main(String[] args) {
        var s = "K1:L2";
        List<String> cells = cellsInRange(s);
        cells.forEach(System.out::println);
    }

    public static List<String> cellsInRange(String s) {
        char columnStart = s.charAt(0);
        char columnEnd = s.charAt(3);
        char rowStart = s.charAt(1);
        char rowEnd = s.charAt(4);

        List<String> cells = new ArrayList<>();

        for (char column = columnStart; column <= columnEnd; column++) {
            for (char row = rowStart; row <= rowEnd; row++) {
                cells.add(new String(new char[]{column, row}));
            }
        }
        return cells;
    }
}
