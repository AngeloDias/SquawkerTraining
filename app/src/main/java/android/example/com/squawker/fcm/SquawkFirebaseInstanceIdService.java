package android.example.com.squawker.fcm;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class SquawkFirebaseInstanceIdService extends FirebaseInstanceIdService {
    private static String LOG_TAG = SquawkFirebaseInstanceIdService.class.getSimpleName();

    @Override
    public void onTokenRefresh() {
        String token = FirebaseInstanceId.getInstance().getToken();

        sendRegistrationToServer(token);
    }

    private void sendRegistrationToServer(String token) {}
}
