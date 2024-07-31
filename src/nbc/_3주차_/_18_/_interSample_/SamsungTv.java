package nbc._3주차_._18_._interSample_;

public class SamsungTv extends Tv implements MultiRemoteController{

    public SamsungTv(String company) {
        super(company);
    }

    @Override
    public void turnOnOff() {
        setPower(!isPower());
        displayPower(getCompany(), isPower());
    }

    @Override
    public void channelUp() {
        setChannel(getChannel() + 1);
        displayChannel(getChannel());
    }

    @Override
    public void channelDown() {
        setChannel(getChannel() - 1);
        displayChannel(getChannel());
    }

    @Override
    public void volumeUp() {
        setVolume(getVolume() + 1);
        displayVolume(getVolume());
    }

    @Override
    public void volumeDown() {
        setVolume(getVolume() - 1);
        displayVolume(getVolume());
    }
}
