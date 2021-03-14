package com.lagou.education.homework.primary.module1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 双色球开奖
 * <p>
 * 实现双色球抽奖游戏中奖号码的生成，中奖号码由 6 个红球号码和 1 个蓝球号码组成。
 * 其中红球号码要求随机生成 6 个 1~33 之间不重复的随机号码。
 * 其中蓝球号码要求随机生成 1 个 1~16 之间的随机号码。
 * </p>
 *
 * @author G
 * @since 2021/3/14
 */
public class DoubleColorBallLottery {
    /**
     * 随机池
     */
    private static final Random DEFAULT_RANDOM = new Random();

    /**
     * 默认红色号码池深度
     */
    public static final int DEFAULT_RED_NUMBER_POOL_DEEP = 33;

    /**
     * 默认红色奖池深度
     */
    public static final int DEFAULT_RED_LOTTERY_POOL_DEEP = 6;

    /**
     * 默认蓝色号码池深度
     */
    public static final int DEFAULT_BLUE_NUMBER_POOL_DEEP = 16;

    /**
     * 默认蓝色奖池深度
     */
    public static final int DEFAULT_BLUE_LOTTERY_POOL_DEEP = 1;

    /**
     * 初始化号码池
     *
     * @param deep 奖池深度
     */
    private static List<Integer> initNumberPool(int deep) {
        List<Integer> pool = new ArrayList<>();
        for (int i = 0; i < deep; i++) {
            pool.add(i + 1);
        }
        return pool;
    }

    /**
     * 获取红色奖池
     *
     * @param redNumberPool 红色号码池
     * @return
     */
    private static List<Integer> getRedLottery(List<Integer> redNumberPool) {
        return getLottery(redNumberPool, DEFAULT_RED_LOTTERY_POOL_DEEP);
    }

    /**
     * 获取蓝色奖池
     *
     * @param blueNumberPool 蓝色号码池
     * @return
     */
    private static List<Integer> getBlueLottery(List<Integer> blueNumberPool) {
        return getLottery(blueNumberPool, DEFAULT_BLUE_LOTTERY_POOL_DEEP);
    }

    /**
     * 获取奖池号码
     *
     * @param numberPool    号码池
     * @param lotteryAmount 奖牌数
     * @return lotteryList
     */
    private static List<Integer> getLottery(List<Integer> numberPool, int lotteryAmount) {
        List<Integer> lotteryList = new ArrayList<>();
        for (int i = 0; i < lotteryAmount; i++) {
            int position = Math.abs(1 + (DEFAULT_RANDOM.nextInt() * 1000)) % numberPool.size();
            lotteryList.add(numberPool.get(position));
            numberPool.remove(position);
        }
        return lotteryList;
    }

    public static void main(String[] args) {
        // 初始化号码池
        List<Integer> redNumberPool = initNumberPool(DEFAULT_RED_NUMBER_POOL_DEEP);
        List<Integer> blueNumberPool = initNumberPool(DEFAULT_BLUE_NUMBER_POOL_DEEP);
        // 获取奖牌池
        List<Integer> redLottery = getRedLottery(redNumberPool);
        List<Integer> blueLottery = getBlueLottery(blueNumberPool);
        System.out.println("输出红色球号码:" + redLottery);
        System.out.println("输出蓝色球号码" + blueLottery);
    }
}