package xust;

import java.util.Arrays;

/*
844. 比较含退格的字符串
给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。 

示例 1：
输入：S = "ab#c", T = "ad#c"
输出：true
解释：S 和 T 都会变成 “ac”。
示例 2：
输入：S = "ab##", T = "c#d#"
输出：true
解释：S 和 T 都会变成 “”。
示例 3：
输入：S = "a##c", T = "#a#c"
输出：true
解释：S 和 T 都会变成 “c”。
示例 4：
输入：S = "a#c", T = "b"
输出：false
解释：S 会变成 “c”，但 T 仍然是 “b”。
 
提示：
1 <= S.length <= 200
1 <= T.length <= 200
S 和 T 只含有小写字母以及字符 '#'。
 */
/*
 * 分析：
 * 函数RemoveBackspace用来执行字符串的退格，返回退格后的结果，S、T执行退格，比较退格后的两个字符串是否相同即可。
 */
//public class Test_0227 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		String S = "isfcow#";
//		String T = "isfco#w#";
//		System.out.println(So.backspaceCompare(S, T));
//	}
//}
//class Solution {
//    public boolean backspaceCompare(String S, String T) {
//        return RemoveBackspace(S).equals(RemoveBackspace(T));
//    }
//    private String RemoveBackspace(String S){
//    	int i=0;
//    	while(i>=0 && i<S.length()){
//        	if(S.charAt(i) == '#'){
//        		if(i-1>=0 && i+1<S.length())
//        			S = S.substring(0,i-1) + S.substring(i+1);
//        		else if(i-1>=0 && i+1>=S.length())
//        			S = S.substring(0,i-1);
//        		else if(i-1<0 && i+1<S.length()){
//        			S = S.substring(i+1);
//        			i++;
//        		}
//        		else
//        			S= "";
//        		i--;
//        	}
//        	else{
//        		i++;
//        	}
//        }
//    	return S;
//    }
//}
/*
849. 到最近的人的最大距离
 在一排座位（ seats）中，1 代表有人坐在座位上，0 代表座位上是空的。
至少有一个空座位，且至少有一人坐在座位上。
亚历克斯希望坐在一个能够使他与离他最近的人之间的距离达到最大化的座位上。
返回他到离他最近的人的最大距离。

示例 1：
输入：[1,0,0,0,1,0,1]
输出：2
解释：
如果亚历克斯坐在第二个空位（seats[2]）上，他到离他最近的人的距离为 2 。
如果亚历克斯坐在其它任何一个空位上，他到离他最近的人的距离为 1 。
因此，他到离他最近的人的最大距离是 2 。 
示例 2：
输入：[1,0,0,0]
输出：3
解释： 
如果亚历克斯坐在最后一个座位上，他离最近的人有 3 个座位远。
这是可能的最大距离，所以答案是 3 。
提示：
1 <= seats.length <= 20000
seats 中只含有 0 和 1，至少有一个 0，且至少有一个 1。
 */
/*
 * 分析：
 * 出现最大距离可能的情况有:
 * 1. 第一个座位到第一个人坐的位置之间（坐在第一个位置，距离为）；
 * 2. 最后一个人做的位置到最后一个位置之间（坐在最后一个位置）；
 * 3. 两人坐的位置之间（坐在两人最中间的位置）；
 * 判断这三种情况下他离最近的人的最大距离。
 */
//public class Test_0227 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		int[] seats = {1,0,0,0,1,0,1};
//		System.out.println(So.maxDistToClosest(seats));		
//	}
//}
//class Solution {
//    public int maxDistToClosest(int[] seats) {
//        int max = 0;
//        int flag = -1;
//        for(int i=0; i<seats.length; i++){
//        	if(flag == -1 && seats[i] == 1){
//        		max = i;
//        		flag = i;
//        	}
//        	else if(seats[i] == 1){
//        		max = Math.max(max, (i-flag)/2);
//            	flag = i;	
//        	}
//        }
//        return Math.max(max, seats.length-1-flag);
//    }
//}
/*
852. 山脉数组的峰顶索引
我们把符合下列属性的数组 A 称作山脉：
A.length >= 3
存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] 的 i 的值。
 
示例 1：
输入：[0,1,0]
输出：1
示例 2：
输入：[0,2,1,0]
输出：1

提示：
3 <= A.length <= 10000
0 <= A[i] <= 10^6
A 是如上定义的山脉
 */
/*
 * 分析：
 * 遍历数组，返回极大值时的索引，求出时直接跳出循环。
 */
//public class Test_0227 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		int[] A = {0,1,0};	
//		System.out.println(So.peakIndexInMountainArray(A));
//	}
//}
//class Solution {
//    public int peakIndexInMountainArray(int[] A) {
//    	int max_index = 0;
//        for(int i=1; i<A.length; i++){
//        	if (A[i] > A[max_index])
//        		max_index = i;
//        	else
//        		break;
//        }
//        return max_index;
//    }
//}
/*
532. 数组中的K-diff数对
 给定一个整数数组和一个整数 k, 你需要在数组里找到不同的 k-diff 数对。这里将 k-diff 数对定义为一个整数对 (i, j), 其中 i 和 j 都是数组中的数字，且两数之差的绝对值是 k.

示例 1:
输入: [3, 1, 4, 1, 5], k = 2
输出: 2
解释: 数组中有两个 2-diff 数对, (1, 3) 和 (3, 5)。
尽管数组中有两个1，但我们只应返回不同的数对的数量。
示例 2:
输入:[1, 2, 3, 4, 5], k = 1
输出: 4
解释: 数组中有四个 1-diff 数对, (1, 2), (2, 3), (3, 4) 和 (4, 5)。
示例 3:
输入: [1, 3, 1, 5, 4], k = 0
输出: 1
解释: 数组中只有一个 0-diff 数对，(1, 1)。
注意:
数对 (i, j) 和数对 (j, i) 被算作同一数对。
数组的长度不超过10,000。
所有输入的整数的范围在 [-1e7, 1e7]。
 */
public class Test_0227 {
	public static void main(String[] args) {
		Solution So = new Solution();
		int[] nums = {-1,0,0,1,0,0,-1}; 
		int k = 1;
		System.out.println(So.findPairs(nums, k));
	}
}
class Solution {
    public int findPairs(int[] nums, int k) {
    	int count = 0;
    	if(k==0){
    		Arrays.sort(nums);
    		int i=0;
    		while(i<nums.length){
    			int j=i+1;
    			int flag = 0;
    			while(j<nums.length){
    				if(nums[j] == nums[i]){
    					if(flag == 0){
    						count++;
        					flag = 1;
    					}
    					j++;	
    				}
    				else
    					break;
    			}
    			i = j;
    		}
    		return count;
    	}
    	//去重
    	int p=0;//q之前
    	int q=0;//标记去重之前
    	for(int m=0; m<nums.length; m++){
    		while(p<q){
    			if(nums[m] != nums[p])
    				p++;
    			else
    				break;
    		}
    		if(p == q){
    			nums[q] = nums[m];
    			q++;
    		}
    		p=0;
    	}
        for(int i=0; i<q; i++){
        	for(int j=0;j<q; j++){
        		if(i != j && Math.abs(nums[i]-nums[j]) == k){
        			count++;
        		}
        	}
        }
        return count/2;
    }
}