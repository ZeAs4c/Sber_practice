package com.second_task_on_Friday;
import java.util.ArrayList;
import java.util.List;
public class UtilClass {

    /**
     * Сделайте методы типизированными (Используйте generics)
     */

    /**
     * Возвращает true, если список равен null или если список пуст
     *
     * @param list список.
     * @return true, если список равен null или если список пуст
     */
    public static boolean isBlank(List list) {
        if (list == null || list.size() == 0)
            return true;
        else
            return false;
    }

    /**
     * Получает последний элемент в коллекции
     * Если список равен null, то выбрасывается исключение IllegalArgumentException
     *
     * @param list список
     * @return последний элемент в коллекции
     */
    public static <T> T getLastElem(List<T> list) {
        if (isBlank(list))
            throw new IllegalArgumentException();
        else {
            return list.get(list.size() - 1);
        }

    }

    /**
     * Получает элемент из списка.
     * Если в аргументах список или элемент равен null, то выбрасывается исключение IllegalArgumentException
     * Если элемент не найден, то возвращаем null
     *
     * @param list список, в котором ищем элемент
     * @param elem элемент, который ищется в списке.
     * @return элемент из списка.
     */
    public static <T> T findElem(List<T> list, T elem) {
        if (isBlank(list))
            throw new IllegalArgumentException();
        for (T el : list) {
            if (el == elem)
                return el;
        }
        return null;
    }

    /**
     * Объединяет два списка.
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы метода не меняются
     *
     * @param list1 первый список
     * @param list2 второй список
     * @return возвращает объединенный список.
     */
    public static <T> List<T> union(List<T> list1, List<T> list2) {
        if (isBlank(list1) && isBlank(list2))
            return new ArrayList<>();

        List<T> res = new ArrayList<T>();
        res.addAll(list1);
        res.addAll(list2);
        return res;
    }

    /**
     * Удаляет все элементы из списка list1 всех элементов, которые встречаются в списке list2
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы метода не меняются
     *
     * @param list1 первый список
     * @param list2 второй список
     * @return возвращает список, который содержит элементы из списка list1, в котором удалены все элементы из
     * списка list2.
     */
    public static <T> List<T> removeAll(List<T> list1, List<T> list2) {
        if (isBlank(list1) && isBlank(list2))
            return new ArrayList<>();
        if (isBlank(list1))
            return new ArrayList<>();

        List<T> res = new ArrayList<>(list1);
        if (isBlank(list2))
            return res;
        res.removeAll(list2);
        return res;
    }

    /**
     * Складывает числа из обоих списков и возвращает сумму.
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы метода не меняются
     * Подсказка:
     * 1) Помните, что все объекты чисел (Integer, Double, Float и т.д) наследуются от общего предка Number.
     * 2) Используйте ограничения для типизации, чтобы списки могли содержать любые числа (Integer, Double, Float и т.д)
     * 3) Для приведения Number к double воспользуйтесь num.doubleValue();
     *
     * @param list1 первый список
     * @param list2 второй список
     * @return сумма чисел.
     */
    public static double sum(List<? extends Number> list1, List<? extends Number> list2) {
        double res = 0;
        for (int i = 0; i < list1.size(); ++i)
            res += list1.get(i).doubleValue();
        for (int i = 0; i < list2.size(); ++i)
            res += list2.get(i).doubleValue();
        return res;
    }
}



