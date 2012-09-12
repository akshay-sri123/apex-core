/*
 *  Copyright (c) 2012 Malhar, Inc.
 *  All Rights Reserved.
 */
package com.malhartech.dag;

/**
 *
 * @author Chetan Narsude <chetan@malhar-inc.com>
 */
public class FailedOperationException extends Exception
{

  public FailedOperationException()
  {
    super();
  }

  public FailedOperationException(String message)
  {
    super(message);
  }

  public FailedOperationException(Throwable cause)
  {
    super(cause);
  }
}