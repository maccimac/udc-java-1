# Exercise - Generics and Collections

## Task List

Let's practice sorting with Collections by creating a Driver program to see how sorting can be done.

- [ ] Create a new Java Project and name it **genericsAndCollections**

- [ ] Create a new package under the **src** folder named **collectionExample**

- [ ] Create a new class named `SortingExample` in the **collectionExample** package

- [ ] Create a main method:
    ```java
    public static void main(String[] args){}
    ```

- [ ] Create an ArrayList populated with String names:
    ```java
    ArrayList<String> names = new ArrayList<String>();
    names.add("Mike");
    names.add("Bob");
    names.add("Alice");
    ```

- [ ] Sort the list of names by using Collections.sort():
    ```java
    Collections.sort(names);
    ```

- [ ] Add a for each loop to display the contents of the list:
    ```java
    for(String name : names) {
        System.out.println(name);
    }
    ```

- [ ] Right click on the `SortingExample` and select **run**


