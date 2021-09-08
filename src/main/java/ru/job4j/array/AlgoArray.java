package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0]; /* переменная для временного хранения значение ячейки с индексом 0. */
        array[0] = array[3]; /* записываем в ячейку с индексом 0 значение ячейки с индексом 3. */
        array[3] = temp; /* записываем в ячейку с индексом 3 значение временной переменной. */

        temp = array[1]; /* инд 1 в темп*/
        array[1] = array[2]; /* инд 2 в 1*/
        array[2] = temp; /* инд темп в 2*/

        temp = array[3]; /* инд 3 в темп*/
        array[3] = array[4]; /* инд 4 в 3*/
        array[4] = temp; /* инд темп в 4*/
        }
    }
