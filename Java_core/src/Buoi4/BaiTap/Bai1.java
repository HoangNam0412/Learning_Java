package Buoi4.BaiTap;

public class Bai1 {
        // Hàm đếm số lượng từng từ trong đoạn văn
        public static void countWords(String text) {
            String lowerText = "";
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    lowerText += (char) (ch + 32);
                } else if (ch == '.' || ch == ',' || ch == ':') {
                    continue;
                } else {
                    lowerText += ch;
                }
            }

            String[] words = lowerText.split(" ");
            String[] uniqueWords = new String[words.length];
            int[] wordCount = new int[words.length];
            int uniqueIndex = 0;

            for (int i = 0; i < words.length; i++) {
                boolean found = false;
                for (int j = 0; j < uniqueIndex; j++) {
                    if (words[i].equals(uniqueWords[j])) {
                        wordCount[j]++;
                        found = true;
                        break;
                    }
                }
                if (!found && words[i].length() > 0) {
                    uniqueWords[uniqueIndex] = words[i];
                    wordCount[uniqueIndex] = 1;
                    uniqueIndex++;
                }
            }

            System.out.println("Số lượng từng từ:");
            for (int i = 0; i < uniqueIndex; i++) {
                System.out.println(uniqueWords[i] + ": " + wordCount[i]);
            }
        }

        // Hàm viết hoa chữ cái đầu trong mỗi từ
        public static String capitalizeWords(String text) {
            String result = "";
            boolean capitalize = true;

            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (capitalize && ch >= 'a' && ch <= 'z') {
                    result += (char) (ch - 32);
                    capitalize = false;
                } else if (capitalize && ch >= 'A' && ch <= 'Z') {
                    result += ch;
                    capitalize = false;
                } else {
                    result += ch;
                }
                if (ch == ' ') {
                    capitalize = true;
                }
            }
            return result;
        }

        // Hàm xóa các nguyên âm trong câu
        public static String removeVowels(String text) {
            String result = "";
            String vowels = "aeiouAEIOUáàảãạăắằẳẵặâấầẩẫậéèẻẽẹêếềểễệíìỉĩịóòỏõọôốồổỗộơớờởỡợúùủũụưứừửữựýỳỷỹỵ";

            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                boolean isVowel = false;

                for (int j = 0; j < vowels.length(); j++) {
                    if (ch == vowels.charAt(j)) {
                        isVowel = true;
                        break;
                    }
                }
                if (!isVowel) {
                    result += ch;
                }
            }
            return result;
        }

        public static void main(String[] args) {
            String text = "Ngôn ngữ lập trình Java ban đầu được phát triển bởi Sun Microsystems do James Gosling khởi xướng và phát hành vào năm 1995. Phiên bản mới nhất của Java Standard Edition là Java SE 8. Với sự tiến bộ của Java và sự phổ biến rộng rãi của nó, nhiều cấu hình đã được xây dựng để phù hợp với nhiều loại nền tảng khác nhau. Ví dụ: J2EE cho các ứng dụng doanh nghiệp, J2ME cho các ứng dụng di động.";

            System.out.println("\n(a) Đếm số lượng từng từ:");
            countWords(text);

            System.out.println("\n(b) Viết hoa chữ cái đầu trong mỗi từ:");
            System.out.println(capitalizeWords(text));

            System.out.println("\n(c) Xóa các nguyên âm trong câu:");
            System.out.println(removeVowels(text));
        }
    }


