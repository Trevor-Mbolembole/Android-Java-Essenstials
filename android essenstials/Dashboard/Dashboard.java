import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;

public class DashboardActivity extends AppCompatActivity {

    private MaterialCardView cardProfile;
    private MaterialCardView cardOrders;
    private MaterialCardView cardPayments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        MaterialToolbar dashboardToolbar = findViewById(R.id.dashboardToolbar);
        setSupportActionBar(dashboardToolbar);

        cardProfile = findViewById(R.id.cardProfile);
        cardOrders = findViewById(R.id.cardOrders);
        cardPayments = findViewById(R.id.cardPayments);

        cardProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle profile card click
                // Replace with your desired action
            }
        });

        cardOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle orders card click
                // Replace with your desired action
            }
        });

        cardPayments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle payments card click
                // Replace with your desired action
            }
        });

        // Add click listeners and handle actions for other cards as needed
    }
}
