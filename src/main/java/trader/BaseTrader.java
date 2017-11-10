package trader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import auto.tbot.PairDTO;

public abstract class BaseTrader {
	
	Map<String, Float> priceMap = new HashMap<String, Float>();
	
	public abstract void process(List<PairDTO> pairList);
}
