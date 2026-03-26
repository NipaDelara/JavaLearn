public class Television {
    private int channel;
    private boolean on;

    public Television() {
        this.channel = 1;
        this.on = false;
    }

    public void setChannel(int channel) {
        if (channel > 10) {
            this.channel = 1;
        } else if (channel < 1) {
            this.channel = 1;
        } else {
            this.channel = channel;
        }
    }

    public int getChannel() {
        return channel;
    }

    public boolean isOn() {
        return on;
    }

    public void pressOnOff() {
        on = !on;
    }
}