import java.util.logging.Logger;

class EnumTest1 {
    public static void main(String[] args) {
        MyEnum enum1 = null;

        switch (enum1) {  //NullPointerException is thrown here
            case A:
                Logger.getGlobal().info("A");
                break;
            case B:
                Logger.getGlobal().info("B");
                break;
            default:
                Logger.getGlobal().info("default");
        }
    }
    enum MyEnum {A, B;}
}