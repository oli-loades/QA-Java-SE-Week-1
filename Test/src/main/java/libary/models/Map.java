package libary.models;

public class Map extends Item{
    private String type;
    private String region;

    public Map(int ID, boolean inStock,String type, String region){
        super(ID,inStock) ;
        this.type = type;
        this.region = region;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
