

 class Runner {

    static void main(String[] args) {
        // Creates collection of ints with 1,2,3,4,5 inside it
        CustomCollection collection = new CustomCollection();
        collection.printCollection();

        //Добавляем в конец элемент 6, коллекция принимает следующий вид: 7,8,9,10,11,6
        collection.addElementToTail(6);
        // checking for correctness
        collection.printCollection();

        //Удаляем элемент под индексом 1 (в данном случае - 8), коллеция принимает следующий вид: -1, 0, 1, 2, 3, -2
        // Этот метод удаляет из массива переданный индекс, в ДЗ непонятно написано должен он его удалять или нет.
        collection.removeElementByIndex(1);
        collection.printCollection();



    }

}

