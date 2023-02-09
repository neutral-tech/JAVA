public class linear3d {
    double[][] A;
    linear3d(double[][] A){
        this.A=A;
    }
    void solve(){
        double c=A[1][0]/A[0][0];
        for(int i=0;i<=3;i++){
            A[1][i]=A[1][i]-c*A[0][i];
        }
        double d=A[2][0]/A[0][0];
        for(int i=0;i<=3;i++){
            A[2][i]=A[2][i]-d*A[0][i];
        }
        double e=A[2][1]/A[1][1];
        for(int i=1;i<=3;i++){
            A[2][i]=A[2][i]-e*A[1][i];
        }
        for(int i=0;i<=2;i++){
            for(int j=0;j<=3;j++){
                System.out.print(A[i][j]+"\t");
                if(j==3){
                    System.out.println();
                }
            }
        }
        double z=A[2][3]/A[2][2];
        double y=(A[1][3]-z*A[1][2])/A[1][1];
        double x=(A[0][3]-z*A[0][2]-y*A[0][1])/A[0][0];
        System.out.println();
        System.out.println("x= "+x);
        System.out.println("y= "+y);
        System.out.println("z= "+z);

    }
}
