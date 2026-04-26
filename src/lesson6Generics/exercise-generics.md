NOTES:
- Generics works with any type
  - You can use `<T>` or your var/letter of choice to signify the seleted type
- Collections are type safe


Task List

Let's get some practice with generics by creating both a generic method and a generic list.

- Create a new Java Project and name it genericsAndCollections
- Create a new package under the src folder named genericExample
- Create a new class GenericsExcercise in the genericExample package
- Create a main method:
  public static void main(String[] args){}
- Inside the main method add an ArrayList:
  ArrayList<Object> variables = new ArrayList<Object>();
- Add different Object types to the list
  Double doubleNumber = 1.5; String name = "Sally";
  Integer intNumber = 1; Character letter = 'a';
  variables.add(doubleNumber); variables.add(name);
  variables.add(intNumber); variables.add(letter);
- Create a generic method that displays the class type for each type
  static <T> void displayClassName(T variable) {
  System.out.println(variable.getClass().getName()); }
- Iterate over the Array list calling the generic method
- Right click on the GenericsExcercise and select run
