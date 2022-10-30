import java.util.*;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        Scanner scanner = new Scanner(System.in);
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Здравствуйте! Введите два числа: размер списка и верхнюю границу значений.");
        String input = scanner.nextLine();
        String [] inputArray = input.split(" ");
        int arraySize = Integer.parseInt(inputArray[0]);
        int randomMaxInt = Integer.parseInt(inputArray[1]);
        logger.log("Размер списка: " + arraySize);
        logger.log("Верхняя граница: " + randomMaxInt);
        logger.log("Создаем и наполняем список");
        List<Integer> list = new ArrayList<>(arraySize);
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            list.add(random.nextInt(randomMaxInt));
        }
        logger.log("Вот случайный список: " + Arrays.toString(list.toArray()));
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра");
        String input1 = scanner.nextLine();
        int filterValue = Integer.parseInt(input1);
        logger.log("Порог фильтрации: " + filterValue);
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(filterValue);
        List<Integer> filteredList = filter.filterOut(list);
        logger.log("Прошло фильтр " + filteredList.size() + " элемента из " + list.size());
        logger.log("Выводим результат на экран");
        logger.log("Отфильтрованный список: " + Arrays.toString(filteredList.toArray()));
        filteredList.forEach(System.out::println);
        logger.log("Завершаем программу");
    }
}
