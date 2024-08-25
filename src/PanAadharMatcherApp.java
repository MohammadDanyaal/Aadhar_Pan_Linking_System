import java.util.Scanner;

public class PanAadharMatcherApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AadhaarService aadhaarService = new AadhaarService();
        PanService panService = new PanService();
        System.out.println("Enter the Aadhar number");
        String aadharNumber = sc.nextLine();

        Aadhar aadhar =aadhaarService.getAadharByNumber(aadharNumber);
        Pan pan = panService.getPanByAadharNumber(aadharNumber);
        if(aadhar!=null && pan!=null)
        {
            System.out.println("Aadhar Details = "+aadhar);
            System.out.println("Pan Details = "+pan);
        }
        else {
            System.out.println("No Match Found.......");
        }
    }
}
