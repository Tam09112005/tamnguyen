
public class bai8so2 {

    class Calculation1 {
       
        void sum(int a, int b) {
            System.out.println(a + b);
        }

        // Phương thức tính tổng ba số
        void sum(int a, int b, int c) {
            System.out.println(a + b + c);
        }
    }

    public static void main(String[] args) {
        // Tạo đối tượng từ lớp Calculation1
        bai8so2 outer = new bai8so2(); // Tạo đối tượng lớp bên ngoài
        Calculation1 obj = outer.new Calculation1(); /*// Tạo đối tượng lớp bên trong*/
        obj.sum(10, 10, 10); 
        obj.sum(20, 20); 
    }
}

