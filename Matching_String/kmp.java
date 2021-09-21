package Matching_String;

import java.util.Arrays;

// Pi table logic : :::     https://youtu.be/GTJr8OvyEVQ
public class kmp {

    public static void main(String[] args) {

        String text = "ababcabcabababd";

        String patten = "abcdabeabf";
        char[] t = text.toCharArray();
        char p[] = patten.toCharArray();
        int pi[] = getPitable(patten);

        int j = 0;

        int i=0;

        while (i < text.length() && j < patten.length()){
            if(t[i] == p[j]){
                i++;j++;
            }else{
                if(j!=0){
                    j = pi[j-1];
                }else{
                    i++;
                }
            }
        }
        if(j == p.length){
            System.out.println("Found");
        }

    }

    private static int[] getPitable(String patten) {
        char c[] = patten.toCharArray();
        int n = c.length;
        int arr[] = new int[n];

// check if index != 0 means there may be possibility that char at before that posiiton
int index =0;
        for(int i=1; i<c.length;){

            if(c[index] == c[i]){
                arr[i] = index+1;
                index++;
                i++;
            }else{
                if(index != 0){
                    index = arr[index-1];
                }else{
                    arr[i] = 0;
                    i++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

//        while (j < n) {
//            if (c[i] == c[j]) {
//                arr[j] = i + 1;
//                i++;
//                j++;
//            } else {
//                while (i >= 0) {
////                i = arr[i-1];
//                    if (j < n && c[i] == c[j]) {
////                    b = true;
//                        arr[j] = i + 1;
//                        j++;
//                        i++;
//
//                    } else {
//                        i--;
//                        if (i >= 0) {
//                            i = arr[i];
//
//                        } else if (j < n) {
//                            i = 0;
//                            arr[j] = 0;
//                            j++;
//                            break;
//                        }
//                    }
//
//                }
////            if(!b){
////                arr[j] = 0;
////            }
//            }
//        }

        return arr;
    }
}
