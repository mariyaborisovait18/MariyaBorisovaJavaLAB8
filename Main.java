import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Класс Main - реализация 1 лабораторной работы по языку программирования Java
 * */
public class Main {
    /**
     * Метод main - точка входа в программу - страт
     * */
    public static void main(String[] args) {

        // Объект класса LabWork
        LabWork numberLab = new LabWork();
        // Метод ввода данных
        Scanner scanner = new Scanner(System.in);
        // Метод округления дробной части числа до определённого количества знаков после запятой
        DecimalFormat df = new DecimalFormat("#.###");

        System.out.println("Добрый день! Какое задание Вы бы хотел рассмотреть?\n");
        int choice = -1;
        while (choice != 0) {
            if (choice == -1) {
                System.out.println("МЕНЮ");
                System.out.println("№ Задания");
                System.out.println("1 - Возвращение дробной части числа X");
                System.out.println("2 - Вычисление числа через код ASCII");
                System.out.println("3 - Возвращение 'True', если число X двузначное");
                System.out.println("4 - Возвращение 'True' если X входит в указанный диапазон");
                System.out.println("5 - Возвращение 'True, если если все три числа X, Y, Z равны ");
                System.out.println("6 - Возвращение  модуля числа X");
                System.out.println("7 - Возвращение 'True', если число X делится нацело на 3 или 5." +
                        "'False' - делится и на 3, и на 5.");
                System.out.println("8 - Возвращение максимального из трех полученных чисел X, Y, Z");
                System.out.println("9 - Возвращение суммы двух чисел X и Y");
                System.out.println("10 - Возвращение строки, которая будет обозначать текущий день недели\n" +
                        "где 1- это понедельник, а 7 – воскресенье");
                System.out.println("11 - Возвращение строки, в которой будут записаны все числа от 0 до X");
                System.out.println("12 - Возвращение строки, в которой будут записаны все четные числа от 0 до X");
                System.out.println("13 - Возвращение количества знаков в числе X. ");
                System.out.println("14 - Вывод на экран квадрата из символов ‘*’ размером X на X");
                System.out.println("15 - Вывод на экран + треугольника из символов ‘*’ у которого X символов в высоту, " +
                        "а количество символов в ряду совпадает с номером строки");
                System.out.println("16 - Возвращение индекса первого вхождения числа X в массив arr");
                System.out.println("17 - Возвращение наибольшего по модулю значения массива Arr");
                System.out.println("18 - Возвращение нового массива, который будет содержать все элементы массива Arr," +
                        "однако в позицию Pos будут вставлены значения массива Ins");
                System.out.println("19 - Возвращение нового массива, в котором значения массива Arr записаны задом наперед");
                System.out.println("20 - Возвращение нового массива, в котором записаны индексы всех вхождений" +
                        "числа X в массив Arr");
                System.out.println("0 - ВЫХОД");
                choice = scanner.nextInt();
            }

            switch (choice) {
                case 1:
                    System.out.println("1 - Возвращение дробной части числа X");

                    System.out.println("Введите вещественное число X (через запятую)");
                    double numberEx1;
                    numberEx1 = scanner.nextDouble();

                    System.out.println(df.format(numberLab.fraction(numberEx1)));
                    choice = meni(1);
                    break;
                case 2:
                    System.out.println("Введите цифру от 0 до 9");

                    String input;
                    char symbolOfString;
                    while (true) {
                        input = scanner.next(); // читаем всю строку
                        if (input.length() == 1) { // проверяем длину
                            symbolOfString = input.charAt(0);
                            if (symbolOfString >= '0' && symbolOfString <= '9') {
                                break; // выходим если это одна цифра
                            }
                        }
                        System.out.println("Ошибка! Введите ЦИФРУ от 0 до 9:");
                    }
                    // Вызов метода
                    System.out.println(numberLab.charToNum(symbolOfString));

                    choice = meni(2);
                    break;
                case 3:
                    System.out.println("3 - Возвращение 'True', если число X двузначное");

                    System.out.println("Введите любое число X (можно ввести как положительное, так и отрицательное число) ");
                    int numberEx3;
                    numberEx3 = scanner.nextInt();
                    // Вызов метода
                    System.out.println(numberLab.is2Digits(numberEx3));

                    choice = meni(3);
                    break;
                case 4:
                    System.out.println("4 - Возвращение 'True' если X входит в указанный диапазон включительно");

                    System.out.println("Введите число X");
                    int numberEx4;
                    numberEx4 = scanner.nextInt();
                    System.out.println("Введите диапазон от A до B");
                    System.out.println("Введите начало диапазона - А");
                    int startWay;
                    startWay = scanner.nextInt();
                    System.out.println("Введите конец диапазона - В");
                    int finishWay;
                    finishWay = scanner.nextInt();
                    // Вызов метода
                    System.out.println(numberLab.isInRange(startWay, finishWay, numberEx4));
                    choice = meni(4);
                    break;
                case 5:
                    System.out.println("5 - Возвращение 'True, если если все три числа X, Y, Z равны ");

                    System.out.println("Введите число a");
                    int numberOne;
                    numberOne = scanner.nextInt();
                    System.out.println("Введите число b");
                    int numberTwo;
                    numberTwo = scanner.nextInt();
                    System.out.println("Введите число c");
                    int numberTree;
                    numberTree = scanner.nextInt();
                    // Вызов метода
                    System.out.println(numberLab.isEqual(numberOne, numberTwo, numberTree));

                    choice = meni(5);
                    break;
                case 6:

                    System.out.println("6 - Возвращение  модуля числа X");

                    System.out.println("Введите число X");
                    int numberEx6;
                    numberEx6 = scanner.nextInt();
                    // Вызов метода
                    System.out.println(numberLab.abs(numberEx6));

                    choice = meni(6);
                    break;
                case 7:
                    System.out.println("7 - Возвращение 'True', если число X делится нацело на 3 или 5." +
                            "'False' - делится и на 3, и на 5.");

                    System.out.println("Введите число X");
                    int numberEx7;
                    numberEx7 = scanner.nextInt();
                    // Вызов метода
                    System.out.println(numberLab.is35(numberEx7));

                    choice = meni(7);
                    break;
                case 8:
                    System.out.println("8 - Возвращение максимального из трех полученных чисел X, Y, Z");

                    System.out.println("Введите число x");
                    int numberOneEx8;
                    numberOneEx8 = scanner.nextInt();
                    System.out.println("Введите число y");
                    int numberTwoEx8;
                    numberTwoEx8 = scanner.nextInt();
                    System.out.println("Введите число z");
                    int numberTreeEx8;
                    numberTreeEx8 = scanner.nextInt();
                    // Вызов метода
                    System.out.print(numberLab.max3(numberOneEx8, numberTwoEx8, numberTreeEx8));
                    System.out.println();

                    choice = meni(8);
                    break;
                case 9:
                    System.out.println("9 - Возвращение суммы двух чисел X и Y. Однако, если сумма попадает" +
                            "в диапазон от 10 до 19, то надо вернуть число 20.");

                    System.out.println("Введите число x");
                    int numberOneEx9;
                    numberOneEx9 = scanner.nextInt();
                    System.out.println("Введите число y");
                    int numberTwoEx9;
                    numberTwoEx9 = scanner.nextInt();
                    // Вызов метода
                    System.out.println(numberLab.sum2(numberOneEx9, numberTwoEx9 ));

                    choice = meni(9);
                    break;
                case 10:

                    System.out.println("10 - Возвращение строки, которая будет обозначать текущий день недели " +
                            "где 1- это понедельник, а 7 – воскресенье");

                    System.out.println("Введите число X от 1 до 7");
                    int numberOneEx10;
                    numberOneEx10 = scanner.nextInt();
                    // Вызов метода
                    System.out.println(numberLab.day(numberOneEx10));

                    choice = meni(10);
                    break;
                case 11:
                    System.out.println("11 - Возвращение строки, в которой будут записаны все числа от 0 до X");

                    System.out.println("Введите число x");
                    int numberOneEx11;
                    numberOneEx11 = scanner.nextInt();
                    // Вызов метода
                    System.out.println(numberLab.listNums(numberOneEx11));

                    choice = meni(11);
                    break;
                case 12:
                    System.out.println("12 - Возвращение строки, в которой будут записаны все четные числа от 0 до X");

                    System.out.println("Введите число x");
                    int numberOneEx12;
                    numberOneEx12 = scanner.nextInt();
                    // Вызов метода
                    System.out.println(numberLab.chet(numberOneEx12));

                    choice = meni(12);
                    break;
                case 13:
                    System.out.println("13 - Возвращение количества знаков в числе X. ");

                    System.out.println("Введите число x");
                    int numberOneEx13;
                    numberOneEx13 = scanner.nextInt();
                    // Вызов метода
                    System.out.println(numberLab.numLen(numberOneEx13));

                    choice = meni(13);
                    break;
                case 14:
                    System.out.println("14 - Вывод на экран квадрата из символов ‘*’ размером X на X");

                    System.out.println("Введите число x");
                    int numberOneEx14;
                    numberOneEx14 = scanner.nextInt();
                    // Вызов метода
                    numberLab.square(numberNum(numberOneEx14));
                    System.out.println();

                    choice = meni(14);
                    break;
                case 15:
                    System.out.println("15 - Вывод на экран + треугольника из символов ‘*’ у которого X символов в высоту, " +
                            "а количество символов в ряду совпадает с номером строки");

                    System.out.println("Введите число x");
                    int numberOneEx15;
                    numberOneEx15 = scanner.nextInt();
                    // Вызов метода
                    numberLab.rightTriangle(numberNum(numberOneEx15));
                    System.out.println();

                    choice = meni(15);
                    break;
                case 16:
                    System.out.println("16 - Возвращение индекса первого вхождения числа X в массив Arr");

                    System.out.println("Введите число x");
                    int numberOneEx16;
                    numberOneEx16 = scanner.nextInt();
                    System.out.println("Введите Размерность N массива  Arr");
                    int sizeArrEx16;
                    sizeArrEx16 = scanner.nextInt();
                    sizeArrEx16 = numberNum(sizeArrEx16);
                    int[] arrEx16 = new int[sizeArrEx16];
                    System.out.println("Заполните массив Arr цифрами различными числами");
                    numberArr(arrEx16, sizeArrEx16);
                    // Вызов метода
                    System.out.println(numberLab.findFirst(arrEx16, numberOneEx16));

                    choice = meni(16);
                    break;
                case 17:

                    System.out.println("17 - Возвращение наибольшего по модулю значения массива Arr");

                    System.out.println("Введите Размерность N массива  Arr");
                    int sizeArrEx17;
                    sizeArrEx17 = scanner.nextInt();
                    sizeArrEx17 = numberNum(sizeArrEx17);
                    int[] arrEx17 = new int[sizeArrEx17];
                    System.out.println("Заполните массив Arr различными числами");
                    numberArr(arrEx17, sizeArrEx17);
                    // Вызов метода
                    System.out.println(numberLab.maxAbs(arrEx17));

                    choice = meni(17);
                    break;
                case 18:
                    System.out.println("18 - Возвращение нового массива, который будет содержать все элементы массива Arr," +
                            "однако в позицию Pos будут вставлены значения массива Ins");

                    System.out.println("Введите Размерность N первого массива Arr");
                    int sizeOneArrEx18;
                    sizeOneArrEx18 = scanner.nextInt();
                    sizeOneArrEx18 = numberNum(sizeOneArrEx18);
                    int[] arrOneEx18 = new int[sizeOneArrEx18];
                    System.out.println("Заполните первый массив Arr различными числами");
                    numberArr(arrOneEx18, sizeOneArrEx18);

                    System.out.println("Введите Размерность N2 второго массива Ins");
                    int sizeTwoArrEx18;
                    sizeTwoArrEx18 = scanner.nextInt();
                    sizeTwoArrEx18 = numberNum(sizeTwoArrEx18);
                    int[] ins = new int[sizeTwoArrEx18];
                    System.out.println("Заполните второй массив Ins различными цифрами");
                    numberArr(ins, sizeTwoArrEx18);

                    System.out.println("Начиная с какой позиции первого массива Arr вы бы хотели подставить массив Ins?");
                    System.out.println("Введите число от 1 до " + (sizeOneArrEx18 + 1));
                    int position;
                    position = scanner.nextInt();
                    while (position < 1 || position > (sizeOneArrEx18 + 1)) {
                        System.out.println("Введите число от 1 до " + (sizeOneArrEx18 + 1));
                        position = scanner.nextInt();
                    }
                    // Вызов метода
                    int[] arrCopy18 = numberLab.add(arrOneEx18, ins, position);

                    for (int j = 0; j < sizeOneArrEx18 + sizeTwoArrEx18; j++) {
                        System.out.println(arrCopy18[j] + " ");
                    }

                    choice = meni(18);
                    break;

                case 19:
                    System.out.println("19 - Возвращение нового массива, в котором значения массива" +
                            "   Arr записаны задом наперед");

                    System.out.println("Введите Размерность N массива  Arr");
                    int sizeArrEx19;
                    sizeArrEx19 = scanner.nextInt();
                    sizeArrEx19 = numberNum(sizeArrEx19);
                    int[] arrEx19 = new int[sizeArrEx19];

                    System.out.println("Заполните массив Arr различными числами");
                    numberArr(arrEx19, sizeArrEx19);
                    // Вызов метода
                    int [] arrCopy19 = numberLab.reverseBack(arrEx19);
                    for (int j = 0; j < sizeArrEx19; j++) {
                        System.out.print(arrCopy19[j] + " ");
                    }
                    System.out.println();

                    choice = meni(19);
                    break;
                case 20:
                    System.out.println("20 - Возвращение нового массива, в котором записаны индексы всех вхождений" +
                            " числа X в массив Arr");

                    System.out.println("Введите число x которое хотите искать в массиве");
                    int numberOneEx20;
                    numberOneEx20 = scanner.nextInt();

                    System.out.println("Введите Размерность N массива Arr");
                    int sizeArrEx20;
                    sizeArrEx20 = scanner.nextInt();
                    sizeArrEx20 = numberNum(sizeArrEx20);
                    int[] ArrEx20 = new int[sizeArrEx20];
                    System.out.println("Заполните массив Arr числами ");
                    numberArr(ArrEx20, sizeArrEx20);
                    // Вызов метода
                    int[] arrCopy20 = numberLab.findAll(ArrEx20, numberOneEx20);
                    for (int j = 0; j < arrCopy20.length; j++) {
                        System.out.print(arrCopy20[j] + " ");
                    }
                    System.out.println();

                    choice = meni(20);
                    break;
                case 0:
                    System.out.println("Выход");
                    break;

                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
                    break;
            }
        }
    }
    /**
     * Вспомогательный заполнения массива исходными числами с клавиатуры
     * @param arr массив для заполнения
     * @param number размер массива
     * */
    private static int[] numberArr(int[] arr, int number) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < number; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    /**
     * Вспомогательный метод ввода корректности условия задания - положительного числа
     * @param number число, проверяемое на положительность
     * */
    private static int numberNum(int number) {
        Scanner scanner = new Scanner(System.in);
        while (number < 1) {
            System.out.println("Введите положительное число от 1!");
            number = scanner.nextInt();
        }
        return number;
    }
    /**
     * Вспомогательный метод, дополняющий основоное меню программы
     * @param number число, определяющее действие пользователя, путь программы
     * */
    private static int meni(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите действие");
        System.out.println("1 - МЕНЮ");
        System.out.println("2 - повторить задание");
        System.out.println("0 - ВЫХОД");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                return -1;
            case 2:
                return number;
            case 0:
                return 0;
            default:
                System.out.println("Некорректный выбор. Возврат в меню.");
                return -1;
        }
    }
}