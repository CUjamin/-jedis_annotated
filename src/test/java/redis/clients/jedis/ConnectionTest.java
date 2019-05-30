package redis.clients.jedis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

import static org.junit.Assert.*;

/**
 * @Auther: cujamin
 * @Date: 2019/5/30 19:08
 * @Description:
 */
public class ConnectionTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getSocket() {
    }

    @Test
    public void getConnectionTimeout() {
    }

    @Test
    public void getSoTimeout() {
    }

    @Test
    public void setConnectionTimeout() {
    }

    @Test
    public void setSoTimeout() {
    }

    @Test
    public void setTimeoutInfinite() {
    }

    @Test
    public void rollbackTimeout() {
    }

    @Test
    public void sendCommand() {
    }

    @Test
    public void sendCommand1() {
    }

    @Test
    public void sendCommand2() {
    }

    @Test
    public void getHost() {
    }

    @Test
    public void setHost() {
    }

    @Test
    public void getPort() {
    }

    @Test
    public void setPort() {
    }

    @Test
    public void connect() throws IOException{
        Socket socket   = new Socket();
        socket.connect(new InetSocketAddress("127.0.0.1", 8090));
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("123456789".getBytes());
        outputStream.close();
    }

    @Test
    public void close() {
    }

    @Test
    public void disconnect() {
    }

    @Test
    public void isConnected() {
    }

    @Test
    public void getStatusCodeReply() {
    }

    @Test
    public void getBulkReply() {
    }

    @Test
    public void getBinaryBulkReply() {
    }

    @Test
    public void getIntegerReply() {
    }

    @Test
    public void getMultiBulkReply() {
    }

    @Test
    public void getBinaryMultiBulkReply() {
    }

    @Test
    public void resetPipelinedCount() {
    }

    @Test
    public void getRawObjectMultiBulkReply() {
    }

    @Test
    public void getObjectMultiBulkReply() {
    }

    @Test
    public void getIntegerMultiBulkReply() {
    }

    @Test
    public void getAll() {
    }

    @Test
    public void getAll1() {
    }

    @Test
    public void getOne() {
    }

    @Test
    public void isBroken() {
    }

    @Test
    public void flush() {
    }

    @Test
    public void readProtocolWithCheckingBroken() {
    }
}