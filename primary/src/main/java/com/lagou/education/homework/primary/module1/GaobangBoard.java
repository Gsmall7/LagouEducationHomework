package com.lagou.education.homework.primary.module1;

/**
 * 绘制五子棋盘
 * <p>
 * 使用双重循环实现五子棋游戏棋盘的绘制，棋盘界面的具体效果如下：
 * * 0 1 2 3 4 5 6 7 8 9 a b c d e f
 * 0 + + + + + + + + + + + + + + + +
 * 1 + + + + + + + + + + + + + + + +
 * 2 + + + + + + + + + + + + + + + +
 * 3 + + + + + + + + + + + + + + + +
 * 4 + + + + + + + + + + + + + + + +
 * 5 + + + + + + + + + + + + + + + +
 * 6 + + + + + + + + + + + + + + + +
 * 7 + + + + + + + + + + + + + + + +
 * 8 + + + + + + + + + + + + + + + +
 * 9 + + + + + + + + + + + + + + + +
 * a + + + + + + + + + + + + + + + +
 * b + + + + + + + + + + + + + + + +
 * c + + + + + + + + + + + + + + + +
 * d + + + + + + + + + + + + + + + +
 * e + + + + + + + + + + + + + + + +
 * f + + + + + + + + + + + + + + + +
 * </p>
 *
 * @author G
 * @since 2021/3/14
 */
public class GaobangBoard {
    public static void main(String[] args) throws Exception {
        // 1.定义数组并填充0 ～ f的ascil码
        System.out.println("使用双重循环实现五子棋游戏棋盘的绘制，棋盘界面的具体效果如下：");
        int[] arr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
        for (int i = 0; i < arr.length; i++) {
            // 2.for循环判断右上角是否等于零，等于就打印' '
            if (0 == i) {
                System.out.print(' ');
                System.out.print(' ');
                // 3.使用for循环打印第一列
                for (int k = 0; k < arr.length; k++) {
                    System.out.print(' ');
                    System.out.print((char) arr[k]);
                    System.out.print(' ');
                }
                System.out.println();
            }
            // 4.打印第一行
            System.out.print((char) arr[i]);
            System.out.print(' ');
            // 5.使用for循环打印+
            for (int j = 0; j < arr.length; j++) {
                System.out.print(" + ");
            }
            System.out.println();
        }
    }
}