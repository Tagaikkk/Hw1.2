public final class Labrador {
    private String color;
    private Dog mother;
    private Dog father;

    public Labrador(String color, Dog mother, Dog father) {
        this.color = color;
        this.mother = mother;
        this.father = father;
    }

    public String getColor() {
        return color;
    }

    public Dog getMother() {
        return mother;
    }

    public Dog getFather() {
        return father;
    }

    public void swim() {
        System.out.println("Labrador is swimming");



        }

    }


