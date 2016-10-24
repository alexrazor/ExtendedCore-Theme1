import org.junit.Assert;

public class CustomCollectionTest {

    private static int[] testArray = new int[]{1,2,3,4,5};
    private CustomCollection collection;

    @org.junit.Test
    public void constructorTest(){
       collection= new CustomCollection();
        Assert.assertArrayEquals(collection.getCustomCollection(), testArray);
    }

    @org.junit.Test
    public void addElementToTailTest() throws Exception {
        int testValue = 6;
        int[] testList = new int[]{1+testValue,2+testValue,3+testValue,4+testValue,5+testValue,testValue};
        collection = new CustomCollection();
        collection.addElementToTail(testValue);
        Assert.assertArrayEquals(testList,collection.getCustomCollection());
    }



}