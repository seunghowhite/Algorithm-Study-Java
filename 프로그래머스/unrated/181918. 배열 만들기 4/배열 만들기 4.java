import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> template= new ArrayList();
        
        int i=0;
        while(i<arr.length){
            
            if(template.size()==0){
                template.add(arr[i]);
                i=i+1;
            }
            else{
                int last=template.get(template.size()-1);
                if(template.size()!=0 && last<arr[i]){
                template.add(arr[i]);
                i=i+1;
                }
                else if(template.size()!=0 && last>=arr[i]){
                    template.remove(template.size()-1);
                }
            }
            
        }
        
        int stk[]=new int[template.size()];
        for(int k=0;k<template.size();k++){
            stk[k]=template.get(k).intValue();
        }
        return stk;
    }
}