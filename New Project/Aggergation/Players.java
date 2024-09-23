public class Players {
    private int ShirtNo;
    private String name;


    public Players(String name,int ShirtNo){
        this.name=name;
        this.ShirtNo=ShirtNo;
    }
    
        public int getShirtNo() {
            return ShirtNo;
        }
        public String getName() {
            return name;
        }

    
        public String toString() {
            return name + " (Shirt No: " + ShirtNo + ")";
        
    }

    }


