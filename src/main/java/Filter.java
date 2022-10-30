import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    protected int threshold;

    public Filter (int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut (List<Integer> source) {
        Logger logger = Logger.getInstance();
        for (int i : source) {
            if (i < threshold) {
                logger.log("Элемент " + i + " проходит");
            } else {
                logger.log("Элемент " + i + " не проходит");
            }
        }
        List<Integer> result = new ArrayList<>();
        result = source.stream()
                .filter(number -> number<threshold)
                .collect(Collectors.toList());
        return result;
    }
}
