package libary.models;

public class Map extends Item{
    private MapType type;
    private String region;

    public Map(boolean inStock,MapType type, String region){
        super(inStock) ;
        this.type = type;
        this.region = region;
    }

    public MapType getType() {
        return type;
    }

    public void setType(MapType type) {
        this.type = type;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
