public class Testing {
    public static void main(String[] args) {
        AplicationStackingCloth test = new AplicationStackingCloth(10);
        test.push(new Baju(4,"H&M","Pink"));
        test.push(new Baju(5,"ZALORA","BIRU"));
        test.push(new Baju(6,"ZALORA","hijau"));
        test.push(new Baju(7,"SHOPIEPARIS","Abu-abu"));
        test.push(new Baju(8,"CK","Ungu"));
        test.push(new Baju(4,"SHOPIEPARIS","Hitam"));
        test.push(new Baju(3,"H&M","Merah"));
        test.push(new Baju(2,"H&M","Coklat"));
        test.push(new Baju(9,"H&M","Emas"));
        test.push(new Baju(4,"CK","Oren"));
        System.out.println(test.pop().merk);
    }
}
