/* Note: This is a companion problem to the System Design problem: Design TinyURL.
 * TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl and it returns a short URL such as http://tinyurl.com/4e9iAk.
 * Design the encode and decode methods for the TinyURL service. There is no restriction on how your encode/decode algorithm should work. You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.
 * 
 */

package lc.q0535.EncodeandDecodeTinyURL;

import java.util.*;

public class Codec {
	long id=0;
	Map<String, String> map=new HashMap<String, String>();
	char[] ctb=new char[62];
	public Codec()
	{
		for(int i=0;i<10;i++)
			ctb[i]=(char)('0'+i);
		for(int i=0;i<26;i++)
			ctb[i+10]=(char)('a'+i);
		for(int i=0;i<26;i++)
			ctb[i+36]=(char)('A'+i);
	}
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        id++;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<6;i++)
        {
        	sb.insert(0, ctb[(int)(id%62)]);
        	id /= 62;
        }
        sb.insert(0, "http://tinyurl.com/");
        String shortUrl=sb.toString();
        map.put(shortUrl, longUrl);
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}
