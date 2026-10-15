package activity12;

public class Activity12 {

    public static void main(String[] args) {
        Act12ParentClass objParent = new Act12ParentClass();
        objParent.display();

        System.out.println("");

        Act12ChildClass objChild = new Act12ChildClass();
        objChild.display();
        objChild.showAge();

        System.out.println("");

        Act12ChildClass2 objChild2 = new Act12ChildClass2();
        objChild2.display();
    }
}
