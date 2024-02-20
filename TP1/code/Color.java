public enum Color{
    HEART, SPEAD, CLUB, DIAMOND ;

    public String toString(){
        
        switch (this) {
            case HEART:
                return "Heart";
                

            case SPEAD:
                return "Spead";
                

            case CLUB:
                return "Club";
        

            case DIAMOND:
                return "Diamond";
                
            
            default:
                return "";
        } 
        
        
    }
}