/* เขียนโปรแกรมพิมพ์จำนวนที่หารด้วย 3 ลงตัว ซึ่งอยู่ระหว่าง 1 และ 100  */
public class a13 {
    public static void main(String[] args) {
        // ใช้ลูป for เพื่อวนลูปตั้งแต่ 1 ถึง 100
        for (int i = 1; i <= 100; i++) {
            // ตรวจสอบว่า i หารด้วย 3 ลงตัวหรือไม่
            if (i % 3 == 0) {
                // ถ้า i หารด้วย 3 ลงตัว ให้พิมพ์ค่า i ออกทางหน้าจอ
                System.out.println(i);
            }
        }
    }
}
