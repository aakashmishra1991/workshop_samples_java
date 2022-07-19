package core.innerclasses;

public class WardrobeOrOuterClass {
    String name = "outerclass";
    void outerPrint(){
        WardrobeOrOuterClass oc = new WardrobeOrOuterClass();
        WardrobeOrOuterClass.LockerOrInnerClass ic= oc.new LockerOrInnerClass();
        System.out.println(ic.innerName);
    }

    class LockerOrInnerClass {
        String innerName = "innerClass";
        void innerPrint(){
            System.out.println(name);
        }
    }

}
