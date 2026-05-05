package multiThreaded;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

    public Runnable getRunnable(){
        return new Runnable(){
            @Override
            public void run(){
                String host = "localhost";
                int port = 8010;

                try {
                    // Step 1: Connect to server
                    Socket socket = new Socket(host, port);

                    // Step 2: Read response from server
                    BufferedReader fromServer = new BufferedReader(
                            new InputStreamReader(socket.getInputStream())
                    );

                    // Step 3: Print response
                    String message = fromServer.readLine();
                    System.out.println(Thread.currentThread().getId() + " Received: " + message);

                    // Step 4: Close resources
                    fromServer.close();
                    socket.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
    }

    public static void main(String[] args) {
        Client client = new Client();

        for(int i = 0; i < 100; i++){
            try {
                Thread thread = new Thread(client.getRunnable());
                thread.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}