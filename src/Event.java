public interface Event {
    void onClientConnect(String clientName, String message);

    void onClientDisconnect(String clientName, String message);

    void onMessageReceive(String clientName, String message);
    void onFileReceive(String clientName, String fileName);
}