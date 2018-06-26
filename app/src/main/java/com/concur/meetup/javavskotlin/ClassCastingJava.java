package com.concur.meetup.javavskotlin;

import android.util.Log;

public class ClassCastingJava {

    public interface User {

        String getName();
    }

    public static class LocalUser implements User {

        @Override
        public String getName() {
            return "Honza";
        }

        public long getStationId() {
            return 42;
        }
    }

    public static class RemoteUser implements User {

        @Override
        public String getName() {
            return "Vladimir";
        }

        public String getIpAddress() {
            return "2001:0db8:85a3:0000:0000:8a2e:0370:7334";
        }
    }

    public static class UserUtils {

        private static final String TAG = "ClassCastingJava";

        public static String getUserSpecifics(User user) {
            String specifics;

            if (user instanceof LocalUser) {
                final long stationId = ((LocalUser) user).getStationId();
                specifics = Long.toString(stationId);

            } else if (user instanceof RemoteUser) {
                specifics = ((RemoteUser) user).getIpAddress();

            } else {
                throw new IllegalArgumentException("Unknown user type.");
            }
            return "User " + specifics;
        }

        public static void handleUsers() {
            User localUser = new LocalUser();
            User remoteUser = new RemoteUser();

            String localSpecifics = getUserSpecifics(localUser);
            String remoteSpecifics = getUserSpecifics(remoteUser);

            Log.i(TAG, localSpecifics);
            Log.i(TAG, remoteSpecifics);
        }

        private UserUtils() { }
    }
}
