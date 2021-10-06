package JUnitDemoPackage;

import org.junit.*;

public class JUnitDemoClass {

    @BeforeClass
    public static void openBrowser(){
        System.out.println("Open the Browser");

    }

    @Before
    public void logOn(){
        System.out.println("Logon to the System");
    }
    @After
    public void logOut(){
        System.out.println("Logout from the System");
    }

    @Test
    public void testCase2(){
        System.out.println("Test Case 2");
    }
    @AfterClass
    public static void closeBrowser(){
        System.out.println("Close the Browser");
        //closed DB
        //
    }
    @Test
    public void testCase3(){
        System.out.println("Test Case 3");
    }@Test
    public void testCase1(){
        System.out.println("Test Case 1");

    }
    @Test @Ignore
    public void testCase4(){
        System.out.println("Test Case 4");
    }
    @Test
    public void testCase5(){
        System.out.println("Test Case 5");
    }

}
