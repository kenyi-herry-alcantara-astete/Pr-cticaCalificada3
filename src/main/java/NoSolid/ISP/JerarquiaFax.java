package NoSolid.ISP;

interface Fax {
    String getTypeFax();
}

class LanFax implements Fax {
    @Override
    public String getTypeFax() {
        return "LanFax";
    }
    // codigo
}

class EFax implements Fax {
    @Override
    public String getTypeFax() {
        return "EFax";
    }
}