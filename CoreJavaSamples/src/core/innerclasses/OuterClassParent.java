package core.innerclasses;

public class OuterClassParent {

    public static void assertTest(){

    }

    private InnerClassChild innerClassChild;


    public static void main(String[] args) {
        final OuterClassParent outerClassParent = new OuterClassParent();
        // way 1
        outerClassParent.setInnerClassChild();
        InnerClassChild in = outerClassParent.innerClassChild;
        in.tellMe();

        // way 2
        final OuterClassParent.InnerClassChild innerClassChild = outerClassParent.new InnerClassChild();
        innerClassChild.tellMe();

        String X =  "something";
    }

    public void setInnerClassChild() {
        innerClassChild = new InnerClassChild();
    }


    class InnerClassChild {
        public void tellMe() {
            System.out.println("XYZ");
        }
    }
}
