package statistics;

import statistics.matcher.*;

public class Main {

    public static void main(String[] args) {
        Statistics stats = new Statistics(new PlayerReaderImpl("http://nhlstats-2013-14.herokuapp.com/players.txt"));

//        Matcher m = new And(new HasFewerThan(10, "goals"),
//                new HasFewerThan(10, "assists"),
//                new PlaysIn("PHI")
//        );
//        Matcher m = new Or(new HasFewerThan(5, "goals"),
//                new HasFewerThan(5, "assists")
//        );
//        Matcher m = new Not(new HasFewerThan(5, "goals"),
//                new PlaysIn("PHI"),
//                new PlaysIn("SJS"),
//                new PlaysIn("LAK"),
//                new PlaysIn("COL"),
//                new PlaysIn("CHI")
//        );
//        Matcher m = new And(new HasAtLeast(10, "goals"),
//                new HasAtLeast(10, "assists"),
//                new PlaysIn("PHI")
//        );
        QueryBuilder query = new QueryBuilder();

        Matcher m = query.playsIn("PIT")
                .hasAtLeast(34, "goals")
                .build();
//        Matcher m = query.oneOf(
//                query.playsIn("PHI")
//                .hasAtLeast(10, "goals")
//                .hasFewerThan(15, "assists").build(),
//                query.playsIn("EDM")
//                .hasAtLeast(10, "points").build()
//        ).build();
//        Matcher m1 = query.playsIn("PHI")
//                .hasAtLeast(10, "goals")
//                .hasFewerThan(15, "assists").build();
//
//        Matcher m2 = query.playsIn("EDM")
//                .hasAtLeast(50, "points").build();
//
//        Matcher m = query.oneOf(m1, m2).build();

        for (Player player : stats.matches(m)) {
            System.out.println(player);
        }

    }
}
