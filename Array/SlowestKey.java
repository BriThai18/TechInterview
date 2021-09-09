public class SlowestKey{
  public static char slowestKey(int[] releaseTimes, String keysPressed){
    int max = releaseTimes[0];
    char c = keysPressed.charAt(0);
    
    for(int i = 1; i < releaseTimes.length; i++){
      int temp = releaseTimes[i] - releaseTimes[i-1];
      if(temp > max || (temp == max && keysPressed.charAt(i) > c)){
        max = temp;
        c = keysPressed.charAt(i);
      }
    }
    return c; 
  }
}

//Runtime o(n)
