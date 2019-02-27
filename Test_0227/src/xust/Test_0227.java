package xust;

import java.util.Arrays;

/*
844. �ȽϺ��˸���ַ���
���� S �� T �����ַ����������Ƿֱ����뵽�հ׵��ı��༭�����ж϶����Ƿ���ȣ������ؽ���� # �����˸��ַ��� 

ʾ�� 1��
���룺S = "ab#c", T = "ad#c"
�����true
���ͣ�S �� T ������ ��ac����
ʾ�� 2��
���룺S = "ab##", T = "c#d#"
�����true
���ͣ�S �� T ������ ������
ʾ�� 3��
���룺S = "a##c", T = "#a#c"
�����true
���ͣ�S �� T ������ ��c����
ʾ�� 4��
���룺S = "a#c", T = "b"
�����false
���ͣ�S ���� ��c������ T ��Ȼ�� ��b����
 
��ʾ��
1 <= S.length <= 200
1 <= T.length <= 200
S �� T ֻ����Сд��ĸ�Լ��ַ� '#'��
 */
/*
 * ������
 * ����RemoveBackspace����ִ���ַ������˸񣬷����˸��Ľ����S��Tִ���˸񣬱Ƚ��˸��������ַ����Ƿ���ͬ���ɡ�
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
849. ��������˵�������
 ��һ����λ�� seats���У�1 ��������������λ�ϣ�0 ������λ���ǿյġ�
������һ������λ����������һ��������λ�ϡ�
������˹ϣ������һ���ܹ�ʹ���������������֮��ľ���ﵽ��󻯵���λ�ϡ�
������������������˵������롣

ʾ�� 1��
���룺[1,0,0,0,1,0,1]
�����2
���ͣ�
���������˹���ڵڶ�����λ��seats[2]���ϣ���������������˵ľ���Ϊ 2 ��
���������˹���������κ�һ����λ�ϣ���������������˵ľ���Ϊ 1 ��
��ˣ���������������˵��������� 2 �� 
ʾ�� 2��
���룺[1,0,0,0]
�����3
���ͣ� 
���������˹�������һ����λ�ϣ�������������� 3 ����λԶ��
���ǿ��ܵ������룬���Դ��� 3 ��
��ʾ��
1 <= seats.length <= 20000
seats ��ֻ���� 0 �� 1��������һ�� 0����������һ�� 1��
 */
/*
 * ������
 * ������������ܵ������:
 * 1. ��һ����λ����һ��������λ��֮�䣨���ڵ�һ��λ�ã�����Ϊ����
 * 2. ���һ��������λ�õ����һ��λ��֮�䣨�������һ��λ�ã���
 * 3. ��������λ��֮�䣨�����������м��λ�ã���
 * �ж����������������������˵������롣
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
852. ɽ������ķ嶥����
���ǰѷ����������Ե����� A ����ɽ����
A.length >= 3
���� 0 < i < A.length - 1 ʹ��A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
����һ��ȷ��Ϊɽ�������飬�����κ����� A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] �� i ��ֵ��
 
ʾ�� 1��
���룺[0,1,0]
�����1
ʾ�� 2��
���룺[0,2,1,0]
�����1

��ʾ��
3 <= A.length <= 10000
0 <= A[i] <= 10^6
A �����϶����ɽ��
 */
/*
 * ������
 * �������飬���ؼ���ֵʱ�����������ʱֱ������ѭ����
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
532. �����е�K-diff����
 ����һ�����������һ������ k, ����Ҫ���������ҵ���ͬ�� k-diff ���ԡ����ｫ k-diff ���Զ���Ϊһ�������� (i, j), ���� i �� j ���������е����֣�������֮��ľ���ֵ�� k.

ʾ�� 1:
����: [3, 1, 4, 1, 5], k = 2
���: 2
����: ������������ 2-diff ����, (1, 3) �� (3, 5)��
����������������1��������ֻӦ���ز�ͬ�����Ե�������
ʾ�� 2:
����:[1, 2, 3, 4, 5], k = 1
���: 4
����: ���������ĸ� 1-diff ����, (1, 2), (2, 3), (3, 4) �� (4, 5)��
ʾ�� 3:
����: [1, 3, 1, 5, 4], k = 0
���: 1
����: ������ֻ��һ�� 0-diff ���ԣ�(1, 1)��
ע��:
���� (i, j) ������ (j, i) ������ͬһ���ԡ�
����ĳ��Ȳ�����10,000��
��������������ķ�Χ�� [-1e7, 1e7]��
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
    	//ȥ��
    	int p=0;//q֮ǰ
    	int q=0;//���ȥ��֮ǰ
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