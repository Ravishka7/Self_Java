package com.tutorial.arrays;

public class TwoD {
    public static void main(String[] args) {
        int arr[][] = { {1,2,3,4}, {5,4,0,6}, {7,8,9,2} };
        String name[][] = { {"Bill","John","Phoebe"}, {"Sean","Rach","Chandler"}, {"Ross", "Joey", "Monica"} };
        float dec[][] = { {2.1F,2.2F, 2.3F}, {1.2F,1.5F,6.9F}, {4.5F,9.6F,6.9F}};

        for (int i=0; i<3; i++){
            for (int j=0; j<4; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(arr[2][1]);
        System.out.println();

        for (int l=0; l<3; l++){
            for (int m=0; m<3; m++){
                System.out.print(name[l][m] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(name[2][1]);
        System.out.println();

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(dec[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(dec[0][2]);
    }
}
