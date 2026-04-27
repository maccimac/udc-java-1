# Exercise - Collections

## Task List

### Part 1 - Iterator Example

Be sure to try out an example that uses the Iterable interface:

- [ ] Create a new package under the **src** folder named **iteratorExample**

- [ ] Create a new class called `IteratorExercise`

- [ ] Create a main method:
    ```java
    public static void main(String[] args){}
    ```

- [ ] Create a list with some names:
    ```java
    List<String> names = new LinkedList<String>();
    names.add("Mike");
    names.add("Bob");
    names.add("Alice");
    ```

- [ ] Now we can use the Iterator interface with the names:
    ```java
    Iterator<String> iterator = names.iterator();
    ```

- [ ] And finally, we can loop over them with `while`:
    ```java
    while(iterator.hasNext()){
        System.out.println(iterator.next()); }
    ```

---

### Part 2 - Collections Example

Let's get some practice working with the `Collections` class to process and store data.

- [ ] Create a new package under the **src** folder named **collectionsExample**

- [ ] Create a new class `CollectionsExercise` in the **collectionsExample** package

- [ ] Create a main method:
    ```java
    public static void main(String[] args){}
    ```

- [ ] Inside the main method instantiate your list object:
    ```java
    List<String> listOfItems = new LinkedList<String>();
    ```

- [ ] Add objects to the list:
    ```java
    listOfItems.add("Mike");
    listOfItems.add("Bob");
    listOfItems.add("Alice");
    ```

- [ ] Use a `for each` loop to print out the items

- [ ] Right click on the `CollectionsExercise` and select **run**

