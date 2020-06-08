package Ch3.instanceofSample;

public class FooService extends AbstractBaseService{

    public FooService(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Hello!";
    }
}