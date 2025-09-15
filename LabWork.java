public class LabWork {
    /**
     * Метод определения отстка вещественного числа
     * @param x вещественное число, остаток которого находится
     * */
    public double fraction(double x) {
        double remainder = x % 1;
        System.out.println("Остаток вещественного числа: ");
        return remainder;
    }
    /**
     * Метод для вычисления числа из исходного символа через код ASCII
     * @param x символ, который переводится в число
     * */
    public int charToNum(char x) {
        char zeroChar = '0';
        int numericValue = ((int) x - (int) zeroChar);
        System.out.println("Числовое представление символа по коду ASCII: ");
        return numericValue;
    }
    /**
     * Метод определения двузначности числа
     * @param x  число, двузначность которого определяется
     * */
    public boolean is2Digits(int x) {
        int digitCount = 0;
        int temp = x;
        while (temp / 10 != 0) {
            temp = temp / 10;
            digitCount++;
        }
        boolean result;
        if (digitCount == 1) {
            System.out.println("Число двузначное");
            result = true;
        } else {
            System.out.println("Число не двузначное");
            result = false;
        }
        return result;
    }
    /**
     * Метод определения вхождения числа X в указанный диапазон
     * @param a начало диапазона
     * @param b конец диапазона
     * @param num число, вхождение в диапазон которого проверяется
     * */
    public boolean isInRange(int a, int b, int num) {
        int min;
        int max;
        if (a > b) {
            min = b;
            max = a;
        } else {
            min = a;
            max = b;
        }

        boolean result;
        if (num >= min && num <= max) {
            System.out.println("Число входит в диапазон");
            result = true;
        } else {
            System.out.println("Число не входит в диапазон");
            result = false;
        }
        return result;
    }
    /**
     * Метод определения равности трёх чисел
     * @param a первое число для проверки
     * @param b второе число для проверки
     * @param c третее число для проверки
     * */
    public boolean isEqual(int a, int b, int c) {
        boolean result;
        if (a == b && b == c) {
            System.out.println("Все числа равны");
            result = true;
        } else {
            System.out.println("Числа не равны");
            result = false;
        }
        return result;
    }
    /**
     * Метод определения модуля числа
     * @param x число, модуль которого определяется
     * */
    public int abs(int x) {
        int ABS;
        ABS = Math.abs(x);
        System.out.print("Модуль числа " + x + " = ");
        return (ABS);
    }
    /**
     * Метод определения делимости числа на 3 и на 5
     * @param x число, делимость которого проверяется
     * */
    public boolean is35(int x) {
        boolean result;
        if (x % 3 == 0 && x % 5 == 0) {
            System.out.println("Число делится и на 3, и на 5");
            result = false;
        } else if (x % 3 == 0 || x % 5 == 0) {
            System.out.println("Число делится или на 3, или на 5");
            result = true;
        } else {
            System.out.println("Число не делится и на 3, и на 5");
            result = false;
        }
        return result;
    }
    /**
     * Метод определения максимального из трёх чисел
     * @param x первое число для определения
     * @param y второе число для определения
     * @param z третее число для определения
     * */
    public int max3(int x, int y, int z) {
        System.out.print("Максимальное число = ");
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }
    /**
     * Метод вычисления суммы двух чисел, и определения диапазона полученной суммы
     * Если сумма находится в промежутке от 10 до 19, то в ответе выводится 20, иначе - сумма
     * @param x первое слагаемое
     * @param y второе слагаемое
     * */
    public int sum2(int x, int y) {
        System.out.print("Результат вычисления = ");
        int realSum = x + y;
        int resultSum;
        if (realSum < 19 && realSum > 10) {
            resultSum = 20;
        } else {
            resultSum = realSum;
        }
        return resultSum;
    }
    /**
     * Метод определения дня недели в соотвестиви с цифрой: понедельник - 1
     * @param x исходная цифра для определения
     * */
    public String day(int x) {
        switch (x) {
            case 1:
                return "Понедельник";
            case 2:
                return "Вторник";
            case 3:
                return "Среда";
            case 4:
                return "Четверг";
            case 5:
                return "Пятница";
            case 6:
                return "Суббота";
            case 7:
                return "Воскресенье";
            default:
                return "Некорректный выбор. Попробуйте снова.";
        }
    }
    /**
     * Метод выведения порядка чисел от 0 до X
     * @param x число, до которого выводится порядок чисел
     * */
    public String listNums(int x) {
        String result = "";
        if (x < 0) {
            for (int i = 0; i >= x; i--) {
                result += i + " ";
            }
        } else {
            for (int i = 0; i <= x; i++) {
                result += i + " ";
            }
        }
        return result;
    }
    /**
     * Метод выведения чётных чисел порядка до X
     * @param x число, до которого выводятся чётные числа
     * */
    public String chet(int x) {
        String result = "";
        if (x < 0) {
            for (int i = 0; i >= x; i--) {
                if (i % 2 == 0) {
                    result += i + " ";
                }
            }
        } else {
            for (int i = 0; i <= x; i++) {
                if (i % 2 == 0) {
                    result += i + " ";
                }
            }
        }
        return result;
    }
    /**
     * Метод определения количества разрядов в числе
     * @param x число, разряд которого определяется
     * */
    public int numLen(long x) {
        int digitCount = 1;
        long temp = x;
        while (temp / 10 != 0) {
            temp /= 10;
            digitCount++;
        }
        System.out.println("В числе " + x + " " + digitCount + " разрядов");
        return digitCount;
    }
    /**
     * Метод вывода матрицы X на X из символа '*'
     * @param x число, определяющее размерность матрицы
     * */
    public void square(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    /**
     * Метод вывода треугольника состоящего из символа '*'
     * @param x число, определяющее высоту матрицы
     * */
    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /**
     * Метод определения индекса первого вхождения числа X в исходном массиве
     * @param arr исходный массив чисел
     * @param x число, индекс которого находится
     * */
    public int findFirst(int[] arr, int x) {
        int length = arr.length;
        System.out.println("Ваш массив выглядит так");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int index = -1;
        for (int i = 0; i < length; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("В созданном вами массиве нет элемента " + x);
        } else {
            System.out.println("Индекс элемента X = " + x + " в массиве Arr = ");
        }
        return index;
    }
    /**
     * Метод определения максимального элемента по модулую в исходном массиве
     * @param arr исходный массив чисел
     * */
    public int maxAbs(int[] arr) {
        int length = arr.length;
        int MAX = arr[0];
        System.out.println("Ваш массив выглядит так");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < length; i++) {
            if (Math.abs(arr[i]) >= Math.abs(MAX)) {
                MAX = arr[i];
            }
        }
        System.out.print("Максимальный элемент массива по модулю = ");
        return (MAX);
    }
    /**
     * Метод слияния двух массивов в один
     * @param arr  первый масив слияния
     * @param ins  второй масив слияния
     * @param pos  позиция слияния двух массивов
     * */
    public int[] add(int[] arr, int[] ins, int pos) {
        int length = arr.length;
        System.out.println("Ваш массив Arr выглядит так");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int length2 = ins.length;
        System.out.println("Ваш массив Ins выглядит так");
        for (int i = 0; i < length2; i++) {
            System.out.print(ins[i] + " ");
        }
        System.out.println();

        int[] arrCopy = new int[length + length2];
        System.out.println("Слияние массивов с позиции Pos относительно массива Arr");

        // Копируем элементы до позиции вставки из исходного массива
        for (int i = 0; i < pos - 1; i++) {
            arrCopy[i] = arr[i];
        }
        // Вставляем элементы из массива ins
        for (int i = 0; i < length2; i++) {
            arrCopy[pos - 1 + i] = ins[i];
        }
        // Копируем оставшиеся элементы из исходного массива
        for (int i = pos - 1; i < length; i++) {
            arrCopy[length2 + i] = arr[i];
        }
        return (arrCopy);
    }
    /**
     * Метод вывода исходного масива в обратном направлении
     * @param arr исходный массив
     * */
    public int[] reverseBack(int[] arr) {
        int length = arr.length;
        System.out.println("Ваш массив Arr выглядит так");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        int[] arr20Copy = new int[length];
        System.out.println("Вид массива 'Наоборот' ");
        for (int k = length - 1; k >= 0; k--) {
            arr20Copy[-k + length - 1] = arr[k];
        }
        return arr20Copy;
    }
    /**
     * Метод определения индекса числа X в исходном массиве
     * @param arr исходный массив
     * @param x число, индекс которого находится
     * */
    public int[] findAll(int[] arr, int x) {
        int length = arr.length;
        int count = 0;
        System.out.println("Ваш массив Arr выглядит так");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == x) {
                count++;
            }
        }
        System.out.println();

        System.out.println("Индексы элемента " + x + " В массиве Arr");
        int[] arrCopy = new int[count];
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] == x) {
                arrCopy[j] = i;
                j++;
            }
        }
        if (j == 0) {
            System.out.println("В исходном массиве нет вашего числа ");
        }
        return arrCopy;
    }
}
