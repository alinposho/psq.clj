package psq;

import clojure.lang.IPersistentStack;
import clojure.lang.ISeq;


public interface IPrioritySearchQueue extends IPersistentStack {

    <T> ISeq atMost(T priority);

    <L, H, P> ISeq atMostRange(L low, H high, P priority);

    <P> ISeq reverseAtMost(P priority);

    <L, H, P> ISeq reverseAtMostRange(L low, H high, P priority);
}
