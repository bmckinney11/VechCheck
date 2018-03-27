package aircommercialservices.vechcheck;

/**
 * Created by bmcki on 24/03/2018.
 */

public class Vehicles {
    String VecCompanyname;
    String VecReg;
    String VecChassisNo;
    String VecYear;
    String VecAxleNO;
    String VecBody;
    String VecDateOfi;
    public Vehicles(){

    }
    public Vehicles(String vcom, String vreg, String vch, String vyr, String vaxl, String vbod, String vdat){
        VecCompanyname= vcom;
        VecReg = vreg;
        VecChassisNo = vch;
        VecYear = vyr;
        VecAxleNO = vaxl;
        VecBody = vbod;
        VecDateOfi = vdat;
    }

    public String getVecCompanyname() {
        return VecCompanyname;
    }

    public void setVecCompanyname(String vecCompanyname) {
        VecCompanyname = vecCompanyname;
    }

    public String getVecReg() {
        return VecReg;
    }

    public void setVecReg(String vecReg) {
        VecReg = vecReg;
    }

    public String getVecChassisNo() {
        return VecChassisNo;
    }

    public void setVecChassisNo(String vecChassisNo) {
        VecChassisNo = vecChassisNo;
    }

    public String getVecYear() {
        return VecYear;
    }

    public void setVecYear(String vecYear) {
        VecYear = vecYear;
    }

    public String getVecAxleNO() {
        return VecAxleNO;
    }

    public void setVecAxleNO(String vecAxleNO) {
        VecAxleNO = vecAxleNO;
    }

    public String getVecBody() {
        return VecBody;
    }

    public void setVecBody(String vecBody) {
        VecBody = vecBody;
    }

    public String getVecDateOfi() {
        return VecDateOfi;
    }

    public void setVecDateOfi(String vecDateOfi) {
        VecDateOfi = vecDateOfi;
    }
}
