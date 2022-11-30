//Создать программу, которая выводит в консоль одномерный массив (new int[100]) нечетных случайных чисел от 0 до 100
//(выводить в консоль по десять чисел в одном ряду). Отсортировать массив и посчитать среднее арифметическое всех чисел массива.
package task4jptv21;


public class Task4JPTV21 {

   
    public static void main(String[] args) {
    int mas1 [] = new int [100];
        for (int i = 0; i < mas1.length; i++) {
            mas1 [i] = (int)(Math.random()*100) +1;
        } 
        System.out.println("Mассивы: ");
        for (int i = 0; i < mas1.length; i++) {
            
        if (i % 10 == 0 && i > 0) {
            System.out.println();
        }
        System.out.print(mas1[i] + " ");
    }
        int sumMas1 = 0;
        for (int i = 0; i < mas1.length; i++) {
            sumMas1 = sumMas1 + mas1[i];
        }
        System.out.println("");
        System.out.println("Сумма массива = " + sumMas1);
        int avarageMas1 = sumMas1 / mas1.length;
        System.out.println("Среднее арифмитическоe = " + avarageMas1);
        
    }
    
}