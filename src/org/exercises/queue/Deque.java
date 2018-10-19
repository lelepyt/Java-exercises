import java.util.ArrayDeque;

public class Deque {

    public void createDeque (){

        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        addElementInDeque(deque);
        showFirstElementFromDeque(deque);
        deleteElementFromDeque(deque);
    }

    private void addElementInDeque(ArrayDeque<Integer> deque){

        // Add element in Deque
        System.out.println("Add element");
        deque.add(3);
        deque.addFirst(2);// add element at the beginning
        deque.push(1);// add element at the beginning
        deque.add(4);
        deque.addLast(5);// add element at the beginning
        printAllElementFromPriorityQueue(deque);
    }

    private void showFirstElementFromDeque(ArrayDeque<Integer> deque){

        //Check element in Deque
        System.out.print("\n");
        System.out.println("Check element in Qeque");
        Integer iFirst = deque.getFirst();
        Integer iLast = deque.getLast();
        Integer iSize = deque.size();

        System.out.println("First element in deque: " + iFirst);
        System.out.println("Last element in deque: " + iLast);
        System.out.println("Size deque: " + iSize);
    }

    private void deleteElementFromDeque (ArrayDeque<Integer> deque){

        // Delete element from Deque
        System.out.print("\n");
        System.out.println("Delete element '1', '2', '4', '5'");
        deque.remove();// delete 1
        deque.remove(4); //delete 4
        deque.removeFirst(); // delete 2
        deque.removeLast(); //  delete 5
        printAllElementFromPriorityQueue(deque);
    }

    private void printAllElementFromPriorityQueue(ArrayDeque<Integer> deque){

        for(Object i : deque) {
            System.out.println(i);
        }
    }

}
