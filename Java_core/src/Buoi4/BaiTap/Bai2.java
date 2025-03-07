package Buoi4.BaiTap;

public class Bai2 {
    public static boolean isValidPhoneNumber(String phone) {
        int length = phone.length();
        if (length < 9 || length > 13) {
            return false;
        }

        int digitCount = 0;
        for (int i = 0; i < length; i++) {
            char ch = phone.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digitCount++;
            } else if (ch != '+' && ch != '-' && ch != '.') {
                return false;
            }
        }

        if (digitCount == 9 && (phone.startsWith("0") || phone.startsWith("84") || phone.startsWith("+84"))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] testCases = {"+84912345678", "091-234-5678", "8481234567", "0912.345.678", "0123456789", "0841234"};

        System.out.println("--- Kiểm tra số điện thoại ---");
        for (String phone : testCases) {
            System.out.println(phone + " : " + (isValidPhoneNumber(phone) ? "Hợp lệ" : "Không hợp lệ"));
        }
    }
}
