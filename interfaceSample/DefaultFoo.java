package Ch3.interfaceSample;

public class DefaultFoo implements Foo {
    private String message;

    public DefaultFoo(String message) {
        this.message = message;
    }

    @Override
    public String say() {
        return message;
    }
}

/**
 * 以下のように使える：
 * Foo foo = new DefaultFoo("Hello Foo!");
 * System.out.println(foo.say());
 */