package io.github.unlp_oo.frameworks1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public abstract class SingleThreadTCPServer {

    public abstract void handleMessage(String message, PrintWriter out); // hook obligatorio para subclases

    public final void startLoop(String[] args) {
        checkArguments(args);

        int portNumber = Integer.parseInt(args[0]);

    
        try (ServerSocket serverSocket = new ServerSocket(portNumber)) {
            displaySocketInformation(portNumber);
            while (true) {
                Socket clientSocket = acceptAndDisplaySocket(serverSocket);
                handleClient(clientSocket);
            }
        } catch (IOException e) {
            displayAndExit(portNumber);
        }
    }

    protected void displayAndExit(int portNumber) {
        System.err.println("Could not listen on port " + portNumber);
        System.exit(-1);
    }

    protected Socket acceptAndDisplaySocket(ServerSocket serverSocket) throws IOException {
        Socket clientSocket = serverSocket.accept();
        displaySocketData(clientSocket);
        return clientSocket;
    }

    protected void displaySocketData(Socket clientSocket) {
        System.out.println("Client connected from: " + clientSocket.getInetAddress().getHostAddress() + ":"
                + clientSocket.getPort());
    }

    protected void displaySocketInformation(int portNumber) {
        System.out.println(this.getClass().getName() + " server listening on port: " + portNumber);
    }

    protected void checkArguments(String[] args) {
        if (args.length != 1) {
            displayUsage();
            System.exit(1);
        }
    }

    protected void displayUsage() {
        System.err.println("Usage: java"+this.getClass().getName() +"<port number>");
    }


    private final void handleClient(Socket clientSocket) {
    	
    	preProcessClient(); // hook opcional
        
        try (
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));) {
          
        	processClientMessages(clientSocket, in, out); // nuevo método  (Long method -> Extract Method)

            logConnectionClosed(clientSocket); // nuevo método (Long method -> Extract Method)

        } catch (IOException e) {
            logException(e); // nuevo método (Long method -> Extract Method)
        } finally {
            closeSocket(clientSocket); // nuevo método (Long method -> Extract Method)
            
        	postProcessClient(); // hook opcional
        }
    }
    
    
    // métodos nuevos
    
    protected static void logException(IOException e) {
        System.err.println("Problem with communication with client: " + e.getMessage());
    }
    
    protected static void closeSocket(Socket clientSocket) {
        try {
            clientSocket.close();
        } catch (IOException e) {
            System.err.println("Error closing socket: " + e.getMessage());
        }
    }
    
    protected static void logConnectionClosed(Socket clientSocket) {
        System.out.println("Connection closed with " + clientSocket.getInetAddress().getHostAddress() + ":"
                + clientSocket.getPort());
    }

    protected void processClientMessages(Socket clientSocket, BufferedReader in, PrintWriter out) throws IOException {
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println("Received message: " + inputLine + " from "
                    + clientSocket.getInetAddress().getHostAddress() + ":" + clientSocket.getPort());

            if ((inputLine.equalsIgnoreCase(getCloseWord()))) {
                break; // Client requested to close the connection
            }
            handleMessage(inputLine, out);
        }
    }
    
    // 1. i:
    // hooks opcionales
    protected void preProcessClient() {}
    protected void postProcessClient() {}
    
    // 1. ii:
    // opción elegida
    // Un método (hook) que retorna un String que es la palabra de término de sesión.
    protected String getCloseWord() {
    	return "";
    }

}
