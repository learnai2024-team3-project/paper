public class ClassName {
    // Fields
    private int field1;
    private String field2;

    // Constructor
    public ClassName(int field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    // Methods
    public int getField1() {
        return field1;
    }

    public void setField1(int field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public void displayInfo() {
        System.out.println("Field1: " + field1 + ", Field2: " + field2);
    }

    public static void main(String[] args) {
        ClassName obj = new ClassName(10, "Hello");
        obj.displayInfo();
    }
}