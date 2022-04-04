// Последовательность прямых на плоскости с операциями:
//
//  1. Порождение потока проходящих через заданную точку перпендикуляров к прямым;
//  2. Поиск максимального расстояния от заданной точки.
//
//  Проверить работу первой операции нужно путём ранжирования перпендикуляров на три группы:
//  параллельные, перпендикулярные и просто пересекающиеся.

public class Test {
    public static void main(String[] args) {

        LinesMap t = new LinesMap();
        t.add(1, -1, 1);
        t.add(10, 10, 10);
        t.add(10, 10, 3);
        t.add(0, 1, -1);
        t.nameStream(0, -1).sorted().forEach(System.out::println);

        System.out.println(t.getMax(3, 3));
    }
}