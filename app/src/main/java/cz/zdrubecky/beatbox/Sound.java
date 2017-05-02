package cz.zdrubecky.beatbox;

public class Sound {
    private String mAssetPath;
    private String mName;
    // Integer can have a null value
    private Integer mSoundId;

    public Sound(String assetPath) {
        // This path is only usable through an AssetManager, because they're hidden from the File class's scope
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String filename = components[components.length - 1];
        mName = filename.replace(".wav", "");
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    public String getName() {
        return mName;
    }

    public Integer getSoundId() {
        return mSoundId;
    }

    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }
}
