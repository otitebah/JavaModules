
public class UserIdsGenerator {
    //attributes
    private static UserIdsGenerator instance;
    private  static int lastId = 0;


    public static UserIdsGenerator getInstance(){
    if (instance == null)    
        instance = new UserIdsGenerator();
    return instance;
    }

    public int generateId(){
    return lastId + 1;
    }

    public  static void setId(int id){
        lastId = id;    
    }
}
