public class ClassA {

    private int x = 10;

    ClassA() {

    }

    public String toString() {
        return x + "";
    }

    public boolean equals(ClassA other) {

        if (other == null)
            return false;
        return this.x == other.x;
    }
}
