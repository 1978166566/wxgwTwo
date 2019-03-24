package com.cssl.util;

/**
 * 产生数字
 */
public class PageUtil {
    public static int[] pages(int totalPage,int pageNo)
    {
        if(totalPage<=5){
            int[] i=new int[5];
            for(int s=0;s<totalPage;s++)
            {
                i[s]=s+1;
            }
            return i;
        }else if(pageNo<=3){
            int[] nums = new int[5];
            for(int i=0;i<5;i++){
                nums[i] = i+1;
            }
            return nums;
        }else if(pageNo>totalPage-3){
            int[] i=new int[5];
            for(int s=totalPage-4,index=0;s<=totalPage;s++,index++)
            {
                i[index]=s;
            }
            return i;
        }else{
            int[] i=new int[5];
            for(int s=totalPage-5,index=0;s<=totalPage-1;s++,index++)
            {
                i[index]=s;
            }
            return i;
        }
    }

}
