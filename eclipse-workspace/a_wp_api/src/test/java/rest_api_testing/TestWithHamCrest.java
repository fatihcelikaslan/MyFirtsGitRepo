package rest_api_testing;

import org.testng.annotations.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


public class TestWithHamCrest {
	
	@Test
	public void test1() {
		assertThat(4, equalTo(4));
		
	}
	
	

}
