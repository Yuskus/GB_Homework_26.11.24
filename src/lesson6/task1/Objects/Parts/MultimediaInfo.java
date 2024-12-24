package lesson6.task1.Objects.Parts;

public class MultimediaInfo {
    private boolean IsWebCam;
    private Float WebCamMP;
    private boolean IsSpeakers;
    private boolean IsSpeakersStereo;
    private Integer MicCount;

    public MultimediaInfo(boolean isWebCam, boolean isSpeakers) {
        IsWebCam = isWebCam;
        IsSpeakers = isSpeakers;
    }

    public MultimediaInfo(Float webCamMP, boolean isSpeakers) {
        this(webCamMP != null, isSpeakers);
        WebCamMP = webCamMP;
    }

    public MultimediaInfo(Float webCamMP, boolean isSpeakersStereo, Integer micCount) {
        this(webCamMP != null, true);
        WebCamMP = webCamMP;
        IsSpeakersStereo = isSpeakersStereo;
        MicCount = micCount;
    }

    public boolean getIsWebCam() {
        return IsWebCam;
    }

    public Float getWebCamMP() {
        return WebCamMP;
    }

    public boolean getIsSpeakers() {
        return IsSpeakers;
    }

    public boolean getIsSpeakersStereo() {
        return IsSpeakersStereo;
    }

    public Integer getMicCount() {
        return MicCount;
    }

    public MultimediaInfo getCopy() {
        return new MultimediaInfo(WebCamMP, IsSpeakersStereo, MicCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Web cam: " + (IsWebCam ? "yes" : "no"));

        if (WebCamMP != null)
            sb.append(", Mp: " + WebCamMP);

        sb.append(", Speakers: " + (IsSpeakers ? "yes" : "no"))
                .append(", Stereo: " + (IsSpeakersStereo ? "yes" : "no"));

        if (MicCount > 0)
            sb.append(", Microphones: ").append(MicCount);

        return sb.toString();
    }
}
