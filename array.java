import java.util.ArrayList;

class Main {
   public static void main(String[] args) {

      // create an array list to store Integer data
      ArrayList<Integer> list1 = new ArrayList<>();
      list1.add(4);
      list1.add(5);
      System.out.println("ArrayList of Integer: " + list1);

      // creates an array list to store String data
      ArrayList<String> list2 = new ArrayList<>();
      list2.add("Four");
      list2.add("Five");
      System.out.println("ArrayList of String: " + list2);

      // creates an array list to store Double data
      ArrayList<Double> list3 = new ArrayList<>();
      list3.add(4.5);
      list3.add(6.5);
      System.out.println("ArrayList of Double: " + list3);
   }
}
