package com.example.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class SocketClient {
    private Socket socket;
    public void startSocketConnect(){
        try {
            socket = new Socket("localhost", 8030);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(bufferedReader.readLine());
            bufferedReader.close();
            socket.close();
        } catch (IOException e) {
            try {
                socket.close();
            } catch (IOException e1) {
                System.out.println("Error on close socket!");
            }
        }
    }

    public static void main(String[] args) {
        new SocketClient().startSocketConnect();
    }
}
