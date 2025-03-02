
public class User{
    private final int id;

    //constructor
    User(){
        this.id = UserIdsGenerator.getInstance().generateId();
        UserIdsGenerator.setId(this.id);
    }

    public int getId(){
        return this.id;
    }

}