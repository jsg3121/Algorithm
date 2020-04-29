//전교 석차 구하기

import java.util.*;

public class Sukcha {
    public static void main(String[] args) {
        int[] rank = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] score = {10, 15, 38, 75, 65, 99, 100, 17, 32, 64};
        int i, j, x;

        for(i = 0; i < score.length; i++) {
            for(j = 0; j < score.length; j++) {
                if(score[i] < score[j]) rank[i]++;
            }
        }

        for(i = 0; i < score.length; i++){
            for(j = 1; j < score.length; j++) {
                if(score[j - 1] < score[j]){
                    x = score[j - 1];
                    score[j - 1] = score[j];
                    score[j] = x;
                }
            }
        }

        for(i = 0; i < rank.length; i++){
            for(j = 1; j < rank.length; j++) {
                if(rank[j - 1] > rank[j]){
                    x = rank[j - 1];
                    rank[j - 1] = rank[j];
                    rank[j] = x;
                }
            }
        }

        for(i = 0; i < rank.length; i++) {
            System.out.print(score[i] + " ");
        }

        System.out.println("");

        for(i = 0; i < rank.length; i++) {
            System.out.print(rank[i] + " ");
        }
    }
}