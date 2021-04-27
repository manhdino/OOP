public class Bai2Employee {
    public static void main(String[] args) {
        Employee nhanvien = new Employee("20194325manhdeptroai", "Nguyễn Viết Mạnh", "Hải Dương", 20,
                "0866020132", "10000$", 7.5f);

        System.out.println(
                "Tên tôi là : " + nhanvien.fullname +
                        "\nmã id : " + nhanvien.id +
                        "\nQuê quán : " + nhanvien.Address +
                        "\nTuổi : " + nhanvien.age +
                        "\nSĐT : " + nhanvien.phoneNumbers +
                        "\nLương : " + nhanvien.Salary +
                        "\nKinh nghiệm trong ngành it : " + nhanvien.Experience + " năm"
        );
    }
}
