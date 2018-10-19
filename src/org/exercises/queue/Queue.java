import java.util.PriorityQueue;

public class Queue<I extends Number> {

        public void createQueue (){

            PriorityQueue<Integer> firstPriorityQueue = new PriorityQueue<Integer>();
            PriorityQueue<Integer> secondPriorityQueueSe = new PriorityQueue<Integer>();
            addElementInPriorityQueue(firstPriorityQueue);
            deleteElementFromPriorityQueue(firstPriorityQueue,secondPriorityQueueSe);
            showFirstElementFromPriorityQueue(firstPriorityQueue,secondPriorityQueueSe);
        }

        private void addElementInPriorityQueue(PriorityQueue<Integer> firstPriorityQueue){

            System.out.println("Add element");
            System.out.print("\n");

            //add element in PriorityQueue
            firstPriorityQueue.add(1);
            firstPriorityQueue.add(2);
            firstPriorityQueue.add(3);

            // try to add element in PriorityQueue
            firstPriorityQueue.offer(4);
            firstPriorityQueue.offer(5);
            firstPriorityQueue.offer(6);

            printAllElementFromPriorityQueue( firstPriorityQueue);
        }

        private void deleteElementFromPriorityQueue(PriorityQueue<Integer> firstPriorityQueue,PriorityQueue<Integer> secondPriorityQueueSe ){

            System.out.print("\n");
            System.out.println("Delete element '1', '2', '5'");
            firstPriorityQueue.remove(); // delete 1
            firstPriorityQueue.remove(5); // delete 5
            firstPriorityQueue.poll();  // delete 2
            printAllElementFromPriorityQueue(firstPriorityQueue);
            System.out.print("\n");
            System.out.println("Try delete from empty PriorityQueue");

            //use remove
            try {
                secondPriorityQueueSe.remove();
            }catch (Exception ex){
                System.out.println("Exception - this PriorityQueue is empty");
            }

            //use poll
            Integer resultFromPoll = (secondPriorityQueueSe.poll());
            if(resultFromPoll == null) {
                System.out.println("Return 'null' - this PriorityQueue is empty");
            }
        }

        private void showFirstElementFromPriorityQueue(PriorityQueue<Integer> firstPriorityQueue,PriorityQueue<Integer> secondPriorityQueueSe){

            System.out.print("\n");
            System.out.println("Check the first item in PriorityQueue");
            System.out.println("Use element: " + firstPriorityQueue.element()); //show 3
            System.out.println("Use peek: " + firstPriorityQueue.peek()); //show 3
            System.out.print("\n");
            System.out.println("Check thr first item in empty PriorityQueue");

            //use element
            try{
                secondPriorityQueueSe.element();
            }catch (Exception ex){
                System.out.println("Exception 'NoSuchElementException' - this PriorityQueue is empty");
            }

            // use peek
            Integer resultFromPeek = secondPriorityQueueSe.peek();
            if(resultFromPeek == null) {
                System.out.println("Return 'null' - this PriorityQueue is empty");
            }
        }

        private void printAllElementFromPriorityQueue(PriorityQueue<Integer> priorityQueue){

            for(Object i : priorityQueue) {
                System.out.println(i);
            }
        }

}
