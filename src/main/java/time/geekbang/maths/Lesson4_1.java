package time.geekbang.maths;

/**
 *Lesson 4_1 数学归纳法
 * 1、数学归纳法和归纳有什么不一样？
 *    平时我们谈的“归纳”，是一种从经验事实中找出普遍特征的认知方法。
 *    数学归纳法的一般步骤是：证明基本情况是否成立；
 *    再假设n=k-1成立，证明n=k也是成立的。
 * 2、数学归纳法和迭代法有什么不一样？
 *    和迭代法相比，数学归纳法最大的特点就在“归纳”二字。
 *    它已经总结出了规律。只要我们能够证明这个规律是正确的，
 *    就没有必要进行逐步的推算，可以节省很多的时间和资源。
 * 3、递归调用和数学归纳的逻辑是一样的！
 *    只要数学归纳证明的逻辑是对的，递归调用的逻辑就是对的，没有必要
 *    纠结递归函数是如何嵌套调用和返回的。
 * Created by J.zhu on 2019/5/27.
 */
public class Lesson4_1 {

    /**
     * 递归调用，数学归纳法证明
     * @param k- 当前格子数
     * @param result- 当前格子麦粒数和麦子总数
     * @return boolean- 当前格子是否成立
     */
    public static boolean prove(int k, Result result){
        if(k == 1){
            if((Math.pow(2,1)-1) == 1){
                result.wheatNum = 1;
                result.wheatTotalNum = 1;
                return true;
            }else {
                return false;
            }
        }else {
            // 证明前一步是否成立
            boolean proveOfPreviousOne = prove(k-1,result);
            if(proveOfPreviousOne){
                result.wheatNum *= 2;
                result.wheatTotalNum += result.wheatNum;
                boolean proveOfCurrentOne = false;
                if(result.wheatTotalNum == (Math.pow(2,k)-1)){
                    proveOfCurrentOne = true;
                }
                return proveOfCurrentOne;
            }else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Result result = new Result();
        int k = 63;
        boolean prove = prove(k, result);
        System.out.println(String.format("第 %d 格是否成立：%b\n" +
                "当前格子麦子数： %d \n" +
                "当前麦粒总数 %d",
                k, prove,
                result.wheatNum,
                result.wheatTotalNum));
    }

}

class Result {
    /**
     * 当前格子麦粒数量
     */
    public long wheatNum;
    /**
     * 麦粒总数
     */
    public long wheatTotalNum;
}
