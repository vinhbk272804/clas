package abcd;

public class TestSinhvien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DanhSachSinhVien qlsv=new DanhSachSinhVien();
		SinhVien teo=new SinhVien();
		teo.setMasv("113");
		teo.setTensv("Nguyễn Văn Tèo");
		qlsv.addSinhvien(teo);
		SinhVien ty=new SinhVien();
		ty.setMasv("114");
		ty.setTensv("Nguyễn Thị tý");
		qlsv.addSinhvien(ty);
		System.out.println(qlsv);
	}

}
