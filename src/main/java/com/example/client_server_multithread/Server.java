package com.example.client_server_multithread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;
    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;

    public Server(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
        this.socket = serverSocket.accept();
        socket.getInputStream();
    }
}
