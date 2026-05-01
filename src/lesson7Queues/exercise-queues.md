# Queue Exercise

This exercise will demonstrate how to implement and work with the `Queue` class in Java.

- [ ] Create a new package under the `src` folder named `queueExercise`
- [ ] Create a new class `QueueExercise` in the `queueExercise` package
- [ ] Create a main method:

```java
public static void main(String[] args){}
```

- [ ] Inside the main method, instantiate your queue object:

```java
Queue<String> queuedCustomers = new LinkedList<>();
```

- [ ] Next, add waiting customers to the queue:

```java
queuedCustomers.add("1234");
queuedCustomers.add("3412");
queuedCustomers.add("0123");
queuedCustomers.add("4321");
```

- [ ] Print out the queue by popping objects off the top. We can do this using a `while` loop:

```java
while (!queuedCustomers.isEmpty()) {
    System.out.println("Customer " + queuedCustomers.poll() + " is getting helped");
}
```

- [ ] Right click on the `QueueExcercise` and select run

