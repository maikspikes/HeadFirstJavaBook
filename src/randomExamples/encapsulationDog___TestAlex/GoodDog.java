package randomExamples.encapsulationDog___TestAlex;

class GoodDog {
    private int size;


    public int getSize() {
        return size;
    }
    public void setSize(int s) {
        size = s;
    }
    public String bark() {
        if (size >= 75) {
            return "WOOOOOOOOOOOOOOOOOOOOOOOF";
        } else if (size >= 60) {
            return "Wooof! Wooof!";
        } else if (size >= 15) {
            return "blaf";
        } else {
            return "yip yip";
        }
    }
}
class GoodDogTestDrive {
    public static void main(String[] args) {
        switchVersusEnhancedSwitch();


        var examples = new Object[][] {
                // size , expected bark
                { 75, "WOOOOOOOOOOOOOOOOOOOOOOOF" },
                { 60, "Wooof! Wooof!" },
                { 59, "blaf" },
                { 15, "blaf" },
                { 14, "yip yip" }

        };

        // parameterized test
        for (Object[] example : examples){
            testDogsOfDifferentSizesBarkDifferently((int) example[0], (String) example[1]);
        }
// separate tests
//        testABigDogBarksLoudly();
//        testAMediumDogBarksNormally();
//        testASmallDogBarksAnnoyingly();
    }

    private static void switchVersusEnhancedSwitch() {
        int number = 1;

        switch (number) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("other number");
                break;
        }

        var result = switch (number) {
            case 1 -> "one";
            case 2 -> "two";
            default -> "other number";
        };
    }

    private static void testDogsOfDifferentSizesBarkDifferently(int size, String expectedBark) {
        // Given a <size> dog (Arrange)
        GoodDog mediumDog = new GoodDog();
        mediumDog.setSize(size);

        // When it barks (Act)
        String actualBark = mediumDog.bark();

        // Then makes a <bark> noise (Assert)
        System.out.println(assertEquals(expectedBark, actualBark));
    }

    private static void testABigDogBarksLoudly() {
        // Feature: A big dog barks loudly

        // Given a big dog (Arrange)
        GoodDog bigDog = new GoodDog();
        bigDog.setSize(60);

        // When it barks (Act)
        String actualBark = bigDog.bark();

        // Then makes a loud noise (Assert)
        String expectedBark = "Wooof! Wooof!";
        System.out.println(assertEquals(expectedBark, actualBark));
    }
    private static void testAMediumDogBarksNormally() {
        // Given a medium dog (Arrange)
        GoodDog mediumDog = new GoodDog();
        mediumDog.setSize(15);

        // When it barks (Act)
        String actualBark = mediumDog.bark();

        // Then makes a medium noise (Assert)
        String expectedBark = "blaf";
        System.out.println(assertEquals(expectedBark, actualBark));
    }

    private static String assertTrue(boolean isTrue) {
        if (isTrue) {
            return "PASSED";
        } else {
            return "FAILED";
        }
    }

    private static String assertEquals(Object a, Object b) {
        if (a.equals(b)) {
            return "PASSED";
        } else {
            return "FAILED";
        }
    }
}