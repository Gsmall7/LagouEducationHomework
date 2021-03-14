package com.lagou.education.homework.primary.module1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 数组自动扩容
 * <p>
 * 编程实现数组扩容,自定义数组长度（用户指定）。
 * 扩容规则：当已存储元素数量达到总容量的 80%时，扩容到原容量的1.5 倍。
 * 例如，原容量是 10，当输入第 8 个元素时，数组进行扩容，容量从 10 变 15。
 * </p>
 *
 * @author G
 * @since 2021/3/14
 */
public class ArrayExpand {
    public static void main(String[] args) {
        // 1、自定义数组并初始化
        System.out.println("当输入的元素数量达到总容量的 80%时进行扩容:");
        int[] arr = new int[10];
        // 定义cnt 来计数存储的元素次数
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        // 2、for循环通用户输入添加数组元素
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个元素: ");
            arr[i] = sc.nextInt();
            cnt++;
            // 3、判断数组的阀值,是否达到80%
            if (cnt >= (arr.length - 1) * 0.8) {
                // 4、达到进行数组扩容,新建一个数组
                int newLength = (int) Math.ceil(arr.length * 3 / 2);
                int[] brr = new int[newLength];
                // 5、使原数组的数据引入新数组
                System.arraycopy(arr, 0, brr, 0, arr.length);
                // 6、打印新数组长度
                System.out.println("当阀值80%扩容后的数组长度" + brr.length);
                arr = brr;
                System.out.println("扩容后的数组长度" + arr.length);
                System.out.println("元素的数量" + cnt);
                System.out.println("数组内容：" + Arrays.toString(arr));
            }
        }
    }
}