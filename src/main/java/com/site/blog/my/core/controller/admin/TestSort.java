package com.site.blog.my.core.controller.admin;

import org.apache.ibatis.reflection.ArrayUtil;

import java.util.Arrays;

/**
 * @className TestSort
 * @Author yueji
 * @Date 2020/9/8 20:50
 **/
public class TestSort {
    public static void main(String[] args) {
        int okc []={12,25,97,66,88,3,5,9,19};
        //冒泡排序
        //bubbleSort(okc);
        //选择排序
       // selectSort(okc);
        //快速排序
        //test
        //test
        quickSort(okc,0,okc.length-1);
        System.out.println(Arrays.toString(okc));
    }

    private static void quickSort(int[] okc,int left, int right ) {
        if(left>=right){
            return ;
        }
int temp =okc[left];
        int i=left;
        int j=right;

        while(i<j){
            while(i<j&&temp<=okc[j]){
                j--;
            }
            while(i<j&&temp>=okc[i]){
                i++;
            }
            if(i<j){
                swap(okc, i, j);
            }
        }
        okc[left] = okc[i]; // 注意，这一步必须要，填上最左边的坑
        okc[i] = temp; // 基准元素就位
        quickSort(okc, left, i - 1);    // 递归操作左边部分
        quickSort(okc, i + 1, right);   // 递归操作右边部分000000
        //99999999
    }

    private static void swap(int[] okc, int i, int j) {
        int temp = okc[i];
        okc[i] = okc[j];
        okc[j] = temp;
    }

    private static void selectSort(int[] okc) {
        int minIndex; int temp;
for(int i=0;i<okc.length-1;i++){
     minIndex=i;
for(int j=i+1;j<okc.length;j++){
if(okc[minIndex]>okc[j]){
    minIndex=j;
}
}
    temp=okc[i];
    okc[i]=okc[minIndex];
    okc[minIndex]=temp;
}

    }

    private static void bubbleSort(int[] okc) {
        for(int i=0;i<okc.length-1;i++){
            for(int j=0;j<okc.length-i-1;j++){
                if(okc[j]>okc[j+1]){
                    int temp=okc[j];
                    okc[j]=okc[j+1];
                    okc[j+1]=temp;
                }
            }
        }


    }

}
