/* จำนวนที่หารด้วย 3 ลงตัวที่อยู่ระหว่าง 1 และ 10000 มีกี่จำนวน  */
public class a31 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            // ตรวจสอบว่า i หารด้วย 3 และ 5 ลงตัว แต่หารด้วย 2 ไม่ลงตัว (i % 3 == 0 && i % 5 == 0 && i % 2 != 0)
            if (i % 3 == 0 && i % 5 == 0 && i % 2 != 0) {
                sum += i; // เพิ่มค่า i เข้าไปในผลรวม (sum)
            }
        }

        System.out.println("ผลรวมของจำนวนที่หารด้วย 3 และ 5 ลงตัว แต่หารด้วย 2 ไม่ลงตัวที่อยู่ระหว่าง 1 และ 1000: " + sum);
    }
}
