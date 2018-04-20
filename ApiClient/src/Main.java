import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String args[]) {
		Api_Client api = new Api_Client("api connect key",
			"api secret key");
				
		HashMap<String, String> rgParams = new HashMap<String, String>();
		rgParams.put("order_currency", "BTC");
		rgParams.put("payment_currency", "KRW");
	
	
		try {
		    String result = api.callApi("/public/ticker", rgParams);
		    System.out.println(result);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		
		/*
		String result = api.callApi("/public/ticker", rgParams);
		System.out.println(result[1]);
		*/
				
		final Timer m_timer = new Timer();
		TimerTask m_task = new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("==== BTC 시세 ====");
			
				
				HashMap<String, String> result = new HashMap<String, String>();
				
				
				System.out.println(result);
				
			}
		};
		m_timer.schedule(m_task, 5000, 3000);
    }
}

