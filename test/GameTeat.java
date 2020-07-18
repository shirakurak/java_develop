package test;

import java.beans.Transient;

@RunWith(MockitoJunitRunner.class)
public class GameTeat {

  @Mock
  Player player;
  @InjectMocks
  Game game;

  @Test
  public void attackWithSwordTest() throws Exception {
    Mockito.when(player.getWeapon()).thenReturn("Sword");
    assrtEquals("Player attck with: Sword", game.attack());
  }
  
}