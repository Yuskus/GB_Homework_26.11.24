package lesson6.task1.Objects.Parts;

public class MultimediaInfo {
    public boolean IsWebCam = false;
    public Float WebCamMP;
    public boolean IsSpeakers = false;
    public boolean IsSpeakersStereo = false;
    public Integer MicCount = 0;

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
