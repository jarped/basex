package org.basex.core.jobs;

import org.basex.query.*;
import org.basex.query.value.*;

/**
 * Cached job result.
 *
 * @author BaseX Team 2005-16, BSD License
 * @author Christian Gruen
 */
public final class JobResult {
  /** Query result. */
  public Value value;
  /** Exception. */
  public QueryException exception;
  /** Timestamp. */
  public long time;

  /**
   * Checks if the result is still valid.
   * @param seconds seconds to wait
   * @return result of check
   */
  public boolean valid(final int seconds) {
    return System.currentTimeMillis() - time >= seconds * 1000L;
  }

  /**
   * Checks if the query result is finished.
   * @return result of check
   */
  public boolean finished() {
    return time != 0;
  }
}
