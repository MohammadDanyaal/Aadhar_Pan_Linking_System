import java.util.HashMap;

public class PanService {
    private static HashMap<String, Pan> panMap= new HashMap<>();
    static {
        panMap.put("EDWABCD12349", new Pan("EDWABCD12349",
                "12343345","SBI Bank","Stock,ELSS,InndexFund,FD"));
        panMap.put("EDWABCD12344", new Pan("EDWABCD12344",
                "345636775","BOI Bank","fd,real estate, stock,interest income"));
    }
    public Pan getPanByAadharNumber(String aadharNumber)
    {
        for(Pan pan:panMap.values())
        {
            if(pan.getAadharNumber().equals(aadharNumber))
            {
                return pan;
            }
        }
      return null;
    }


}
