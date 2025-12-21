public class OTPGenerator {

    // Method to generate 6-digit OTP
    static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000);
    }

    // Method to check uniqueness of OTPs
    static boolean isUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {

        int[] otps = new int[10];

        // Generate OTPs
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Display OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Check uniqueness
        System.out.println("\nAll OTPs Unique: " + isUnique(otps));
    }
}
