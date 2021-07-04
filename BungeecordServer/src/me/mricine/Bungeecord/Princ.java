package me.mricine.Bungeecord;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.messaging.PluginMessageListener;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteStreams;

public class Princ extends JavaPlugin implements PluginMessageListener{
	
	 public void onEnable() {
		 this.getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
		    this.getServer().getMessenger().registerIncomingPluginChannel(this, "BungeeCord", new BungeecordAPI());
	 }
	 public void onDisable() {
		 
	 }
	 @Override
	  public void onPluginMessageReceived(String channel, Player player, byte[] message) {
	    if (!channel.equals("BungeeCord")) {
	      return;
	    }
	    ByteArrayDataInput in = ByteStreams.newDataInput(message);
	    String subchannel = in.readUTF();
	    if (subchannel.equals("SomeSubChannel")) {
	      // Use the code sample in the 'Response' sections below to read
	      // the data.
	    }
	}

}
