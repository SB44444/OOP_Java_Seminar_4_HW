public class Main {
    public static void main(String[] args) {
        System.out.println("Добавляем элементы LinkedList");
        SBLinkedList<String> onceList = new SBLinkedList<>();
        onceList.addLast("один");
        onceList.addLast("два");
        onceList.addLast("три");
        onceList.addLast("четыре");
        onceList.addLast("пять");
        onceList.addFirst("ноль");

        System.out.println("Все элементы связного списка LinkedList: " + onceList);
        System.out.println("Количество эл-тов списка: " + onceList.getSize());
        System.out.println("Первый эл-т списка: " + onceList.getFirst());
        System.out.println("Крайний эл-т списка: " + onceList.getLast());
    }
}
