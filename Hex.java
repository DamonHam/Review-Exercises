public class Hex {  
    private final int value;  

    public Hex(int value) {  
        this.value = value;  
    }  
  
    public int valueOf() {  
        return value;  
    }  
  
    public String toJSON() {  
        return toString();  
    }  
  
    public String toString() {  
        return "0x" + Integer.toHexString(value).toUpperCase();  
    }  
  
    public Hex plus(Hex other) {  
        return new Hex(this.value + other.value);  
    }  
  
    public Hex minus(Hex other) {  
        return new Hex(this.value - other.value);  
    }  
  
    public Hex plus(int number) {  
        return new Hex(this.value + number);  
    }  
  
    public Hex minus(int number) {  
        return new Hex(this.value - number);  
    }  
  
    public static int parse(String string) {  
        string = string.startsWith("0x") ? string.substring(2) : string;  
        return Integer.parseInt(string, 16);  
    }  
  
    public boolean equals(Object other) {  
        if (this == other) return true;  
        if (!(other instanceof Hex)) return false;  
        Hex hex = (Hex) other;  
        return value == hex.value;  
    }  
}  