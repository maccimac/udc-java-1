# Exercise: Maps

## Part 1: Let's get some practice with maps. First, let's create a Person class (as we have done a few times in the past!).

- [ ] Create a new Java Project and name it `lesson6`
- [ ] Create a new package under the `src` folder named `mapsExample`
- [ ] Create a new class `Person` in the `mapsExample` packagej
- [ ] Add the following variables: `String name;`, `String email;`
- [ ] Create a constructor that sets the variables
- [ ] Create getter functions for the variables
- [ ] Create setter functions for the variables
- [ ] Override the `toString` function

## Part 2: The following steps will show you how to create a driver program to store and retrieve Person objects in a HashMap.

- [ ] Create a new class `MapExercise` in the `mapsExample` package
- [ ] Create a main function: `public static void main(String[] args){}`
- [ ] Create a Map object to store the Person objects:
```
Map<String, Person> mapOfPeople = new
HashMap<String, Person>();
```
- [ ] Write a loop to add the Person objects to your Map. Inside the loop, you can use the `put` method:
```
mapOfPeople.put(person.getEmail(), person);
```
- [ ] Search for people in the map based on email:
```
mapOfPeople.get("jeff@email.com")
```
- [ ] Right click on the `MapExercise` and select run

