class Four4 {
    public static void main(String[] args) {
        Ordinary o = new Ordinary();
        float omt = o.Amount(2.30f);
        System.out.println(omt);

        Urgent u = new Urgent();
        float ugt = u.Amount(1f);
        System.out.println(ugt);

        Lightining l = new Lightining();
        float lgt = l.Amount(7);
        System.out.println(lgt);

    }
}

class TrunkCall {
    float calllength; //in mins
    float charge;

    // Ordinary -> Rs. 2/min
    // Urgent -> Rs. 5/min
    // Lightining -> Rs.8/min
}

class Ordinary extends TrunkCall {
    float Amount(float cl) {
        charge = cl*2;
        return charge;
    }
}

class Urgent extends TrunkCall {
    float Amount(float cl) {
        charge = cl*5;
        return charge;
    }
}

class Lightining extends TrunkCall {
    float Amount(float cl) {
        charge = cl * 8;
        return charge;
    }
}

