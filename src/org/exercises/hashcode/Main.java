
    public class Main {
        public static void main(String[] args) {

            Main main = new Main();
            main.sameWayToTheObject();
            main.differentWayToTheObject();
        }

        public void sameWayToTheObject() {

            int firstHCode;
            int secondHCode;
            boolean uniformityCheckUseEquals;

            Object firstObject = new Object();
            Object secondObject = firstObject;

            firstHCode = firstObject.hashCode();
            secondHCode = secondObject.hashCode();
            System.out.println("Same links for two objects");
            System.out.println(firstHCode);
            System.out.println(secondHCode + "\n");

            System.out.println("Check if object are equal");
            uniformityCheckUseEquals = firstObject.equals(secondObject);
            System.out.println(uniformityCheckUseEquals + "\n");
        }

        public void differentWayToTheObject() {

            int firstHCode;
            int secondHCode;
            boolean uniformityCheckUseEquals;

            Object firstObject = new Object();
            Object secondObject = new Object();

            firstHCode = firstObject.hashCode();
            secondHCode = secondObject.hashCode();
            System.out.println("Different links for two objects");
            System.out.println(firstHCode);
            System.out.println(secondHCode + "\n");

            System.out.println("Check if object are equal");
            uniformityCheckUseEquals = firstObject.equals(secondObject);
            System.out.println(uniformityCheckUseEquals);
        }

    }

