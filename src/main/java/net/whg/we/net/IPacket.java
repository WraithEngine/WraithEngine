package net.whg.we.net;

/**
 * A data object which was received over a network socket to be handled.
 */
public interface IPacket
{
    /**
     * Called from the main thread to handle this packet.
     */
    void handle();
}
