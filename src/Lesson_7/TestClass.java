package Lesson_7;

public class TestClass {

    @Test(priority = 1)
    public static void test1() {
        System.out.println("Test 1");
    }

    @Test(priority = 1) //для проверки рандомности вызова методов с одинаковым приоритетом
    public static void test2() {
        System.out.println("Test 2");
    }

    @Test(priority = 3)
    public static void test3() {
        System.out.println("Test 3");
    }

    @Test(priority = 4)
    public static void test4() {
        System.out.println("Test 4");
    }

    @Test(priority = 5)
    public static void test5() {
        System.out.println("Test 5");
    }

    @AfterSuite
    public static void after() {
        System.out.println("AfterSuite method");
    }

    @BeforeSuite
    public static void before() {
        System.out.println("BeforeSuite method");
    }

    //Второй метод с аннотацией @BeforeSuite вызовет исключение
//    @BeforeSuite
//    public static void before2() {
//        System.out.println("BeforeSuite method 2");
//    }
}
