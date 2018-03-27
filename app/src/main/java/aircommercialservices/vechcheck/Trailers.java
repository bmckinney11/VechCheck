package aircommercialservices.vechcheck;

/**
 * Created by bmcki on 24/03/2018.
 */

public class Trailers {
    String TrCompanyname;
    String TrNICNo;
    String TrChassisNo;
    String TrYear;
    String TrAxleNO;
    String TrBody;
    String TrDateOfi;

    public Trailers(String tcom, String tnic, String tch, String tyr, String taxl, String tbod, String tdat){
        TrCompanyname = tcom;
        TrNICNo = tnic;
        TrChassisNo = tch;
        TrYear = tyr;
        TrAxleNO = taxl;
        TrBody = tbod;
        TrDateOfi = tdat;
    }

    public String getTrCompanyname() {
        return TrCompanyname;
    }

    public void setTrCompanyname(String trCompanyname) {
        TrCompanyname = trCompanyname;
    }

    public String getTrNICNo() {
        return TrNICNo;
    }

    public void setTrNICNo(String trNICNo) {
        TrNICNo = trNICNo;
    }

    public String getTrChassisNo() {
        return TrChassisNo;
    }

    public void setTrChassisNo(String trChassisNo) {
        TrChassisNo = trChassisNo;
    }

    public String getTrYear() {
        return TrYear;
    }

    public void setTrYear(String trYear) {
        TrYear = trYear;
    }

    public String getTrAxleNO() {
        return TrAxleNO;
    }

    public void setTrAxleNO(String trAxleNO) {
        TrAxleNO = trAxleNO;
    }

    public String getTrBody() {
        return TrBody;
    }

    public void setTrBody(String trBody) {
        TrBody = trBody;
    }

    public String getTrDateOfi() {
        return TrDateOfi;
    }

    public void setTrDateOfi(String trDateOfi) {
        TrDateOfi = trDateOfi;
    }
}

