package com.example.lab1;

/**
 * Класс утилит, написанный для первой лабораторной работы
 */
public class Utils {
    /**
     * Находит максимальное значение среди переданных
     * @param values целочимленные значения, среди которых ищется максимальное
     * @return найденное минимальное значение
     */
    public static int max(int ... values) {
        int max = values[0];
        for (int i: values) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    /**
     * Находит минимальное значение среди переданных
     * @param values целочисленные значения, среди которых ищется минимальное
     * @return найденное минимальное значение
     */
    public static int min(int ... values) {
        int min = values[0];
        for (int i: values) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
