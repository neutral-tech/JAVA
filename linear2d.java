public class linear2d {
    double[][] A;
    linear2d(double[][] A){
        this.A=A;
    }
    void solve() {
        double c=A[1][0]/A[0][0];
        for(int i=0;i<=2;i++){
            A[1][i]=A[1][i]-c*A[0][i];
        }

        double y=A[1][2]/A[1][1];
        double x=(A[0][2]-y*A[0][1])/A[0][0];
        System.out.println("x= "+x);
        System.out.println("y= "+y);
    }


}