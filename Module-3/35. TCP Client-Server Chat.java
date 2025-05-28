import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server started. Waiting for client...");

        Socket socket = server.accept();
        System.out.println("Client connected!");

        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String msg;

        while ((msg = reader.readLine()) != null) {
            System.out.println("Client: " + msg);
            System.out.print("Server: ");
            writer.println(console.readLine());
        }

        socket.close();
        server.close();
    }
}
