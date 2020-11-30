package Models;

public class VehicleRestoration{

    
    String ID;
    String Vehicleld;
    String Prefer;
    double Cost;
    String Customerld;
    int StartingDate;
    int EndingDate ;
    String Status;

    public VehicleRestoration(String ID, String V, String P, double C, String Cus, int S, int E, String St) {
        this.ID = ID;
        this.Vehicleld = V;
        this.Prefer = P;
        this.Cost = C;
        this.Customerld = Cus;
        this.StartingDate = S;
        this.EndingDate = E;
        this.Status = Status;
    }

    
}
