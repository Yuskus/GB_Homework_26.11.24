package lesson6.task1.Objects.Parts;

public class MultimediaInfo {
    private boolean IsWebCam = false;
    private Float WebCamMP;
    private boolean IsSpeakers = false;
    private boolean IsSpeakersStereo = false;
    private Integer MicCount = 0;

    public MultimediaInfo(boolean isWebCam, boolean isSpeakers) {
        IsWebCam = isWebCam;
        IsSpeakers = isSpeakers;
    }

    public MultimediaInfo(Float webCamMP, boolean isSpeakers) {
        WebCamMP = webCamMP;
        IsWebCam = true;
    }

    public MultimediaInfo(Float webCamMP, boolean isSpeakers, boolean isSpeakersStereo) {
        WebCamMP = webCamMP;
        IsWebCam = true;
        IsSpeakers = isSpeakers;
        IsSpeakersStereo = isSpeakersStereo;
    }

    public MultimediaInfo(Float webCamMP, boolean isSpeakersStereo, Integer micCount) {
        WebCamMP = webCamMP;
        IsWebCam = true;
        IsSpeakers = true;
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
