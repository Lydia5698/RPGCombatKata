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
        assertThat(player.getAlive(), is(true));
    }

    @Test
    public void takeDamage(){
        Player hans = new Player();
        Player ute = new Player();
        Attack attack = new Attack();
        attack.makeDamage(hans,ute, 100);
        assertThat(ute.getHealth(), is(900));
        assertThat(hans.getHealth(), is(1000));
    }

    @Test
    public void takeTooMuchDamageAndDie(){
        Player hans = new Player();
        Player ute = new Player();
        Attack attack = new Attack();
        attack.makeDamage(hans, ute, 1000);
        assertThat(ute.getAlive(), is(false));
        assertThat(hans.getAlive(), is(true));
    }

    @Test
    public void playerCannotDamageItself(){
        Player player = new Player();
        Attack attack = new Attack();
        attack.makeDamage(player,player, 100);
        assertThat(player.getHealth(), is(1000));
    }

    @Test
    public void playerHealsHimself(){
        Player hans = new Player();
        Player ute = new Player();
        Attack attack = new Attack();
        // attack.makeDamage(hans, ute, 100);
        //attack.heal(ute,ute, 100);
        assertThat(ute.getHealth(), is(1000));
    }
}
