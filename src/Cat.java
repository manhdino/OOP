public class Cat {
     /*
      Lớp Cat dùng để mô tả về con mèo
      */

    // Các thuộc tính :
        public String name;
        public float height;
        public double  weight;
        public String Color;
        public String ColorEyes;
        public int DateofBirth;
        public int year;


      // Constructors:  ( Phương thức khởi tạo mặc định )

    public Cat(String ten,float chieucao,double cannang){
        name = ten;
        height = chieucao;
        weight = cannang;
    }
    public Cat(String maulong,String maumat){
        Color = maulong;
        ColorEyes = maumat;
    }
    public Cat(int ngaySinh,int tuoi){
        DateofBirth = ngaySinh;
        year = tuoi;
    }


    // methods : Phương thức dùng để mô tả hành động :

    public void KeuMEOMEO(){
        System.out.print(name + "biết kêu Meo Meo nhưng hơi yếu");
    }



}
