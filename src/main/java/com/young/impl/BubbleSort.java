package com.young.impl;

import org.junit.Test;

import java.util.Random;

/***
 * @Author lvsy
 * @Date 2018/8/15 14:29
 * 冒泡排序，整数
 ***/
public class BubbleSort {


    @Test
    public void test(){
        int[] array = generateArry();
        System.out.println("排序前：");
        printArray(array);

        bubbleSort(array);

        System.out.println("\n 排序后：");
        printArray(array);
    }

    public int[] bubbleSort(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - 1 - i; j++){
                if(array[j] < array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        printArray(array);
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }


    /**
     * 随机生成10个100以内数的数组
     * @return
     */
    public int[] generateArry(){
        int[] array = new int[10];

        Random random = new Random();

        for(int i = 0; i < 10; i++){
            array[i] = random.nextInt(100);
        }

        return array;
    }

    /**
     * 打印数组内容
     * @param array
     */
    public void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + "  ");
        }
    }

}
