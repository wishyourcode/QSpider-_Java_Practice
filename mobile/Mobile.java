package mobile;

public class Mobile {
    Iphone iphone;
    Samsung samsung;
    Vivo vivo;
    Oppo oppo;

    public Iphone storeRef(Iphone iphone) {
        this.iphone = iphone;
        return iphone;
    }

    public Samsung storeRef(Samsung samsung) {
        this.samsung = samsung;
        return samsung;
    }

    public Vivo storeRef(Vivo vivo) {
        this.vivo = vivo;
        return vivo;
    }

    public Oppo storeRef(Oppo oppo) {
        this.oppo = oppo;
        return oppo;
    }
}
