package wooteco.subway.admin.domain;

import java.util.function.Function;

public enum PathType {
    DISTANCE(LineStation::getDistance),
    DURATION(LineStation::getDuration);

    Function<LineStation, Integer> weight;

    PathType(Function<LineStation, Integer> weight) {
        this.weight = weight;
    }

    public int getWeight(LineStation lineStation) {
        return weight.apply(lineStation);
    }
}
