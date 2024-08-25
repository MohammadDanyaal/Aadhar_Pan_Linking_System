import java.util.HashMap;
import java.util.Map;

public class AadhaarService {
    private static Map<String,Aadhar> aadharMap = new HashMap<>();
    static {
        aadharMap.put("12343345",new Aadhar("12343345", "Danyaal","Mr. Maswood Ahmed","Palia"));
        aadharMap.put("345636775",new Aadhar("345636775", "Nashit","Mr. Maswood Ahmed","palia kalan"));
    }
    public Aadhar getAadharByNumber(String aadharNumber)
    {
        return aadharMap.get(aadharNumber);
    }
}
