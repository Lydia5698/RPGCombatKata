import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


public class CombatTests {
    @Test
    public void createPlayerWithFullHealth(){
        Player player = new Player();
        assertThat(player.getHealth(), is(1000));
    }

    @Test
    public void createPlayerThatIsAlive(){
        Player player = new Player();
        assertThat(player.getStatus(), is("Alive"));
    }
}
