package com.solvd.enums;

public enum Values {
    
    RESIDENTIAL(Options.BUILDINGS,DefaultValues.RESIDENTIAL),
    COMMERCIAL(Options.BUILDINGS,DefaultValues.COMMERCIAL),
    INDUSTRIAL(Options.BUILDINGS,DefaultValues.INDUSTRIAL),
    NORMALS(Options.SERVICES,DefaultValues.NORMALS),
    FAST(Options.SERVICES,DefaultValues.FAST),
    LUXURIOUS(Options.SERVICES,DefaultValues.LUXURIOUS),
    NORMALW(Options.WEATHERS,DefaultValues.NORMALW),
    RAINY(Options.WEATHERS,DefaultValues.RAINY),
    DRY(Options.WEATHERS,DefaultValues.DRY);

    private Options opt;
    private DefaultValues defVal;
    
    Values(Options opt, DefaultValues defVal){
        this.opt = opt;
        this.defVal = defVal;
    }
    
    public DefaultValues getDefVal() {
        return defVal;
    }
    public Options getOpt() {
        return opt;
    }
}
