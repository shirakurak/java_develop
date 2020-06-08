package Ch3.instanceofSample;

public abstract class AbstractBaseService implements BaseService {

    protected String name;

    public AbstractBaseService(String name) {
        this.name = name;
    }
}