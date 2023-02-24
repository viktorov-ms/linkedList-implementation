package localhost;

public class Main {

  public static void main(String[] args) {
    LinkedListImplementation myLinkedList = new LinkedListImplementation();
    myLinkedList.add(1);
    myLinkedList.add(2);
    myLinkedList.add(3);
    System.out.println(myLinkedList);
    System.out.println(myLinkedList.get(0));
    System.out.println(myLinkedList.get(1));
    System.out.println(myLinkedList.get(2));
    try {
      myLinkedList.get(3);
    } catch (IllegalArgumentException e) {
      System.out.println("За пределами");
    }
    myLinkedList.remove(1);
    System.out.println(myLinkedList);
    myLinkedList.remove(0);
    System.out.println(myLinkedList);
  }
}
