import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {

    private String printBinary(double num) {
        if (num >= 1 || num <= 0) {
            return "ERROR";
        }

        StringBuilder binary = new StringBuilder();
        binary.append(".");

        while (num > 0) {
            if (binary.length() > 32) {  
                return "ERROR";
            }

            double r = num * 2;
            if (r >= 1) {
                binary.append(1);
                num = r - 1;
            } else {
                binary.append(0);
                num = r;
            }
        }

        return binary.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double num = Double.parseDouble(br.readLine());

        Main obj = new Main();
        String result = obj.printBinary(num);

        System.out.println(result);
    }
}
