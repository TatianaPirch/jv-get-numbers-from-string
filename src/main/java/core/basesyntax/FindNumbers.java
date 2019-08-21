package core.basesyntax;

public class FindNumbers {

    /**
     * <p>Реализуйте метод getAllNumbers(String text) который принимает строку, cодержащую буквы,
     * целые числа и иные символы.</p>
     *
     * <p>Требуется: все числа, которые встречаются в строке, поместить в отдельный целочисленный
     * массив, каждый элемент этого массива умножить на 2. Метод должен возвращать этот массив.</p>
     *
     * <p>Пример: если дана строка "data 48 call 9 read13 blank0a", то в массиве должны оказаться
     * числа 96, 18, 26 и 0.</p>
     */
    public int[] getAllNumbers(String text) {
        String regex = "[^-?0-9]+";
        String[] str = text.split(regex);
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (!str[i].isEmpty()) {
                count++;
            }
        }
        int[] result = new int[count];
        int pointer = 0;
        for (int i = 0; i < str.length; i++) {
            if (!str[i].isEmpty()) {
                result[pointer] = 2 * Integer.parseInt(str[i]);
                pointer++;
            }
        }
        return result;
    }
}
