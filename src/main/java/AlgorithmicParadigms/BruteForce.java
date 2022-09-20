/*
 * Copyright (c) 2022.
 * Created by devdiary2203 on 2022/9/19.
 * Thuật toán vét cạn
 * Thuật toán tìm kiếm bằng cách thử tất cả các lựa chọn có thể xảy ra.
 * Ví dụ có một mảng các số nguyên, chúng ta muốn tìm giá trị nhỏ nhất, lớn nhất trong mảng,
 * brute force sẽ duyệt qua tất cả các phần tử để tìm lời giải.
 * Ưu điểm của thuật toán này là đảm bảo luôn tìm ra được lời giải, tuy nhiên cách này là lâu nhất
 * vì vậy khi sử dụng thuật toán này cần tôi ưu lời giải sao cho hiệu quả nhất
 * Linear search tìm kiếm giá trị bằng kiểm tra lần lượt từng phần tử trong mảng cho đến khi tìm được phần tử
 * bằng giá trị cho trước, có độ phức tạp O(n)
 */

package AlgorithmicParadigms;

public class BruteForce {
    // finds the index of the minimum value in the array using the brute force method

    static int maximumIndex(int a[], int n) {
        int maxIndex = 0;
        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (maxVal < a[i]) {
                maxVal = a[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        int n = 9;
        int []nums = {2, 4, 6, 3, 5, 7, 9, 1, 8};
        int maxIndex = maximumIndex(nums, n);
        System.out.println("Solution: " + nums[maxIndex] + " at index " + maxIndex);
    }

}
