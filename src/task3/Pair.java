package task3;
/*
Напишите обобщенный класс Pair, который представляет
собой пару значений разного типа. Класс должен иметь
методы getFirst(), getSecond() для получения значений
каждого из составляющих пары, а также переопределение
метода toString(), возвращающее строковое представление
пары. Работу сдать в виде ссылки на гит репозиторий.
 */
public class  Pair<T, K> {
    T firstValue;
    K secondValue;
    public Pair(T first, K second) {
        this.firstValue = first;
        this.secondValue = second;
    }

    public T getFirst(){
        return firstValue;
    }
    public  K getSecond(){
        return secondValue;
    }
    @Override
    public String toString(){
        return "Первое значение: " + getFirst() + " . "
                + "\nВторое значение: " + getSecond();
    }
}
