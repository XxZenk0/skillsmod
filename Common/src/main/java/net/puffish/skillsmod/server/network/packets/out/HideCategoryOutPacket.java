package net.puffish.skillsmod.server.network.packets.out;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.util.Identifier;
import net.puffish.skillsmod.network.OutPacket;
import net.puffish.skillsmod.network.Packets;

public class HideCategoryOutPacket extends OutPacket {
	public static HideCategoryOutPacket write(String categoryId) {
		var packet = new HideCategoryOutPacket();
		write(packet.buf, categoryId);
		return packet;
	}

	public static void write(PacketByteBuf buf, String categoryId) {
		buf.writeString(categoryId);
	}

	@Override
	public Identifier getIdentifier() {
		return Packets.HIDE_CATEGORY;
	}
}
