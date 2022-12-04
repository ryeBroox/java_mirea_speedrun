package lab_2;

public class THuman {
    public class THead {
        private boolean isInjured = false;

        public void setInjured(boolean injured) {
            isInjured = injured;
        }


        public boolean getInstance() {
            return isInjured;
        }
    }

    public class THand {
        private boolean isInjured = false;

        public void setInjured(boolean injured) {
            isInjured = injured;
        }

        public boolean getInstance() {
            return isInjured;
        }
    }

    public class TLeg {
        private boolean isInjured = false;

        public void setInjured(boolean injured) {
            isInjured = injured;
        }


        public boolean getInstance() {
            return isInjured;
        }
    }

    private THead Head = new THead();
    private THand Hand = new THand();
    private TLeg Leg = new TLeg();

    public void setLegInjured(boolean injured) {
        Leg.setInjured(injured);
    }

    public void getState() {
        if (!Head.getInstance() & !Hand.getInstance() & !Leg.getInstance()) {
            System.out.println("Nothing is injured\n");
        } else {
            System.out.println("Something is injured\n");
        }
    }
}
