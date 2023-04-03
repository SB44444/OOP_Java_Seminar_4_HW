/** Создаем родительский класс LinkedList */
public class SBLinkedList<T> {
    /** Поле начапа списка  */
    private Node<T> head;
    /** Поле хвоста списка  */
    private Node<T> tail;
    /** Поле количества эл-тов списка  */
    private int size = 0;

    /** Создаем внутренний класс для работы со значениями эл-тов списка */
    static class Node<T> {
        Node<T> next;
        T value;
        Node (T t) {
            this.value = t;
        }
    }
    /** Ф-ция вставки элемнта в начало списка  */
    public void addFirst(T t) {
        Node<T> temp = new Node<>(t);
        temp.next = head;
        head = temp;
        if (tail == null) {
            tail = temp;
        }
        size++;
    }
    /** Ф-ция вставки элемнта в хвост списка  */
    public void addLast(T t) {
        if (tail == null) {
            addFirst(t);
            return;
        }

        Node<T> temp = new Node<>(t);
        tail.next = temp;
        tail = temp;
        size++;
    }

    /** Переопределяем ф-цию toString для строкового представления списка */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node<T> temp = head;
        while (temp != null) {
            builder.append(temp.value).append(", ");
            temp = temp.next;
        }
        return builder.toString();
    }

    /** Ф-ция возвращает размер списка  */
    public int getSize() {
        return size;
    }
    /** Ф-ция возвращает первый эл-т списка  */
    public  String getLast() {
        Node<T> temp = tail;
        return String.valueOf(temp.value);
        }
    /** Ф-ция возвращает последний эл-т списка  */
    public  String getFirst() {
        Node<T> temp = head;
        return String.valueOf(temp.value);
    }
}
