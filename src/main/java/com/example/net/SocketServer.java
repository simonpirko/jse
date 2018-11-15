package com.example.net;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    private ServerSocket serverSocket;
    public void startServerSocketConnect(){
        try {
            serverSocket = new ServerSocket(8030);
            Socket accept = serverSocket.accept();
            OutputStream outputStream = accept.getOutputStream();
            PrintStream printStream = new PrintStream(outputStream);
            printStream.print("Hello");
            outputStream.close();
            serverSocket.close();
        } catch (IOException e) {
            try {
                serverSocket.close();
            } catch (IOException e1) {
                System.out.println("Error on close socket!");
            }
        }
    }

    public static void main(String[] args) {
        new SocketServer().startServerSocketConnect();
    }
}
