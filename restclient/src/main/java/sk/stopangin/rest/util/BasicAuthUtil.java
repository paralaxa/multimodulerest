package sk.stopangin.rest.util;

import org.apache.commons.codec.binary.Base64;

/**
 * Created by myPC on 5. 7. 2015.
 */
public class BasicAuthUtil {
    public static String createBasicAuthStringFromNameAndPassword(String name, String password){
        String plainCreds = name+":"+password;
        byte[] plainCredsBytes = plainCreds.getBytes();
        byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
        return "Basic "+new String(base64CredsBytes);
    }
}
