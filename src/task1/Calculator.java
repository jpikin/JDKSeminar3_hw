package task1;
/*
Написать класс Калькулятор (необобщенный), который
содержит обобщенные статические методы:
sum(), multiply(), divide(), subtract().
Параметры этих методов – два числа разного типа,
над которыми  должна быть произведена операция.
Методы должны возвращать результат своей работы.
*/

public class Calculator {
    public static <V extends Number, K extends Number> String sum(V num1, K num2){
        double sum = num1.doubleValue() + num2.doubleValue();
        return num1 +" + "+ num2 +" = "+ sum;
    }
    public static <V extends Number, K extends Number> String multiply(V num1, K num2){
        double multiply = num1.doubleValue() * num2.doubleValue();
        return num1 +" * "+ num2 +" = "+ multiply;

    }
    public static <V extends Number, K extends Number> String divide(V num1, K num2){

        if (num2.doubleValue() == 0)
            return "На ноль делить нельзя";

        double divide = num1.doubleValue() / num2.doubleValue();
        return num1 +" / "+ num2 +" = "+ divide;
    }
    public static <V extends Number, K extends Number> String subtract(V num1, K num2){
        double divide = num1.doubleValue() - num2.doubleValue();
        return num1 +" - "+ num2 +" = "+ divide;
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 7.2));
        System.out.println(multiply(5, 7.2));
        System.out.println(divide(5, 2));
        System.out.println(subtract(5.2, 4.1));
    }
}
