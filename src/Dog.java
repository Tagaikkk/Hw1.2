public class Dog extends Animal {
    private Breed breed;

    public Dog(String name, int age, Breed breed) {
        super(name, age);
        this.breed = breed;
    }

    public Breed getBreed() {
        return breed;
    }

    public void bark() {
        System.out.println("Dog is barking");
    }

    public void bark(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Dog is barking");
        }
    }

    public final void fetch() {
        System.out.println("Dog is fetching");

    }
}

