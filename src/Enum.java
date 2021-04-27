
    import java.util.Scanner;

    /**
     * @author Branium Academy
     * @address https://braniumacademy.net/
     */
    // Cách sử dụng enum :
        /*
        Nhập vào một số nguyên là tháng của năm trong đoạn [0-12] từ bàn phím. Viết chương
trình sử dụng switch expression để phân loại và hiển thị các mùa trong năm. Sử dụng enum để
mô tả các mùa. Cụ thể:
a) Tháng 1-3: mùa xuân
b) Tháng 4-6: mùa hạ
c) Tháng 7-9: mùa thu
d) Tháng 10-12: mùa đông
e) Nhập 0: thoát chương trình
f) Nhập số khác: thông báo giá trị này không hợp lệ, vui lòng nhập giá trị trong đoạn [0,12]
         */
    public class Enum {         // Enum chính là class khác với enum
        enum Season {
            SPRING("Mùa xuân"), SUMMER("Mùa hè"),
            FALL("Mùa thu"), WINTER("Mùa đông");
            private String value;  // Thuộc tính

            Season(String value) {  // Phương thức khởi tạo
                this.value = value;
            }
                                      // Getter : Lấy giá trị hằng só :
            public String getValue() {
                return value;
            }
        }

        public static void main(String[] args) {
            var input = new Scanner(System.in);
            System.out.println("Nhập giá trị số từ 0-12: ");
            var month = input.nextInt();
            // tiến hành đánh giá với switch expression
            var season = getSeason(month);
            System.out.println("Tháng " + month + " là " + season);
        }

        /**
         * trả về mùa của năm dựa vào tháng cho trước
         *
         * @param month tháng cho trước
         * @return tên mùa bằng tiếng việt
         */
        private static String getSeason(int month) {
            String season = switch (month) {
                case 0 -> "Kết thúc chương trình ";
                case 1, 2, 3 -> Season.SPRING.getValue();
                case 4, 5, 6 -> Season.SUMMER.getValue();
                case 7, 8, 9 -> Season.FALL.getValue();
                case 10, 11, 12 -> Season.WINTER.getValue();
                default -> "Nhập sai r mời bạn nhập lại ";
            };
            return season;
        }
    }

