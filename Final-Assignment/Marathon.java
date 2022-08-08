public class Marathon {

  static String getTime(int seconds) {
    int minutes = seconds / 60;
    int sec = seconds - (minutes * 60);
    String time = minutes + " mins and " + sec + " seconds";
    return time;
  }

  static int getFastestRunner(String[] names, int[] times) {
    int lowest = times[0];
    int position = 0;
    for (int i = 0; i < times.length; i++) {
      if (lowest >= times[i]) {
        lowest = times[i];
        position = i;
      }
    }
    return position;
  }

  static int getSecondFastestRunner(String[] names, int[] times) {
    int position = getFastestRunner(names, times);
    int secondPosition = 0;
    int secondLowest = times[0];
    for (int i = 0; i < times.length; i++) {
        if (secondLowest >= times[i] && times[position] < times[i]) {
          secondLowest = times[i];
          secondPosition = i;
        }
      }
    return secondPosition;
  }

  public static void main(String[] arguments) {
    String[] names = {
      "Elena",
      "Thomas",
      "Hamilton",
      "Suzie",
      "Phil",
      "Matt",
      "Alex",
      "Emma",
      "John",
      "James",
      "Jane",
      "Emily",
      "Daniel",
      "Neda",
      "Aaron",
      "Kate",
    };
    int[] times = {
      341,
      273,
      278,
      329,
      445,
      402,
      388,
      275,
      243,
      334,
      412,
      393,
      299,
      343,
      317,
      265,
    };
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i] + ": " + times[i]);
    }
    System.out.println("Fastest Runner is: ");
    System.out.println(
      names[getFastestRunner(names, times)] +
      " at " +
      getTime(times[getFastestRunner(names, times)])
    );
    System.out.println("Second Fastest Runner is: ");
    System.out.println(
      names[getSecondFastestRunner(names, times)] +
      " at " +
      getTime(times[getSecondFastestRunner(names, times)])
    );
  }
}
