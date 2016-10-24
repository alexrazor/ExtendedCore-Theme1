/**
 Небходимо создать коллекцию, которая содержит целые числа.
 Реализовать возможность добавления(в начало, в середину - по индексу, и в конец) и удаления элементов
 (по индексу и по значению) в данную коллекцию , при этом:

 - При добавлении элемента, все элементы коллекции увеличиваются на значение добавленного элемента;
 - При удалении элемента все элементы уменьшаются на значение удалённого элемента.
 */
 class CustomCollection {

    public int[] getCustomCollection() {
        return customCollection;
    }

    private int[] customCollection;

     CustomCollection(){
        customCollection = new int[]{1,2,3,4,5};
    }

     void addElementToHead(int value){
        int[] temp = new int[customCollection.length+1];
        temp[0]=value;
        for (int j=0; j<customCollection.length; j++){
            temp[j+1] = customCollection[j];
        }
        customCollection = temp.clone();
    }

    void addElementByIndex(int index, int value){
        if (index < 0 || index > customCollection.length){
            System.out.println("Error: Incorrect index");
        }
        else if (index==0){
            addElementToHead(value);
        }

        else {
            int[] temp = new int[customCollection.length + 1];

            for (int i = 0; i < index; i++) {
                temp[i] = customCollection[i];
            }
            temp[index] = value;
            for (int j = index + 1; j <= customCollection.length; j++) {
                temp[j] = customCollection[j - 1];
            }
            customCollection = temp.clone();
        }
    }

    void addElementToTail(int value){
        int[] temp = new int[customCollection.length+1];

        for (int j=0; j<customCollection.length; j++){
            temp[j] = customCollection[j]+value;
        }
        temp[temp.length-1]=value;

        customCollection = temp.clone();
    }
    void removeElementByIndex(int index){

        int indexValue;
        int[] clone = customCollection.clone();
        if (index < 0 || index > clone.length){
            System.out.println("Error: Incorrect index");
        }

        else {
            indexValue=clone[index];
            int[] temp = new int[clone.length - 1];

            for (int i = 0; i < index; i++) {
                temp[i] = clone[i]-indexValue;
            }

            for (int j = index + 1; j <= temp.length; j++) {
                temp[j-1] = clone[j]-indexValue;
            }
            customCollection = temp.clone();
        }
    }
    void removeElementByValue(int value){


        for (int i=0; i<customCollection.length; i++){
            if (value == customCollection[i]){
                removeElementByIndex(i);
            }
        }
    }
    void printCollection(){
        for (int i :customCollection){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("elements in the collection: "+customCollection.length);
    }
}
