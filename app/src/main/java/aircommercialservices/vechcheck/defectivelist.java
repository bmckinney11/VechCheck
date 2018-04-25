package aircommercialservices.vechcheck;

public class defectivelist {

    private String defectdescript;
    private String defectrank;
    private String Feature;

    defectivelist() {
    }

    public defectivelist(String defectdescript, String defectrank, String feature) {
        this.defectdescript = defectdescript;
        this.defectrank = defectrank;
        Feature = feature;
    }

    public String getDefectdescript() {
        return defectdescript;
    }

    public void setDefectdescript(String defectdescript) {
        this.defectdescript = defectdescript;
    }

    public String getDefectrank() {
        return defectrank;
    }

    public void setDefectrank(String defectrank) {
        this.defectrank = defectrank;
    }

    public String getFeature() {
        return Feature;
    }

    public void setFeature(String feature) {
        Feature = feature;
    }
}
