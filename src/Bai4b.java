import java.util.Scanner;

    import java.util.Scanner;

public class Bai4b {
    // Cách sử dụng enum :

    /*
    Đề bài :
    Giả sử rằng các con giáp được đánh số từ 1-12 lần lượt là Tí Sửu Dần Mão Thìn Tỵ Ngọ
Mùi Thân Dậu Tuất Hợi. Viết chương trình cho phép nhập vào một số từ 0-12 và hiển thị ra con
giáp tương ứng. Sử dụng enum để miêu tả 12 con giáp. Trong đó:
a) Nếu giá trị nhập vào từ 1-12: hiển thị tên con giáp ra màn hình
b) Nếu giá trị nhập vào là 0: Thoát chương trình
c) Nếu giá trị nhập vào là giá trị khác: Thông báo giá trị không hợp lệ, yêu cầu nhập lại.
     */
      enum ConGiap{
        Congiap1("Tí"),
        Congiap2("Sửu"),
        Congiap3("Dần"),
        Congiap4("Mão"),
        Congiap5("Thìn"),
        Congiap6("Tỵ"),
        Congiap7("Ngọ"),
        Congiap8("Mùi"),
        Congiap9("Thân"),
        Congiap10("Dậu"),
        Congiap11("Tuất"),
        Congiap12("Hợi");


        private String value;     // Thuoc tinh

        ConGiap(String value){      // Phương thức khởi tạo
            this.value = value;
        }

        public String getValue(){
            return value;
        }

        public static void main(String[] args) {
               var input = new Scanner(System.in);
            System.out.println("Nhập giá trị từ 0 -> 12 :");
              var month = input.nextInt();
              String congiap = getConGiap(month);
            System.out.println(congiap);
        }

        private static String getConGiap(int month) {
            String congiap2 = switch (month) {
                case 0 -> "Kết thúc chương trình ";
                case 1 -> ConGiap.Congiap1.getValue();
                case 2 -> ConGiap.Congiap2.getValue();
                case 3 -> ConGiap.Congiap3.getValue();
                case 4 -> ConGiap.Congiap4.getValue();
                case 5 -> ConGiap.Congiap5.getValue();
                case 6 -> ConGiap.Congiap6.getValue();
                case 7 -> ConGiap.Congiap7.getValue();
                case 8 -> ConGiap.Congiap8.getValue();
                case 9 -> ConGiap.Congiap9.getValue();
                case 10-> ConGiap.Congiap10.getValue();
                case 11 -> ConGiap.Congiap11.getValue();
                case 12 -> ConGiap.Congiap12.getValue();
                default -> "Nhập sai r mời bạn nhập lại ";
            };
            return congiap2;
        }


    }





}
