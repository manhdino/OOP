public class Student {
    /**
     * lớp Student để mô tả thông tin sinh viên
     */

        // các thuộc tính:
        public String studentId;   // mã sinh viên
        public String fullName;    // họ tên đầy đủ
        public float avgGrade;     // điểm TB
        public String email;       // địa chỉ email
        public String address;     // địa chỉ cư trú
        public String Univercity;
        public String Girlfriend;
        public int DataofBirth;
        // constructors:

        /**
         * phương thức khởi tạo mặc định
         */
        public Student(String TruongHoc,String bangai,int Ngaysinh) {
             Univercity = TruongHoc;
             Girlfriend = bangai;
             DataofBirth = Ngaysinh;
        }


        public Student(String Address,float dtb) {
            address = Address;
            avgGrade = dtb;
        }


        public Student(String name, String id) {
            studentId = id;
            fullName = name;
        }

        // các phương thức khác:

        /**
         * phương thức thể hiện hành động làm bài tập của SV
         * @param subject chứa tên môn học sinh viên cần làm bài tập
         */
        public void doHomework(String subject) {
                System.out.print(fullName + "đang làm bài tập môn " + subject);
        }
    }

