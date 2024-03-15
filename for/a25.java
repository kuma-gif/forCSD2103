/* เขียนโปรแกรมผลรวม จำนวนที่หารด้วย 3, 5 และ 7 ลงตัว ซึ่งอยู่ระหว่าง 1 และ 1000  */
public class a25 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            // ตรวจสอบว่า i หารด้วย 3, 5, และ 7 ลงตัว (i % 3 == 0, i % 5 == 0, และ i % 7 == 0)
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                sum += i; // เพิ่มค่า i เข้าไปในผลรวม (sum)
            }
        }

        System.out.println("ผลรวมของจำนวนที่หารด้วย 3, 5 และ 7 ลงตัวที่อยู่ระหว่าง 1 และ 1000: " + sum);
    }
}
