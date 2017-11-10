package auto.tbot;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.sun.jersey.api.client.Client;

import trader.BaseTrader;
import trader.SimpleTrader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    		String url = "https://wex.nz/api/3/ticker/btc_usd-eth_usd-ltc_usd-nmc_usd-nvc_usd-ppc_usd-dsh_usd-bch_usd-zec_usd?ignore_invalid=1";
    		float balance = 2000;
    		Client client = Client.create();
    		Gson gson = new Gson();
    		BaseTrader simpleTrader = new SimpleTrader();
        while (true) {
        		String res = client.resource(url).accept(MediaType.TEXT_PLAIN).get(String.class);
        		JsonObject obj = gson.fromJson(res, JsonObject.class);
        		List<PairDTO> pairList = parse(obj);
        		simpleTrader.process(pairList);
        		Thread.sleep(5000);
        }
    }

	private static List<PairDTO> parse(JsonObject obj) {
		List<PairDTO> pairList = new ArrayList<PairDTO>();
		return null;
	}
}
