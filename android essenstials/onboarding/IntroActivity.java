import android.os.Bundle;

import com.github.appintro.AppIntro;
import com.github.appintro.AppIntroFragment;
import com.github.appintro.AppIntroPageTransformerType;

public class IntroActivity extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntroFragment.newInstance("Slide 1", "Description 1", R.drawable.slide1_image, 0, getColor(R.color.slide1_background)));
        addSlide(AppIntroFragment.newInstance("Slide 2", "Description 2", R.drawable.slide2_image, 0, getColor(R.color.slide2_background)));
        addSlide(AppIntroFragment.newInstance("Slide 3", "Description 3", R.drawable.slide3_image, 0, getColor(R.color.slide3_background)));

        setTransformer(new AppIntroPageTransformerType.Parallax());

        showStatusBar(true);
        setSystemBackButtonLocked(true);
        setSkipButtonEnabled(true);
        setSkipText("Skip");
        setDoneText("Done");
    }

    @Override
    protected void onSkipPressed() {
        // Handle the skip button action, if needed
        finish();
    }

    @Override
    protected void onDonePressed() {
        // Handle the done button action, if needed
        finish();
    }
}
