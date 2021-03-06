package org.basex.core.locks;

import org.basex.core.jobs.*;

/**
 * Lock interface; will get obsolete after database locking has been finalized.
 *
 * @author BaseX Team 2005-16, BSD License
 * @author Christian Gruen
 */
public interface Locking {
  /**
   * Acquires locks for the specified job.
   * @param job job to be queued
   */
  void acquire(final Job job);

  /**
   * Removes locks for the specified job.
   * @param job job to be released
   */
  void release(final Job job);
}
