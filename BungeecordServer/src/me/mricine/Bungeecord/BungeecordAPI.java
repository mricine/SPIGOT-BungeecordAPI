package me.mricine.Bungeecord;

import org.bukkit.entity.Player;
import org.bukkit.plugin.messaging.PluginMessageListener;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;


public class BungeecordAPI implements PluginMessageListener{
	public static void ConnectTo(String server, Player p) {
	ByteArrayDataOutput out = ByteStreams.newDataOutput();
	out.writeUTF("Connect");
	out.writeUTF(server);
		p.sendPluginMessage(Princ.getPlugin(Princ.class), "BungeeCord", out.toByteArray());
	}
	@Override
	  public void onPluginMessageReceived(String channel, Player player, byte[] message) {
	    if (!channel.equals("BungeeCord")) {
	      return;
	    }
	    ByteArrayDataInput in = ByteStreams.newDataInput(message);
	    String subchannel = in.readUTF();
	    if (subchannel.equals("SomeSubChannel")) {
	    }
	}
}


