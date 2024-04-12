public class Main {
    public static void main(String[] args) {
        Dog objectA = new Dog("Buddy", 3, Breed.LABRADOR);
        Labrador objectB = new Labrador("Golden", objectA, new Dog("Rex", 5, Breed.GOLDEN_RETRIEVER));
        Labrador objectC = new Labrador("Black", new Dog("Luna", 4, Breed.LABRADOR), objectA);

        System.out.println("Object A: ");
        System.out.println(objectA);

        System.out.println("\nObject B: ");
        System.out.println(objectB);

        System.out.println("\nObject C: ");
        System.out.println(objectC);
    }
}
