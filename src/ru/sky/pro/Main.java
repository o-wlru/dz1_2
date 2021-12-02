package ru.sky.pro;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //задача 1
        byte a = 3;
        short b = 700;
        int c = 40_000;
        long d = 3_467_345_761L;
        float e = 4.45f;
        double f = 63.15;

        //задача 2
        System.out.println("Задача 2");
        float box1 = 78.2f;
        float box2 = 82.7f;
        float resultS2 = box1 + box2;
        System.out.println("Общий вес двух боксеров " + resultS2 + "кг");
        float resultD2 = box1 - box2;
        System.out.println("Разница в весе у боксеров " + resultD2 + "кг");

        //задача 3
        System.out.println("Задача 3");
        short a3 = 80;
        short resulta3 = 80*5;
        short b3 = 105;
        short resultb3 = 105*2;
        short c3 = 100;
        short resultc3 = 100*2;
        short d3 = 70;
        short resultd3 = 70*4;
        short resultG3 = (short) (resulta3 + resultb3 + resultc3 + resultd3);
        System.out.println("итого вес завтрака в граммах: " + resultG3);
        float resultK3 = (float) resultG3/1000;
        System.out.println("итого вес завтрака в килограммах: " + resultK3);

        //задача 4
        System.out.println("Задача 4");
        System.out.println("Спортсмену нужно сбросить 7 кг");
        int S4 = 7*1000;
        //сбрасываем по 250 грамм в день
        int S4_250 = S4/250;
        System.out.println("При потере веса по 250 г в день потребуется " + S4_250 + " дней");
        //сбрасываем по 55 грамм в день
        int S4_500 = S4/500;
        System.out.println("При потере веса по 500 г в день потребуется " + S4_500 + " дней");
        //среднее время похудения
        int resultSrV4 = ((S4_250+S4_500)/2);
        System.out.println("В среднем количество дней, необходимых для похудения: " + resultSrV4);

        //задача 5
        System.out.println("Задача 5");
        int M5=67760;
        int D5=83690;
        int K5=76230;
        //годовой доход текущей з/п
        int M5G=M5*12;
        int D5G=D5*12;
        int K5G=K5*12;
        //увеличение месячной з/п на 10%
        int M5_10 = (int) (M5 * 1.1);
        int D5_10 = (int) (D5 * 1.1);
        int K5_10 = (int) (K5 * 1.1);
        //годовой доход после повышения з/п на 10%
        int M5G_10 = M5_10*12;
        int D5G_10 = D5_10*12;
        int K5G_10 = K5_10*12;
        //разница между годовыми доходами
        int M5GR=M5G_10 - M5G;
        int D5GR=D5G_10 - D5G;
        int K5GR=K5G_10 - K5G;
        //вывод результатов
        System.out.println("Текущий годовой доход:");
        System.out.println("Мария "+ M5G + " рублей");
        System.out.println("Денис "+ D5G + " рублей");
        System.out.println("Кристина "+ K5G + " рублей");
        System.out.println("После повышения зарплаты:");
        System.out.println("Мария станет получать "+ M5_10 + " руб., годовой доход составит "+ M5G_10 +
                " руб., на " + M5GR+ " руб. в год больше");
        System.out.println("Денис станет получать "+ D5_10 + " руб., годовой доход составит "+ D5G_10 +
                " руб., на " + D5GR+ " руб. в год больше");
        System.out.println("Кристина станет получать "+ K5_10 + " руб., годовой доход составит "+ K5G_10 +
                " руб., на " + K5GR+ " руб. в год больше");

        //задача 6*
        System.out.println("Задача 6*");
        int a6=12;
        int b6=27;
        int c6=44;
        int d6=15;
        int e6=9;
        int resultPr6=a6*(b6+(c6-d6*e6));
        System.out.println("Результат прямого вычисления: " + resultPr6);
        int resultOb6=(resultPr6-(2*resultPr6));
        System.out.println("Результат преобразования: " + resultOb6);
        //более простой вариант: int resultOb6=(resultPr6*(-1)); , но первым делом подумалось именно про двойное вычитание

        //задача 7*
        System.out.println("Задача 7*");
        int a7=5;
        int b7=7;
        System.out.println("Переменная а=" + a7 + ", переменная b=" + b7);
        int resulta7=(a7*7);
        int resultb7=(b7*5);
        System.out.println("Переменная а=" + resulta7 + ", переменная b=" + resultb7);
        int resulta7K=(resulta7/5);
        int resultb7K=(resultb7/7);
        System.out.println("Переменная а=" + resulta7K + ", переменная b=" + resultb7K);

        //задача 7**
        System.out.println("Задача 7**");
        int a71=5;
        int b71=7;
        System.out.println("Переменная а=" + a71 + ", переменная b=" + b71);
        int resulta71=(a71*b71);
        int resultb71=(b71*a71);
        System.out.println("Переменная а=" + resulta71 + ", переменная b=" + resultb71);
        int resulta71K=(resulta71/a71);
        int resultb71K=(resultb71/b71);
        System.out.println("Переменная а=" + resulta71K + ", переменная b=" + resultb71K);

        //задача 8*
        System.out.println("Задача 8*");
        int a8=971;
        int resulta8d10 = (int)Math.floor(a8/10);
        System.out.println("десятки от а " + resulta8d10);
        int resulta8d100 = (int)Math.floor(a8/100);
        System.out.println("сотни от а " + resulta8d100);
        int resultb8 = (resulta8d10-(resulta8d100*10));
        System.out.println("b=" + resultb8);


    }
}
