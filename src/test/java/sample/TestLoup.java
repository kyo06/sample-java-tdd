package sample;

import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.Test;

public class TestLoup
{

	@Test
	public void testPositioninitialeAuNord()
	{
		Loup loup = new Loup();
		assertThat(Orientation.NORD).isEqualTo(loup.getOrientation());
	}


}
