// Autogenerated from Pigeon (v4.2.5), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package com.natureglobal.opentok_flutter;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;

/**
 * Generated class from Pigeon.
 */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression"})
public class OpenTok {

    @NonNull
    private static Map<String, Object> wrapError(@NonNull Throwable exception) {
        Map<String, Object> errorMap = new HashMap<>();
        errorMap.put("message", exception.toString());
        errorMap.put("code", exception.getClass().getSimpleName());
        errorMap.put("details", "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
        return errorMap;
    }

    public enum ConnectionState {
        LOGGED_OUT(0),
        LOGGED_IN(1),
        WAIT(2),
        ON_CALL(3),
        ERROR(4);

        private int index;

        private ConnectionState(final int index) {
            this.index = index;
        }
    }

    /**
     * Generated interface from Pigeon that represents a handler of messages from Flutter.
     */
    public interface OpenTokHostApi {
        /**
         * The codec used by OpenTokHostApi.
         */
        static MessageCodec<Object> getCodec() {
            return OpenTokHostApiCodec.INSTANCE;
        }

        /**
         * Sets up an instance of `OpenTokHostApi` to handle messages through the `binaryMessenger`.
         */
        static void setup(BinaryMessenger binaryMessenger, OpenTokHostApi api) {
            {
                BasicMessageChannel<Object> channel =
                        new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.OpenTokHostApi.initSession", getCodec());
                if (api != null) {
                    channel.setMessageHandler((message, reply) -> {
                        Map<String, Object> wrapped = new HashMap<>();
                        try {
                            ArrayList<Object> args = (ArrayList<Object>) message;
                            assert args != null;
                            OpenTokConfig configArg = (OpenTokConfig) args.get(0);
                            if (configArg == null) {
                                throw new NullPointerException("configArg unexpectedly null.");
                            }
                            api.initSession(configArg);
                            wrapped.put("result", null);
                        } catch (Error | RuntimeException exception) {
                            wrapped.put("error", wrapError(exception));
                        }
                        reply.reply(wrapped);
                    });
                } else {
                    channel.setMessageHandler(null);
                }
            }
            {
                BasicMessageChannel<Object> channel =
                        new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.OpenTokHostApi.endSession", getCodec());
                if (api != null) {
                    channel.setMessageHandler((message, reply) -> {
                        Map<String, Object> wrapped = new HashMap<>();
                        try {
                            api.endSession();
                            wrapped.put("result", null);
                        } catch (Error | RuntimeException exception) {
                            wrapped.put("error", wrapError(exception));
                        }
                        reply.reply(wrapped);
                    });
                } else {
                    channel.setMessageHandler(null);
                }
            }
            {
                BasicMessageChannel<Object> channel =
                        new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.OpenTokHostApi.toggleCamera", getCodec());
                if (api != null) {
                    channel.setMessageHandler((message, reply) -> {
                        Map<String, Object> wrapped = new HashMap<>();
                        try {
                            api.toggleCamera();
                            wrapped.put("result", null);
                        } catch (Error | RuntimeException exception) {
                            wrapped.put("error", wrapError(exception));
                        }
                        reply.reply(wrapped);
                    });
                } else {
                    channel.setMessageHandler(null);
                }
            }
            {
                BasicMessageChannel<Object> channel =
                        new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.OpenTokHostApi.toggleAudio", getCodec());
                if (api != null) {
                    channel.setMessageHandler((message, reply) -> {
                        Map<String, Object> wrapped = new HashMap<>();
                        try {
                            ArrayList<Object> args = (ArrayList<Object>) message;
                            assert args != null;
                            Boolean enabledArg = (Boolean) args.get(0);
                            if (enabledArg == null) {
                                throw new NullPointerException("enabledArg unexpectedly null.");
                            }
                            api.toggleAudio(enabledArg);
                            wrapped.put("result", null);
                        } catch (Error | RuntimeException exception) {
                            wrapped.put("error", wrapError(exception));
                        }
                        reply.reply(wrapped);
                    });
                } else {
                    channel.setMessageHandler(null);
                }
            }
            {
                BasicMessageChannel<Object> channel =
                        new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.OpenTokHostApi.toggleVideo", getCodec());
                if (api != null) {
                    channel.setMessageHandler((message, reply) -> {
                        Map<String, Object> wrapped = new HashMap<>();
                        try {
                            ArrayList<Object> args = (ArrayList<Object>) message;
                            assert args != null;
                            Boolean enabledArg = (Boolean) args.get(0);
                            if (enabledArg == null) {
                                throw new NullPointerException("enabledArg unexpectedly null.");
                            }
                            api.toggleVideo(enabledArg);
                            wrapped.put("result", null);
                        } catch (Error | RuntimeException exception) {
                            wrapped.put("error", wrapError(exception));
                        }
                        reply.reply(wrapped);
                    });
                } else {
                    channel.setMessageHandler(null);
                }
            }
            {
                BasicMessageChannel<Object> channel =
                        new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.OpenTokHostApi.onPause", getCodec());
                if (api != null) {
                    channel.setMessageHandler((message, reply) -> {
                        Map<String, Object> wrapped = new HashMap<>();
                        try {
                            api.onPause();
                            wrapped.put("result", null);
                        } catch (Error | RuntimeException exception) {
                            wrapped.put("error", wrapError(exception));
                        }
                        reply.reply(wrapped);
                    });
                } else {
                    channel.setMessageHandler(null);
                }
            }
            {
                BasicMessageChannel<Object> channel =
                        new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.OpenTokHostApi.onResume", getCodec());
                if (api != null) {
                    channel.setMessageHandler((message, reply) -> {
                        Map<String, Object> wrapped = new HashMap<>();
                        try {
                            api.onResume();
                            wrapped.put("result", null);
                        } catch (Error | RuntimeException exception) {
                            wrapped.put("error", wrapError(exception));
                        }
                        reply.reply(wrapped);
                    });
                } else {
                    channel.setMessageHandler(null);
                }
            }
            {
                BasicMessageChannel<Object> channel =
                        new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.OpenTokHostApi.onStop", getCodec());
                if (api != null) {
                    channel.setMessageHandler((message, reply) -> {
                        Map<String, Object> wrapped = new HashMap<>();
                        try {
                            api.onStop();
                            wrapped.put("result", null);
                        } catch (Error | RuntimeException exception) {
                            wrapped.put("error", wrapError(exception));
                        }
                        reply.reply(wrapped);
                    });
                } else {
                    channel.setMessageHandler(null);
                }
            }
        }

        void initSession(@NonNull OpenTokConfig config);

        void endSession();

        void toggleCamera();

        void toggleAudio(@NonNull Boolean enabled);

        void toggleVideo(@NonNull Boolean enabled);

        void onPause();

        void onResume();

        void onStop();
    }

    /**
     * Generated class from Pigeon that represents data sent in messages.
     */
    public static class ConnectionStateCallback {
        private @NonNull
        ConnectionState state;
        private @Nullable
        String errorDescription;

        /**
         * Constructor is private to enforce null safety; use Builder.
         */
        private ConnectionStateCallback() {
        }

        static @NonNull
        ConnectionStateCallback fromMap(@NonNull Map<String, Object> map) {
            ConnectionStateCallback pigeonResult = new ConnectionStateCallback();
            Object state = map.get("state");
            pigeonResult.setState(state == null ? null : ConnectionState.values()[(int) state]);
            Object errorDescription = map.get("errorDescription");
            pigeonResult.setErrorDescription((String) errorDescription);
            return pigeonResult;
        }

        public @NonNull
        ConnectionState getState() {
            return state;
        }

        public void setState(@NonNull ConnectionState setterArg) {
            if (setterArg == null) {
                throw new IllegalStateException("Nonnull field \"state\" is null.");
            }
            this.state = setterArg;
        }

        public @Nullable
        String getErrorDescription() {
            return errorDescription;
        }

        public void setErrorDescription(@Nullable String setterArg) {
            this.errorDescription = setterArg;
        }

        @NonNull
        Map<String, Object> toMap() {
            Map<String, Object> toMapResult = new HashMap<>();
            toMapResult.put("state", state == null ? null : state.index);
            toMapResult.put("errorDescription", errorDescription);
            return toMapResult;
        }

        public static final class Builder {
            private @Nullable
            ConnectionState state;
            private @Nullable
            String errorDescription;

            public @NonNull
            Builder setState(@NonNull ConnectionState setterArg) {
                this.state = setterArg;
                return this;
            }

            public @NonNull
            Builder setErrorDescription(@Nullable String setterArg) {
                this.errorDescription = setterArg;
                return this;
            }

            public @NonNull
            ConnectionStateCallback build() {
                ConnectionStateCallback pigeonReturn = new ConnectionStateCallback();
                pigeonReturn.setState(state);
                pigeonReturn.setErrorDescription(errorDescription);
                return pigeonReturn;
            }
        }
    }

    /**
     * Generated class from Pigeon that represents data sent in messages.
     */
    public static class OpenTokConfig {
        private @NonNull
        String apiKey;
        private @NonNull
        String sessionId;
        private @NonNull
        String token;

        /**
         * Constructor is private to enforce null safety; use Builder.
         */
        private OpenTokConfig() {
        }

        static @NonNull
        OpenTokConfig fromMap(@NonNull Map<String, Object> map) {
            OpenTokConfig pigeonResult = new OpenTokConfig();
            Object apiKey = map.get("apiKey");
            pigeonResult.setApiKey((String) apiKey);
            Object sessionId = map.get("sessionId");
            pigeonResult.setSessionId((String) sessionId);
            Object token = map.get("token");
            pigeonResult.setToken((String) token);
            return pigeonResult;
        }

        public @NonNull
        String getApiKey() {
            return apiKey;
        }

        public void setApiKey(@NonNull String setterArg) {
            if (setterArg == null) {
                throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
            }
            this.apiKey = setterArg;
        }

        public @NonNull
        String getSessionId() {
            return sessionId;
        }

        public void setSessionId(@NonNull String setterArg) {
            if (setterArg == null) {
                throw new IllegalStateException("Nonnull field \"sessionId\" is null.");
            }
            this.sessionId = setterArg;
        }

        public @NonNull
        String getToken() {
            return token;
        }

        public void setToken(@NonNull String setterArg) {
            if (setterArg == null) {
                throw new IllegalStateException("Nonnull field \"token\" is null.");
            }
            this.token = setterArg;
        }

        @NonNull
        Map<String, Object> toMap() {
            Map<String, Object> toMapResult = new HashMap<>();
            toMapResult.put("apiKey", apiKey);
            toMapResult.put("sessionId", sessionId);
            toMapResult.put("token", token);
            return toMapResult;
        }

        public static final class Builder {
            private @Nullable
            String apiKey;
            private @Nullable
            String sessionId;
            private @Nullable
            String token;

            public @NonNull
            Builder setApiKey(@NonNull String setterArg) {
                this.apiKey = setterArg;
                return this;
            }

            public @NonNull
            Builder setSessionId(@NonNull String setterArg) {
                this.sessionId = setterArg;
                return this;
            }

            public @NonNull
            Builder setToken(@NonNull String setterArg) {
                this.token = setterArg;
                return this;
            }

            public @NonNull
            OpenTokConfig build() {
                OpenTokConfig pigeonReturn = new OpenTokConfig();
                pigeonReturn.setApiKey(apiKey);
                pigeonReturn.setSessionId(sessionId);
                pigeonReturn.setToken(token);
                return pigeonReturn;
            }
        }
    }

    private static class OpenTokHostApiCodec extends StandardMessageCodec {
        public static final OpenTokHostApiCodec INSTANCE = new OpenTokHostApiCodec();

        private OpenTokHostApiCodec() {
        }

        @Override
        protected Object readValueOfType(byte type, @NonNull ByteBuffer buffer) {
            switch (type) {
                case (byte) 128:
                    return OpenTokConfig.fromMap((Map<String, Object>) readValue(buffer));

                default:
                    return super.readValueOfType(type, buffer);

            }
        }

        @Override
        protected void writeValue(@NonNull ByteArrayOutputStream stream, Object value) {
            if (value instanceof OpenTokConfig) {
                stream.write(128);
                writeValue(stream, ((OpenTokConfig) value).toMap());
            } else {
                super.writeValue(stream, value);
            }
        }
    }

    private static class OpenTokPlatformApiCodec extends StandardMessageCodec {
        public static final OpenTokPlatformApiCodec INSTANCE = new OpenTokPlatformApiCodec();

        private OpenTokPlatformApiCodec() {
        }

        @Override
        protected Object readValueOfType(byte type, @NonNull ByteBuffer buffer) {
            switch (type) {
                case (byte) 128:
                    return ConnectionStateCallback.fromMap((Map<String, Object>) readValue(buffer));

                default:
                    return super.readValueOfType(type, buffer);

            }
        }

        @Override
        protected void writeValue(@NonNull ByteArrayOutputStream stream, Object value) {
            if (value instanceof ConnectionStateCallback) {
                stream.write(128);
                writeValue(stream, ((ConnectionStateCallback) value).toMap());
            } else {
                super.writeValue(stream, value);
            }
        }
    }

    /**
     * Generated class from Pigeon that represents Flutter messages that can be called from Java.
     */
    public static class OpenTokPlatformApi {
        private final BinaryMessenger binaryMessenger;

        public OpenTokPlatformApi(BinaryMessenger argBinaryMessenger) {
            this.binaryMessenger = argBinaryMessenger;
        }

        /**
         * The codec used by OpenTokPlatformApi.
         */
        static MessageCodec<Object> getCodec() {
            return OpenTokPlatformApiCodec.INSTANCE;
        }

        public void onStateUpdate(@NonNull ConnectionStateCallback connectionStateArg, Reply<Void> callback) {
            BasicMessageChannel<Object> channel =
                    new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.OpenTokPlatformApi.onStateUpdate", getCodec());
            channel.send(new ArrayList<Object>(Collections.singletonList(connectionStateArg)), channelReply -> {
                callback.reply(null);
            });
        }

        public interface Reply<T> {
            void reply(T reply);
        }
    }
}
