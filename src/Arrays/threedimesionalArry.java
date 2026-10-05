package Arrays;

public class threedimesionalArry {
    public static void main(String[] args) {

            int nums[][][]=new int[3][4][5]; //3d arary

            for (int i=0;i<nums.length;i++) {
                for (int j=0;j<nums[i].length;j++) {
                    for (int k=0;k<nums[i][j].length;k++) {
                    nums[i][j][k] = (int)(Math.random() * 10);
                }
                }
            }
            //enhanced for looop
            for (int n[][] :  nums){ //2d
                for (int[] m:n){//1d
                    //3rd varibale for k
                    for (int o:m) {//int value now came
                        System.out.print(o + " ");
                    }
                    System.out.println();
                }
            }
        System.out.println();
        }
    }

