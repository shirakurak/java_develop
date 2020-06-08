package Ch3.instanceofSample;

public class sample331 {
    public static void main(String[] args) throws Exception {
        Object obj = new FooService("hello");

        System.out.println(obj instanceof FooService);
        System.out.println(obj instanceof AbstractBaseService);
        System.out.println(obj instanceof BaseService);
        System.out.println(obj instanceof Integer);

        if (obj instanceof FooService) {
            FooService service = (FooService) obj;
            System.out.println(service.say());
        }
    }
}