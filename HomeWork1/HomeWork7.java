package  HomeWorkAndrew.HomeWork1;

public class HomeWork7 {
    public static void main(String[] args) {
        int x = 45, b = 15;
        int x1 = -45, b1 = -15;
        {
            System.out.print("ПОбитовое NOt ~ :");
            System.out.print(~x + ",");//00101010 ~=11010101
            System.out.println(~b);//1110 ~=0001

            System.out.print(~x1 + ",");
            System.out.println(~b1);

            System.out.print("Побитовый AND & (с присваениеи) :");
            System.out.print((x & b) + ",");
            System.out.println((x1 & b1) + ";");
            System.out.print((x &= b) + ",");
            System.out.println((x1 &= b1) + ";");
        }
        int x2 = 45, b2 = 15;
        int x3 = -45, b3 = -15;

        {
            System.out.print("ПОбитовое OR | (с присваениеи) :");
            System.out.print((x2 | b2) + ",");
            System.out.println((x3 | b3) + ";");
            System.out.print((x2 |= b2) + ",");
            System.out.println((x3 |= b3) + ";");
        }
        {
            int x4 = 45, b4 = 15;
            int x5 = -45, b5 = -15;

            System.out.print("Побитовое исключающее Or :");
            System.out.print((x4 ^ b4) + ",");
            System.out.println(x5 ^ b5);
            System.out.println(x4 ^= b4);
            System.out.println(x5 ^= b5);
        }
        {
            int x7 = 45, b7 = 15;
            int x8 = -45, b8 = -15;

            System.out.println("Сдвиг влево (с присваениеи) :");
            System.out.println(x7 << b7);
            System.out.println(x7 <<= b7);
            System.out.println(x8 << b8);
            System.out.println(x8 <<= b8);
        }
        {
            int xc = 45, bc = 15;
            int xz = -45, bz = -15;

            System.out.println("Сдвиг вправо (с присваениеи)");
            System.out.println(xc >> bc);
            System.out.println(xz >> bz);
            System.out.println(xc >>= bc);
            System.out.println(xz >>= bz);
        }
        {
            int xw = 45, bw = 15;
            int xq= -45, bq = -15;

            System.out.println("Сдвиг вправо с заполнениями нулями (с присваениеи)");
            System.out.println(xw >>> bw);
            System.out.println(xq >>> bq);
            System.out.println(xw >>>= bw);
        }

    }
}






