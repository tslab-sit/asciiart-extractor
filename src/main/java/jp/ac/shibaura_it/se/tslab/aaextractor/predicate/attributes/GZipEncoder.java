package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class GZipEncoder {
	public static byte[] encode(byte[] data) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			GZIPOutputStream gzipOut = new GZIPOutputStream(baos);
			gzipOut.write(data);
			gzipOut.close();
			byte[] result = baos.toByteArray();
			baos.close();
			return result;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new byte[0];
	}

	public static byte[] encode(String data) {
		return GZipEncoder.encode(data.getBytes());
	}
}
